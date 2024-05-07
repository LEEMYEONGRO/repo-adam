package com.mamamoo.infra.code;

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
import com.mamamoo.infra.codegroup.CodeGroupService;


@Controller
public class CodeController {

	@Autowired
	CodeService service;
	
	@Autowired
	CodeGroupService codeGroupService;
	
	
//	전체리스트 @RequestParam(value = "page", defaultValue = "1") final int page) throws Exception {
	@RequestMapping(value = "/codeSdmList")
	public String codeListSdm(@ModelAttribute("vo") CodeVo vo, Model model) throws Exception {
			 
		UtilFunction.setSearch(vo);
		
		int rowCount = service.getCount(vo);
		
		if(rowCount > 0) {			
			vo.setPagingVo(rowCount);
			
			model.addAttribute("list", service.selectList(vo));
			
			/* setUrl(vo); */
		};

		model.addAttribute("listCodeGroupName", codeGroupService.selectListCodeGroup());
		
		return Constants.PATH_CODE + "codeSdmList";
	}
	
//	등록화면
	@RequestMapping(value = "/codeSdmCreate")
	public String codeSdmCreate(CodeDto dto, Model model) throws Exception {
		model.addAttribute("item", service.selectOne(dto));	
		return Constants.PATH_CODE + "codeSdmCreate";
	}
	
//	수정화면
	@RequestMapping(value = "/codeSdmForm")
	public String codeSdmForm(CodeDto dto, Model model) throws Exception {
		model.addAttribute("item", service.selectOne(dto));	
		return Constants.PATH_CODE + "codeSdmForm";
	}
	
//	코드등록
	@RequestMapping(value = "/codeSdmInsert")
	public String codeSdmInsert(CodeDto dto) throws Exception {
		service.insert(dto);
		return "redirect:/codeSdmList";
	}
	
//	코드수정
	@RequestMapping(value = "/codeSdmUpdate")
	public String codeSdmUpdate(CodeDto dto) throws Exception {
		service.update(dto);
		return "redirect:/codeSdmList";	
	}	
	
//	코드삭제
	@ResponseBody
	@RequestMapping(value = "/codeSdmDelete")
	public Map<String, Object> codeSdmDelete(CodeDto dto) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		if(service.delete(dto) == 1) {
			returnMap.put("rt", "success");
		} else {
			returnMap.put("rt", "fail");
		};
		
		return returnMap;
	}
	
//	코드 삭제여부 변경
	@RequestMapping(value = "/codeSdmUdtDelNy")
	public String codeSdmUdtDelNy(CodeDto dto) throws Exception {
		service.updateDelNy(dto);		
		return "redirect:/codeSdmList";	
	}
	
	// 다중 선택자료 삭제
	@ResponseBody
	@RequestMapping(value = "/codeSdmListDelete")
	public Map<String, Object> codeSdmListDelete(CodeVo vo) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		if(service.deleteList(vo) > 0) { 
			returnMap.put("rt", "success"); 
		} else {
			returnMap.put("rt", "fail");
		}
		  
		return returnMap;
	}
	
	// 조회조건 및 페이징정보 포함된 url 생성
	public void setUrl(CodeVo vo) throws Exception {
		UriComponents uri = UriComponentsBuilder.newInstance()
				.queryParam("shDelNy"      , vo.getShDelNy())
				.queryParam("shOptionDate" , vo.getShOptionDate())
				.queryParam("shDateStart"  , vo.getShDateStart())
				.queryParam("shDateEnd"    , vo.getShDateEnd())
				.queryParam("shOptionGroup", vo.getShOptionGroup())
				.queryParam("shOption"     , vo.getShOption())
				.queryParam("shValue"      , vo.getShValue())
				.build();
		vo.setUri("&"+uri.toUriString().substring(1, uri.toUriString().length()));
	}
	
}
