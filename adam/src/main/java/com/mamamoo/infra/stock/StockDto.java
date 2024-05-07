package com.mamamoo.infra.stock;

public class StockDto {
	private Integer rowNum;			// 순번
	private String  mbrClientName; 	// 발주처명
	private String  pdtName; 		// 상품명
	private Integer pdtPrice;		// 단가
	private Integer sumMotQuentity;	// 발주수량
	private Integer sumMotAmt;		// 발주금액
	private Integer sumWshQuentity;	// 입고수량
	private Integer sumWshAmt;		// 입고금액
	private Integer sumOrtQuentity;	// 출고수량
	private Integer sumOrtAmt;		// 출고금액
	private Integer stkQuentity;	// 재고수량
	private Integer stkAmt;			// 재고금액
	
	public Integer getRowNum() {
		return rowNum;
	}
	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}
	public String getMbrClientName() {
		return mbrClientName;
	}
	public void setMbrClientName(String mbrClientName) {
		this.mbrClientName = mbrClientName;
	}
	public String getPdtName() {
		return pdtName;
	}
	public void setPdtName(String pdtName) {
		this.pdtName = pdtName;
	}
	public Integer getPdtPrice() {
		return pdtPrice;
	}
	public void setPdtPrice(Integer pdtPrice) {
		this.pdtPrice = pdtPrice;
	}
	public Integer getSumMotQuentity() {
		return sumMotQuentity;
	}
	public void setSumMotQuentity(Integer sumMotQuentity) {
		this.sumMotQuentity = sumMotQuentity;
	}
	public Integer getSumMotAmt() {
		return sumMotAmt;
	}
	public void setSumMotAmt(Integer sumMotAmt) {
		this.sumMotAmt = sumMotAmt;
	}
	public Integer getSumWshQuentity() {
		return sumWshQuentity;
	}
	public void setSumWshQuentity(Integer sumWshQuentity) {
		this.sumWshQuentity = sumWshQuentity;
	}
	public Integer getSumWshAmt() {
		return sumWshAmt;
	}
	public void setSumWshAmt(Integer sumWshAmt) {
		this.sumWshAmt = sumWshAmt;
	}
	public Integer getSumOrtQuentity() {
		return sumOrtQuentity;
	}
	public void setSumOrtQuentity(Integer sumOrtQuentity) {
		this.sumOrtQuentity = sumOrtQuentity;
	}
	public Integer getSumOrtAmt() {
		return sumOrtAmt;
	}
	public void setSumOrtAmt(Integer sumOrtAmt) {
		this.sumOrtAmt = sumOrtAmt;
	}
	public Integer getStkQuentity() {
		return stkQuentity;
	}
	public void setStkQuentity(Integer stkQuentity) {
		this.stkQuentity = stkQuentity;
	}
	public Integer getStkAmt() {
		return stkAmt;
	}
	public void setStkAmt(Integer stkAmt) {
		this.stkAmt = stkAmt;
	}
	
}
