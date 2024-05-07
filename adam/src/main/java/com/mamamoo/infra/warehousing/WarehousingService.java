package com.mamamoo.infra.warehousing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehousingService {
	@Autowired
	WarehousingDao dao;
	
	// 자료조회
	public List<WarehousingDto> selectList(WarehousingVo vo) {
		return dao.selectList(vo);
	};
	
	// 자료건수
	public int selectOneCount(WarehousingVo vo) {
		return dao.selectOneCount(vo);
	};
	
	// 1건조회
	public WarehousingDto selectOne(WarehousingDto dto) {
		return dao.selectOne(dto);
	}
	
	// 입력
	public int insert(WarehousingDto dto) {
		return dao.insert(dto);
	};
	
	// 수정
	public int update(WarehousingDto dto) {
		return dao.update(dto);
	};
	
	// 삭제
	public int delete(WarehousingDto dto) {
		return dao.delete(dto);
	};

	// 입고상태
	public WarehousingDto selectOneMotWarehousingNy(WarehousingDto dto) {
		return dao.selectOneMotWarehousingNy(dto);
	};
	
	// 발주정보 입고상태 변경
	public int updateMotWarehousingNy(WarehousingDto dto) {
		return dao.updateMotWarehousingNy(dto);
	};

	// 입고상태
	public WarehousingDto selectOneMorWarehousingNy(WarehousingDto dto) {
		return dao.selectOneMorWarehousingNy(dto);
	};
	
	// 발주정보 입고상태 변경
	public int updateMorWarehousingNy(WarehousingDto dto) {
		return dao.updateMorWarehousingNy(dto);
	};
}
