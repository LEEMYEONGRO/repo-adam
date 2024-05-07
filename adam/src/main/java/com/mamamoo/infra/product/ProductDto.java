package com.mamamoo.infra.product;

import java.util.Date;

public class ProductDto {
	private String pdtSeq;
	private String pdtName;
	private Double pdtPrice;
	private Date   pdtRegDt;
	private Date   pdtModDt;
	private String pdtDelNy;
	private String mbrSeq;
	
	private Integer xpdtCount;

	public String getPdtSeq() {
		return pdtSeq;
	}

	public void setPdtSeq(String pdtSeq) {
		this.pdtSeq = pdtSeq;
	}

	public String getPdtName() {
		return pdtName;
	}

	public void setPdtName(String pdtName) {
		this.pdtName = pdtName;
	}

	public Double getPdtPrice() {
		return pdtPrice;
	}

	public void setPdtPrice(Double pdtPrice) {
		this.pdtPrice = pdtPrice;
	}

	public Date getPdtRegDt() {
		return pdtRegDt;
	}

	public void setPdtRegDt(Date pdtRegDt) {
		this.pdtRegDt = pdtRegDt;
	}

	public Date getPdtModDt() {
		return pdtModDt;
	}

	public void setPdtModDt(Date pdtModDt) {
		this.pdtModDt = pdtModDt;
	}

	public String getPdtDelNy() {
		return pdtDelNy;
	}

	public void setPdtDelNy(String pdtDelNy) {
		this.pdtDelNy = pdtDelNy;
	}

	public String getMbrSeq() {
		return mbrSeq;
	}

	public void setMbrSeq(String mbrSeq) {
		this.mbrSeq = mbrSeq;
	}

	public Integer getXpdtCount() {
		return xpdtCount;
	}

	public void setXpdtCount(Integer xpdtCount) {
		this.xpdtCount = xpdtCount;
	}
}
