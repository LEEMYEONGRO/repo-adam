package com.mamamoo.infra.myorder;

import java.util.List;

public interface MyOrderDao {
//	발주 리스트
	public List<MyOrderDto> selectList(MyOrderVo vo);
	public MyOrderDto selectOne(MyOrderDto dto);
	public int morCount(MyOrderVo vo);
//	발주 수정
	public int myorderUpdt(MyOrderDto dto);
//	발주 등록 
	public int myorderinsert(MyOrderDto dto);
//	발주 삭제
	public int myorderdelete(MyOrderDto dto);
//	발주 다중 삭제
	public int myorderListDelete(MyOrderVo vo);
//	발주 ny 변경
	public int myorderSelNY(MyOrderDto dto);
//	삭제시 자식요소 삭제
	public int myorderdeletechile(MyOrderDto dto);
//	체크된 자식요소 삭제
	public int myorderDetailListDeletechile(MyOrderVo vo);

	
	
//	발주 디테일 리스트
	public List<MyOrderDto> myorderdetailList(MyOrderVo vo);
	public int motCount(MyOrderVo vo);
	
//	발주디테일 수종폼 화면
	public MyOrderDto myorderdetailitem(MyOrderDto dto);
	
//	발주등록 발주사
	public List<MyOrderDto> clientNameList(MyOrderDto dto);
//	발주등록 제품
	public List<MyOrderDto> productList(MyOrderDto dto);
	
	
//	발주 디테일 등록 
	public int myorderdetailinsert(MyOrderDto dto);
//	발주 디테일 수정 업데이트
	public int myorderdetailupdt(MyOrderDto dto);
//	발주 디테일 삭제
	public int myorderdetaildelete(MyOrderDto dto);
//	발주 디테일 다중 삭제
	public int myorderDetailListDelete(MyOrderVo vo);
//	발주 디테일 ny변경
	public int myorderDetailSelNY(MyOrderDto dto);

	
	
	
}
