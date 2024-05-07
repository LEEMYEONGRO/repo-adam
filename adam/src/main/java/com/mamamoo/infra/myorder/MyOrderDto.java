package com.mamamoo.infra.myorder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mamamoo.infra.members.MembersDto;

public class MyOrderDto extends MembersDto{
	
	
	private String testmorSeq;
//	myorder 변수
	private String morSeq;				//발주순번
	private Date morDate;				//발주일시
	private Integer morWarehousingNy;	//입고여부(0:미입고, 1:입고, 2:일부입고)
	private Integer morDelNy;			//삭제여부
	private Date morRegDt;				//등록일시
	private Date morModDt;				//수정일시

	
//	myorderdetail 변수
	private String motSeq;				//발주상세순번
	private Integer motCompCd;			//발주처
	private Integer motCount;			//발주수량
	private Double motAmt;				//발주금액
	private Integer motWarehousingNy;	//입고구분(0:미입고, 1:입고, 2:일부입고)
	private Integer motDelNy;			//삭제여부
	private Date motRegDt;				//등록일시
	private Date motModDt;				//수정일시
	
	
	private Integer xmorCount;
	private String xRowNum;
	
	private String pdtName;
	private Integer pdtSeq;
	private Double pdtPrice;
	
	
	
	
	
	public String getxRowNum() {
		return xRowNum;
	}
	public void setxRowNum(String xRowNum) {
		this.xRowNum = xRowNum;
	}
	public String getTestmorSeq() {
		return testmorSeq;
	}
	public void setTestmorSeq(String testmorSeq) {
		this.testmorSeq = testmorSeq;
	}
	public String getMorSeq() {
		return morSeq;
	}
	public void setMorSeq(String morSeq) {
		this.morSeq = morSeq;
	}
	public Date getMorDate() {
		return morDate;
	}
	public void setMorDate(Date morDate) {
		this.morDate = morDate;
	}
	public Integer getMorWarehousingNy() {
		return morWarehousingNy;
	}
	public void setMorWarehousingNy(Integer morWarehousingNy) {
		this.morWarehousingNy = morWarehousingNy;
	}
	public Integer getMorDelNy() {
		return morDelNy;
	}
	public void setMorDelNy(Integer morDelNy) {
		this.morDelNy = morDelNy;
	}
	public Date getMorRegDt() {
		return morRegDt;
	}
	public void setMorRegDt(Date morRegDt) {
		this.morRegDt = morRegDt;
	}
	public Date getMorModDt() {
		return morModDt;
	}
	public void setMorModDt(Date morModDt) {
		this.morModDt = morModDt;
	}
	public String getMotSeq() {
		return motSeq;
	}
	public void setMotSeq(String motSeq) {
		this.motSeq = motSeq;
	}
	public Integer getMotCompCd() {
		return motCompCd;
	}
	public void setMotCompCd(Integer motCompCd) {
		this.motCompCd = motCompCd;
	}
	public Integer getMotCount() {
		return motCount;
	}
	public void setMotCount(Integer motCount) {
		this.motCount = motCount;
	}
	public Double getMotAmt() {
		return motAmt;
	}
	public void setMotAmt(Double motAmt) {
		this.motAmt = motAmt;
	}
	public Integer getMotWarehousingNy() {
		return motWarehousingNy;
	}
	public void setMotWarehousingNy(Integer motWarehousingNy) {
		this.motWarehousingNy = motWarehousingNy;
	}
	public Integer getMotDelNy() {
		return motDelNy;
	}
	public void setMotDelNy(Integer motDelNy) {
		this.motDelNy = motDelNy;
	}
	public Date getMotRegDt() {
		return motRegDt;
	}
	public void setMotRegDt(Date motRegDt) {
		this.motRegDt = motRegDt;
	}
	public Date getMotModDt() {
		return motModDt;
	}
	public void setMotModDt(Date motModDt) {
		this.motModDt = motModDt;
	}
	public Integer getXmorCount() {
		return xmorCount;
	}
	public void setXmorCount(Integer xmorCount) {
		this.xmorCount = xmorCount;
	}
	public String getPdtName() {
		return pdtName;
	}
	public void setPdtName(String pdtName) {
		this.pdtName = pdtName;
	}
	public Integer getPdtSeq() {
		return pdtSeq;
	}
	public void setPdtSeq(Integer pdtSeq) {
		this.pdtSeq = pdtSeq;
	}
	public Double getPdtPrice() {
		return pdtPrice;
	}
	public void setPdtPrice(Double pdtPrice) {
		this.pdtPrice = pdtPrice;
	} 
	
}
