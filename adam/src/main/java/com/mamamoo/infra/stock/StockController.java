package com.mamamoo.infra.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mamamoo.common.constants.Constants;
import com.mamamoo.common.util.UtilFunction;

@Controller
public class StockController {
	@Autowired
	StockService service;
	
	// 조회
	@RequestMapping(value = "/stockList")
	public String stockList(@ModelAttribute("vo") StockVo vo, Model model) throws Exception {
		UtilFunction.setSearch(vo);
		
		int rowCount = service.selectOneCount(vo);
		
		if(rowCount > 0) {
			vo.setPagingVo(rowCount);
			model.addAttribute("list", service.selectList(vo));
		};
		
		return Constants.PATH_STOCK + "stockList";
	}
	
	// 페이징 조회
	@RequestMapping(value = "/stockPaging")
	public String stockPaging(@ModelAttribute("vo") StockVo vo, Model model) throws Exception {
		int rowCount = service.selectOneCount(vo);
		
		if(rowCount > 0) {			
			vo.setPagingVo(rowCount);
			
			model.addAttribute("list", service.selectList(vo));
		};
		
		return Constants.PATH_STOCK + "stockListAjax";
	}

}
