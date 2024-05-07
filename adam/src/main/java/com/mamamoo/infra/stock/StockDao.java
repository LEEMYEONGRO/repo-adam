package com.mamamoo.infra.stock;

import java.util.List;

public interface StockDao {
	// 조회
	public List<StockDao> selectList(StockVo vo);
	
	// 자료건수
	public int selectOneCount(StockVo vo);
}
