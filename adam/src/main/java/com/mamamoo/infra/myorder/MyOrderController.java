package com.mamamoo.infra.myorder;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.mamamoo.common.constants.Constants;
import com.mamamoo.common.util.UtilFunction;
@Controller
public class MyOrderController {

	@Autowired
	MyorderService service;
	
	String str = "/infra/v1/myorder";
	
//	발주 리스트 페이지
	@RequestMapping(value = "/myorderList")
	public String myorderList(@ModelAttribute("vo") MyOrderVo vo, Model model)throws Exception
	{
		UtilFunction.setSearch(vo);
		
		int rowCount = service.morCount(vo);
		
		if(rowCount > 0)
		{
			vo.setPagingVo(rowCount);
			
			model.addAttribute("list", service.selectList(vo));
		}
		return Constants.PATH_MYORDER + "myorderList";
	}
	
	@RequestMapping(value = "/myorderlListAjax")
	public String myorderlListAjax(@ModelAttribute("vo") MyOrderVo vo, Model model)throws Exception
	{
		UtilFunction.setSearch(vo);
		int rowCount = service.morCount(vo);
		
		if(rowCount > 0)
		{
			vo.setPagingVo(rowCount);
			model.addAttribute("list", service.selectList(vo));
		}
		return Constants.PATH_MYORDER + "myorderlListAjax";
	}
	
//	발주 등록 페이지
	@RequestMapping(value = "/myorderCreate")
	public String myOrderSdmCreate()throws Exception
	{
		return Constants.PATH_MYORDER + "myorderCreate";
	}
	
//	발주 수정 페이지
	@RequestMapping(value = "/myorderForm")
	public String myorderForm(MyOrderDto dto,Model model)throws Exception
	{
		model.addAttribute("item", service.selectOne(dto));
		return Constants.PATH_MYORDER + "myorderForm";
	}
	
//	발주 등록
	@RequestMapping(value ="/myorderinsert")
	public String myorderinsert(MyOrderDto dto)throws Exception
	{
		service.myorderinsert(dto);
		return "redirect:myorderList";
	}
//	발주 수정
	@RequestMapping(value = "/myorderUpdt")
	public String myorderUpdt(MyOrderDto dto)throws Exception
	{
		service.myorderUpdt(dto);
		return "redirect:myorderList";
	}
//	발주 삭제 
	@RequestMapping(value= "/myorderdelete")
	public String myorderdelete(MyOrderDto dto)throws Exception
	{
		//service.myorderdeletechile(dto);
		service.myorderdelete(dto);
		return "redirect:myorderList";
	}
//	발주 다중 삭제
	@ResponseBody
	@RequestMapping(value = "/myorderListDelete")
	public Map<String, Object> myorderListDelete(MyOrderDto dto,MyOrderVo vo) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		//service.myorderDetailListDeletechile(vo);
		if(service.myorderListDelete(vo)>0)
		{
			service.myorderdeletechile(dto);
			returnMap.put("rt", "success");
		}else {
			returnMap.put("rt", "fail");
		}

		return returnMap;
	}
//	발주 ny 변경 
	@RequestMapping(value = "/myorderSelNY")
	public String myorderSelNY(MyOrderDto dto)throws Exception
	{
		service.myorderSelNY(dto);
		return "redirect:myorderList";
	}
	
	
	
//	발주 디테일 리스트 페이지
	@RequestMapping(value = "/myorderDetailList")
	public String myOrderDetailSdmList(@ModelAttribute("vo") MyOrderVo vo, Model model ) throws Exception
	{
		UtilFunction.setSearch(vo);
		int rowCount = service.motCount(vo);
		if(rowCount > 0)
		{
			vo.setPagingVo(rowCount);
			model.addAttribute("list", service.myorderdetailList(vo));
		}
		
		return Constants.PATH_MYORDER + "myorderDetailList";
	}
	
	@RequestMapping(value = "/myorderDetailListAjax")
	public String myorderDetailListAjax(@ModelAttribute("vo") MyOrderVo vo, Model model ) throws Exception
	{
		UtilFunction.setSearch(vo);
		int rowCount = service.motCount(vo);
		if(rowCount > 0)
		{
			vo.setPagingVo(rowCount);
			model.addAttribute("list", service.myorderdetailList(vo));
		}
		
		return Constants.PATH_MYORDER + "myorderDetailListAjax";
	}
	
//	발주 디테일 수정 페이지
	@RequestMapping(value= "/myorderDetailForm")
	public String myOrderDetailSdmForm(Model model, MyOrderDto dto)throws Exception
	{
		model.addAttribute("list", service.clientNameList(dto));
		model.addAttribute("pdtlist", service.productList(dto));
		model.addAttribute("item", service.myorderdetailitem(dto));
		return Constants.PATH_MYORDER + "myorderDetailForm";
	}
//	발주 디테일 등록 페이지
	@RequestMapping(value = "/myorderDetailCreate")
	public String myOrderDetailCreate(Model model,MyOrderDto dto) throws Exception
	{
		model.addAttribute("list", service.clientNameList(dto));
		model.addAttribute("pdtlist", service.productList(dto));
		return Constants.PATH_MYORDER + "myorderDetailCreate";
	}
//	발주 디테일 수정
	@RequestMapping(value = "/myorderdetailupdt")
	public String myorderdetailupdt(MyOrderDto dto) throws Exception
	{
		service.myorderdetailupdt(dto);
		return "redirect:/myorderDetailList";
	}
	
	
	

	
	
	
	
	
//	발주 디테일 insert 
	@ResponseBody
	@RequestMapping(value = "/myorderDetailInst")
	public Map<String, Object> myorderDetailInst(MyOrderDto dto) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		service.myorderdetailinsert(dto);
		returnMap.put("rt", "success");

		return returnMap;
	}
//	발주 디테일 삭제
	@RequestMapping(value = "/myorderdetaildelete")
	public String myorderdetaildelete(MyOrderDto dto) throws Exception
	{
		service.myorderdetaildelete(dto);
		return "redirect:/myorderDetailList";
	}
	
//	발주 디테일 ny 변경
	@RequestMapping(value ="myorderDetailSelNY")
	public String myorderDetailSelNY(MyOrderDto dto) throws Exception
	{
		service.myorderDetailSelNY(dto);
		return "redirect:/myorderDetailList";
	}
	
//	발주 디테일 다중 삭제
	@ResponseBody
	@RequestMapping(value = "/myorderDetailListDelete")
	public Map<String, Object> myorderDetailListDelete(MyOrderVo vo) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		if(service.myorderDetailListDelete(vo)>0)
		{
			returnMap.put("rt", "success");
		}else {
			returnMap.put("rt", "fail");
		}

		return returnMap;
	}
	
	
	public void setUrl(MyOrderVo vo) throws Exception {
		UriComponents uri = UriComponentsBuilder.newInstance()
				.queryParam("shDelNy"      , vo.getShDelNy())
				.queryParam("shOptionDate" , vo.getShOptionDate())
				.queryParam("shDateStart"  , vo.getShDateStart())
				.queryParam("shDateEnd"    , vo.getShDateEnd())
				.queryParam("shReceive"    , vo.getShReceive())
				.queryParam("shOption"     , vo.getShOption())
				.queryParam("shValue"      , vo.getShValue())
				.build();
		vo.setUri("&"+uri.toUriString().substring(1, uri.toUriString().length()));
	}
	
}
