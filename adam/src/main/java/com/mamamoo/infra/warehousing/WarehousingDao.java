package com.mamamoo.infra.warehousing;

import java.util.List;

public interface WarehousingDao {
	// 자료조회
	public List<WarehousingDto> selectList(WarehousingVo vo);
	// 자료건수
	public int selectOneCount(WarehousingVo vo);
	// 1건조회
	public WarehousingDto selectOne(WarehousingDto dto);
	// 입력
	public int insert(WarehousingDto dto);
	// 수정
	public int update(WarehousingDto dto);
	// 삭제
	public int delete(WarehousingDto dto);
	// 입고 입고상태
	public WarehousingDto selectOneMotWarehousingNy(WarehousingDto dto);
	// 발주상세 입고상태 변경
	public int updateMotWarehousingNy(WarehousingDto dto);
	// 발주상세 입고상태
	public WarehousingDto selectOneMorWarehousingNy(WarehousingDto dto);
	// 발주 입고상태 변경
	public int updateMorWarehousingNy(WarehousingDto dto);
}
