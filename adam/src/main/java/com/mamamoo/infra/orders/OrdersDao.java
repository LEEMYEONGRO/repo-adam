package com.mamamoo.infra.orders;

import java.util.List;

public interface OrdersDao {
//	주문조회
	public List<OrdersDto> selectList(OrdersVo vo);
//	주문count
	public int getCount(OrdersVo vo);
//	상세주문조회
	public List<OrdersDto> selectListOrt(OrdersVo vo);
//	상세주문count
	public int getCountOrt(OrdersVo vo);
//	주문항목생성 시작
	public OrdersDto selectOne(OrdersDto dto);
//	주문항목수정
	public OrdersDto selectOneOrd(OrdersDto dto);
//	주문추가
	public int insertOrd(OrdersDto dto);
// 	상세주문추가
	public int insertOrt(OrdersDto dto);
//	주문등록 및 수정 고객사
	public List<OrdersDto> clientNameList(OrdersDto dto);
//	주문등록 및 수정 택배사
	public List<OrdersDto> courierServiceList(OrdersDto dto);
//	주문등록 및 수정제품
	public List<OrdersDto> productList(OrdersDto dto);
//	주문수정
	public int updateOrd(OrdersDto dto);
//	상세주문 수정
	public int updateOrt(OrdersDto dto);
//	주문 출고상세 상태
	public OrdersDto selectOneOrtReleaseNy(OrdersDto dto);
//	주문 출고여부 변경
	public int updateOrdReleasedNy(OrdersDto dto);
}
