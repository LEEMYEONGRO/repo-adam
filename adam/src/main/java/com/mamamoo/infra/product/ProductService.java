package com.mamamoo.infra.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductDao dao;
	
	// 자료조회
	public List<ProductDto> selectList(ProductVo vo) {
		return dao.selectList(vo);
	};
	
	// 1건조회
	public ProductDto selectOne(ProductVo vo) {
		return dao.selectOne(vo);
	}
	
	// 입력
	public int insert(ProductDto dto) {
		return dao.insert(dto);
	};
	
	// 수정
	public int update(ProductDto dto) {
		return dao.update(dto);
	};
	
	// 삭제
	public int delete(ProductDto dto) {
		return dao.delete(dto);
	};
}
