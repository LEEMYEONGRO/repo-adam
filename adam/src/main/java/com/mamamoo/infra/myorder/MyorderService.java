package com.mamamoo.infra.myorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyorderService {
	
	
	@Autowired
	MyOrderDao dao;
	
	
//	발주 리스트
	public List<MyOrderDto> selectList(MyOrderVo vo)
	{
		return dao.selectList(vo);
	}
//	발주 수정 폼
	public MyOrderDto selectOne(MyOrderDto dto)
	{
		return dao.selectOne(dto);
	}
//	발주 등록
	public int myorderinsert(MyOrderDto dto)
	{
		return dao.myorderinsert(dto);
	}
//	발주 수정
	public int myorderUpdt(MyOrderDto dto)
	{
		return dao.myorderUpdt(dto);
	}
//	발주 삭제 
	public int myorderdelete(MyOrderDto dto)
	{
		return dao.myorderdelete(dto);
	}
//	발주 다중 삭제
	public int myorderListDelete(MyOrderVo vo)
	{
		return dao.myorderListDelete(vo);
	}
//	발주 ny변경
	public int myorderSelNY(MyOrderDto dto)
	{
		return dao.myorderSelNY(dto);
	}
//	삭제시 자식 요소 삭제
	public int myorderdeletechile(MyOrderDto dto)
	{
		return dao.myorderdeletechile(dto);
	}
//	체크된 자식요소 삭제
	public int myorderDetailListDeletechile(MyOrderVo vo)
	{
		return dao.myorderDetailListDeletechile(vo);
	}
	
	
	

//	발주 디테일 리스트
	public List<MyOrderDto> myorderdetailList(MyOrderVo vo)
	{
		return dao.myorderdetailList(vo);
	}
//	발주 디테일 수정폼 화면
	public MyOrderDto myorderdetailitem(MyOrderDto dto)
	{
		return dao.myorderdetailitem(dto);
	}

//	발주 디테일 등록
	public int myorderdetailinsert(MyOrderDto dto)
	{
		return dao.myorderdetailinsert(dto);
	}
//	발주 디테일 수정 
	public int myorderdetailupdt(MyOrderDto dto)
	{
		return dao.myorderdetailupdt(dto);
	}
//	발주 디테일 삭제
	public int myorderdetaildelete(MyOrderDto dto)
	{
		return dao.myorderdetaildelete(dto);
	}
//	발주 디테일 다중 삭제 
	public int myorderDetailListDelete(MyOrderVo vo)
	{
		return dao.myorderDetailListDelete(vo);
	}
//	발주 디테일 ny변경 
	public int myorderDetailSelNY(MyOrderDto dto)
	{
		return dao.myorderDetailSelNY(dto);
	}
	

	
	
	
//	발주 등록 발주사
	public List<MyOrderDto> clientNameList(MyOrderDto dto)
	{
		return dao.clientNameList(dto);
	}
//	제품 리스트
	public List<MyOrderDto> productList(MyOrderDto dto)
	{
		return dao.productList(dto);
	}
	
//	발주 카운트
	public int morCount(MyOrderVo vo)
	{
		return dao.morCount(vo);
	}
//	발주 디테일 카운트
	public int motCount(MyOrderVo vo)
	{
		return dao.motCount(vo);
	}

}
