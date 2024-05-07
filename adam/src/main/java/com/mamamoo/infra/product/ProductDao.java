package com.mamamoo.infra.product;

import java.util.List;

public interface ProductDao {
	// 자료조회
	public List<ProductDto> selectList(ProductVo vo);
	// 1건조회
	public ProductDto selectOne(ProductVo vo);
	// 입력
	public int insert(ProductDto dto);
	// 수정
	public int update(ProductDto dto);
	// 삭제
	public int delete(ProductDto dto);
}
