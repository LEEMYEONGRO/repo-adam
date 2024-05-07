package com.mamamoo.infra.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {
	@Autowired
	StockDao dao;
	
	// 조회
	public List<StockDao> selectList(StockVo vo) {
		return dao.selectList(vo);
	};
	
	// 자료건수
	public int selectOneCount(StockVo vo) {
		return dao.selectOneCount(vo);
	};
}
