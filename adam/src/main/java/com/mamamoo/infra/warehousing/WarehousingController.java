package com.mamamoo.infra.warehousing;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mamamoo.common.constants.Constants;
import com.mamamoo.common.util.UtilFunction;

@Controller
public class WarehousingController {
	@Autowired
	WarehousingService service;
	
	// 조회
	@RequestMapping(value = "/warehousingList")
	public String warehousingList(@ModelAttribute("vo") WarehousingVo vo, Model model) throws Exception {
			 
		UtilFunction.setSearch(vo);
		
		int rowCount = service.selectOneCount(vo);
		
		if(rowCount > 0) {			
			vo.setPagingVo(rowCount);
			
			model.addAttribute("list", service.selectList(vo));
		};

		return Constants.PATH_WAREHOUSING + "warehousingList";
	}

	// 페이징 조회
	@RequestMapping(value = "/warehousingPaging")
	public String warehousingPaging(@ModelAttribute("vo") WarehousingVo vo, Model model) throws Exception {
		
		UtilFunction.setSearch(vo);
		
		int rowCount = service.selectOneCount(vo);
		
		if(rowCount > 0) {			
			vo.setPagingVo(rowCount);
			
			model.addAttribute("list", service.selectList(vo));
		};
		
		return Constants.PATH_WAREHOUSING + "warehousingListAjax";
	}
	
	// 등록페이지 호출
	@RequestMapping(value = "/warehousingCreate")
	public String warehousingCreate(WarehousingDto dto, Model model) throws Exception {
		model.addAttribute("item", service.selectOne(dto));
		return Constants.PATH_WAREHOUSING + "warehousingForm";
	}
	
	// 등록
	@RequestMapping(value = "/warehousingInsert")
	public String warehousingInsert(WarehousingDto dto) throws Exception {
		// 등록
		service.insert(dto);
		
		// 입고상태 변경
		upDateMotWarehousing(dto);
		return "redirect:/warehousingList";
	}
	
	// 수정페이지 호출
	@RequestMapping(value = "/warehousingForm")
	public String warehousingForm(WarehousingDto dto, Model model) throws Exception {
		model.addAttribute("item", service.selectOne(dto));
		return Constants.PATH_WAREHOUSING + "warehousingForm";
	}
	
	// 수정
	@RequestMapping(value = "/warehousingUpdate")
	public String warehousingUpdate(WarehousingDto dto) throws Exception {
		// 수정
		service.update(dto);
		
		// 입고상태 변경
		upDateMotWarehousing(dto);
		
		return "redirect:/warehousingList";
	}
	
	// 발주상세 입고상태 변경
	public void upDateMotWarehousing(WarehousingDto dto) {
		String xwhsMorSeq = dto.getXwhsMorSeq();
		String xwhsMotSeq = dto.getXwhsMotSeq();
		
		// 발주상세 입고상태를 확인하기 위한 조회
		dto = service.selectOneMotWarehousingNy(dto);
		dto.setXwhsMorSeq(xwhsMorSeq);
		dto.setXwhsMotSeq(xwhsMotSeq);
		
		// 발주상세 입고상태 설정
		if(dto.getXwhsSumWarehousing() == 0) {
			dto.setXwhsMotWarehousingNy("0"); // 미입고
		} else if(dto.getXwhsSumWarehousing() >= 0 && dto.getXwhsRestWarehousing() == 0) {
			dto.setXwhsMotWarehousingNy("1"); // 입고완료
		} else if(dto.getXwhsSumWarehousing() >= 0 && dto.getXwhsRestWarehousing() != 0) {
			dto.setXwhsMotWarehousingNy("2"); // 부분입고
		};
		
		// 발주상세 입고상태 변경
		service.updateMotWarehousingNy(dto);
		
		// 발주 입고상태 변경
		upDateMorWarehousing(dto);
	}
	
	// 발주 입고상태 변경
	public void upDateMorWarehousing(WarehousingDto dto) {
		String xwhsMorSeq = dto.getXwhsMorSeq();
		String xwhsMotSeq = dto.getXwhsMotSeq();
		
		// 발주 입고상태를 확인하기 위한 조회
		dto = service.selectOneMorWarehousingNy(dto);
		dto.setXwhsMorSeq(xwhsMorSeq);
		dto.setXwhsMotSeq(xwhsMotSeq);
		
		// 발주 입고상태 설정
		if(dto.getXwhsWarehousing_2() > 0) {
			dto.setXwhsMotWarehousingNy("2"); // 부분입고
		} else if(dto.getXwhsWarehousing_2() == 0 && dto.getXwhsWarehousing_1() == 0) {
			dto.setXwhsMotWarehousingNy("0"); // 미입고
		} else if(dto.getXwhsWarehousing_2() == 0 && dto.getXwhsWarehousing_0() == 0 && dto.getXwhsWarehousing_1() > 0) {
			dto.setXwhsMotWarehousingNy("1"); // 입고완료
		};
		
		// 발주 입고상태 변경
		service.updateMorWarehousingNy(dto);
	}
	
	// 삭제
	@ResponseBody
	@RequestMapping(value = "/warehousingDelete")
	public Map<String, Object> warehousingDelete(WarehousingDto dto) throws Exception {
		// 삭제
		service.delete(dto);
		
		// 입고상태 변경
		upDateMotWarehousing(dto);
		
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("rt", "success");
		return returnMap;
	}
}
