package com.mamamoo.infra.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mamamoo.common.constants.Constants;
import com.mamamoo.common.util.UtilFunction;
import com.mamamoo.infra.code.CodeDto;
import com.mamamoo.infra.warehousing.WarehousingDto;

@Controller
public class OrdersController {
	@Autowired
	OrdersService service;
	
// 주문 리스트
	@RequestMapping(value = "/orderList")
	public String ordersList(@ModelAttribute("vo") OrdersVo vo, OrdersDto dto, Model model)throws Exception {
		
		UtilFunction.setSearch(vo);
		
		int rowCount = service.getCount(vo);
		
		if(rowCount > 0) {			
			vo.setPagingVo(rowCount);
			
			model.addAttribute("list", service.selectList(vo));
			
		};
		
		return Constants.PATH_ORDERS + "orderList";
	}
//	주문 페이징리스트
	@RequestMapping(value = "/orderListAjax")
	public String orderListAjax(@ModelAttribute("vo") OrdersVo vo, OrdersDto dto, Model model)throws Exception {
		
		UtilFunction.setSearch(vo);
		
		int rowCount = service.getCount(vo);
		
		if(rowCount > 0) {			
			vo.setPagingVo(rowCount);
			
			model.addAttribute("list", service.selectList(vo));
			
		};
		
		return Constants.PATH_ORDERS + "orderListAjax";
	}
	
// 상세주문리스트
	@RequestMapping(value = "/orderDetailList")
	public String orderDetailList(@ModelAttribute("vo") OrdersVo vo, OrdersDto dto, Model model)throws Exception {
		
		UtilFunction.setSearch(vo);
		
		int rowCount = service.getCountOrt(vo);
		
		if(rowCount > 0) {			
			vo.setPagingVo(rowCount);
			
			model.addAttribute("list", service.selectListOrt(vo));
			
		};
		
		return Constants.PATH_ORDERS + "orderDetailList";
	}
	
//	상세주문 리스트 페이징
	@RequestMapping(value = "/orderDetailListAjax")
	public String orderDetailListAjax(@ModelAttribute("vo") OrdersVo vo, OrdersDto dto, Model model)throws Exception {
		
		UtilFunction.setSearch(vo);
		
		int rowCount = service.getCountOrt(vo);
		
		if(rowCount > 0) {			
			vo.setPagingVo(rowCount);
			
			model.addAttribute("list", service.selectListOrt(vo));
			
		};
		
		return Constants.PATH_ORDERS + "orderDetailListAjax";
	}
	
//	상세주문등록화면
	@RequestMapping(value = "/orderDetailCreate")
	public String orderDetailCreate(OrdersDto dto, Model model) throws Exception {
	
		model.addAttribute("list", service.clientNameList(dto));
		model.addAttribute("pdtlist", service.productList(dto));
		
		return Constants.PATH_ORDERS + "orderDetailCreate";
	}
	
//	주문수정화면
	@RequestMapping(value = "/orderForm")
	public String orderForm(OrdersDto dto, Model model) throws Exception {
		
		model.addAttribute("itemOrd", service.selectOneOrd(dto));
		
		return Constants.PATH_ORDERS + "orderForm";
	}
	
	
//	상세주문수정화면
	@RequestMapping(value = "/orderDetailForm")
	public String orderDetailForm(OrdersDto dto, Model model) throws Exception {
		
		model.addAttribute("item", service.selectOne(dto));
		model.addAttribute("list", service.clientNameList(dto));
		model.addAttribute("pdtlist", service.productList(dto));
		model.addAttribute("courierList", service.courierServiceList(dto));
		
		return Constants.PATH_ORDERS + "orderDetailForm";
	}
	
	
	
	
//	주문등록
	@RequestMapping(value = "/orderInsert")
	public String orderInsert(OrdersDto dto) throws Exception {
		
		service.insertOrd(dto);
		
		return "redirect:/orderList";
	}
	
//	상세주문등록
	@RequestMapping(value = "/ortInsert")
	public String ortInsert(OrdersDto dto) throws Exception {
		
		service.insertOrt(dto);
		
		return "redirect:/orderList";
	}
	
//	상세주문수정
	@RequestMapping(value = "/updateOrt")
	public String updateOrt(OrdersDto dto, OrdersDto isDto) throws Exception {
		System.out.println(dto.getOrdSeq() + "----------------------------------------");
		service.updateOrt(dto);
		
		// 출고상태 변경
		
		isDto = service.selectOneOrtReleaseNy(dto);
		
		// 주문, 주문상세 출고상태 설정
		if(isDto != null) {
			if(isDto.getXorderdetail_0() == 0) {
				dto.setOrdReleasedNy(0); // 미입고
			} else if(isDto.getXordortCount() == isDto.getXorderdetail_0()) {
				dto.setOrdReleasedNy(1); // 입고완료
			} else {
				dto.setOrdReleasedNy(2); // 부분입고
			};
			
			// 주문상세 출고상태 변경
			service.updateOrdReleasedNy(dto);			
		}
		
		return "redirect:/orderDetailList";
	}
	
	


}
