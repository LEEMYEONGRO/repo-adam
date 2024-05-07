package com.mamamoo.infra.codegroup;

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
public class CodeGroupController {
	
	@Autowired
	CodeGroupService service;
	
//	전체리스트
	@RequestMapping(value = "/codeGroupSdmList")
	public String codeGroupListSdm(@ModelAttribute("vo") CodeGroupVo vo, Model model) throws Exception {
		
		UtilFunction.setSearch(vo);
		
		int rowCount = service.getCount(vo);
		
		if(rowCount > 0) {			
			vo.setPagingVo(rowCount);
			
			model.addAttribute("list", service.selectList(vo));
			
			/* setUrl(vo); */
		};
		
		// 코드그룹 select option 쿼리
		model.addAttribute("listCodeGroupName", service.selectListCodeGroup());
		
		return Constants.PATH_CODE_GROUP + "codeGroupSdmList";
	}
	
//	수정화면
	@RequestMapping(value = "/codeGroupSdmForm")
	public String codeGroupSdmForm(CodeGroupDto dto, Model model) throws Exception {
		model.addAttribute("item", service.selectOne(dto));	
		return Constants.PATH_CODE_GROUP + "codeGroupSdmForm";
	}
	
//	등록화면
	@RequestMapping(value = "/codeGroupSdmCreate")
	public String codeGroupSdmCreate() throws Exception {
		return Constants.PATH_CODE_GROUP + "codeGroupSdmCreate";
	}	
	
//	그룹코드등록
	@RequestMapping(value = "/codeGroupSdmInsert")
	public String codeGroupSdmInsert(CodeGroupDto dto) throws Exception {
		service.insert(dto);
		return "redirect:/codeGroupSdmList";
	}
	
//	그룹코드수정
	@RequestMapping(value = "/codeGroupSdmUpdate")
	public String codeGroupSdmUpdate(CodeGroupDto dto) throws Exception {
		service.update(dto);
		return "redirect:/codeGroupSdmList";	
	}	
	
//	그룹코드삭제
	@RequestMapping(value = "/codeGroupSdmDelete")
	public String codeGroupSdmDelete(CodeGroupDto dto) throws Exception {
		service.delete(dto);
		return "redirect:/codeGroupSdmList";
	}
	
//	그룹코드 삭제여부 변경         
	@RequestMapping(value = "/codeGroupSdmUdtDelNy")
	public String codeGroupSdmUdtDelNy(CodeGroupDto dto) throws Exception {
		service.updateDelNy(dto);
		return "redirect:/codeGroupSdmList";
	}
	
	// 다중 선택자료 삭제
	@ResponseBody
	@RequestMapping(value = "/codeGroupSdmListDelete")
	public Map<String, Object> codeGroupSdmListDelete(CodeGroupVo vo) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		if(service.deleteList(vo) > 0) { 
			returnMap.put("rt", "success"); 
		} else {
			returnMap.put("rt", "fail");
		}
		  
		return returnMap;
	}
	
	// 조회조건 및 페이징정보 포함된 url 생성
	public void setUrl(CodeGroupVo vo) throws Exception {
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
