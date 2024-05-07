package com.mamamoo.infra.warehousing;

import java.util.Date;

public class WarehousingDto {
	private String  whsSeq;
	private Date    whsDate;
	private Integer whsCount;
	private Date    whsRegDt;
	private Date    whsModDt;
	private String  whsDelNy;
	private String  motSeq;
	 
	private String  xwhsPdtName;
	private Integer xwhsCount;
	private Date    xwhsMorDate;
	private String  xwhsMotSeq;
	private String  xwhsCompCdName;
	private Integer xwhsMotCount;
	private Integer xwhsMotAmt;
	private String  xwhsMorSeq;
	private String  xRowNum;
	private Integer xwhsCountTot;
	private String  xwhsMotWarehousingNy;
	
	private Integer xwhsSumWarehousing;  // 입고 총 수량
	private Integer xwhsRestWarehousing; // 입고 후 발주 잔량
	
	private Integer xwhsWarehousing_0; // 미입고
	private Integer xwhsWarehousing_1; // 입고완료
	private Integer xwhsWarehousing_2; // 부분입고
	
	public String getWhsSeq() {
		return whsSeq;
	}

	public void setWhsSeq(String whsSeq) {
		this.whsSeq = whsSeq;
	}

	public Date getWhsDate() {
		return whsDate;
	}

	public void setWhsDate(Date whsDate) {
		this.whsDate = whsDate;
	}

	public Integer getWhsCount() {
		return whsCount;
	}

	public void setWhsCount(Integer whsCount) {
		this.whsCount = whsCount;
	}

	public Date getWhsRegDt() {
		return whsRegDt;
	}

	public void setWhsRegDt(Date whsRegDt) {
		this.whsRegDt = whsRegDt;
	}

	public Date getWhsModDt() {
		return whsModDt;
	}

	public void setWhsModDt(Date whsModDt) {
		this.whsModDt = whsModDt;
	}

	public String getWhsDelNy() {
		return whsDelNy;
	}

	public void setWhsDelNy(String whsDelNy) {
		this.whsDelNy = whsDelNy;
	}

	public String getMotSeq() {
		return motSeq;
	}

	public void setMotSeq(String motSeq) {
		this.motSeq = motSeq;
	}

	public String getXwhsPdtName() {
		return xwhsPdtName;
	}

	public void setXwhsPdtName(String xwhsPdtName) {
		this.xwhsPdtName = xwhsPdtName;
	}

	public Integer getXwhsCount() {
		return xwhsCount;
	}

	public void setXwhsCount(Integer xwhsCount) {
		this.xwhsCount = xwhsCount;
	}

	public Date getXwhsMorDate() {
		return xwhsMorDate;
	}

	public void setXwhsMorDate(Date xwhsMorDate) {
		this.xwhsMorDate = xwhsMorDate;
	}

	public String getXwhsMotSeq() {
		return xwhsMotSeq;
	}

	public void setXwhsMotSeq(String xwhsMotSeq) {
		this.xwhsMotSeq = xwhsMotSeq;
	}

	public String getXwhsCompCdName() {
		return xwhsCompCdName;
	}

	public void setXwhsCompCdName(String xwhsCompCdName) {
		this.xwhsCompCdName = xwhsCompCdName;
	}

	public Integer getXwhsMotCount() {
		return xwhsMotCount;
	}

	public void setXwhsMotCount(Integer xwhsMotCount) {
		this.xwhsMotCount = xwhsMotCount;
	}

	public Integer getXwhsMotAmt() {
		return xwhsMotAmt;
	}

	public void setXwhsMotAmt(Integer xwhsMotAmt) {
		this.xwhsMotAmt = xwhsMotAmt;
	}

	public String getXwhsMorSeq() {
		return xwhsMorSeq;
	}

	public void setXwhsMorSeq(String xwhsMorSeq) {
		this.xwhsMorSeq = xwhsMorSeq;
	}

	public String getxRowNum() {
		return xRowNum;
	}

	public void setxRowNum(String xRowNum) {
		this.xRowNum = xRowNum;
	}

	public Integer getXwhsCountTot() {
		return xwhsCountTot;
	}

	public void setXwhsCountTot(Integer xwhsCountTot) {
		this.xwhsCountTot = xwhsCountTot;
	}

	public Integer getXwhsSumWarehousing() {
		return xwhsSumWarehousing;
	}

	public void setXwhsSumWarehousing(Integer xwhsSumWarehousing) {
		this.xwhsSumWarehousing = xwhsSumWarehousing;
	}

	public Integer getXwhsRestWarehousing() {
		return xwhsRestWarehousing;
	}

	public void setXwhsRestWarehousing(Integer xwhsRestWarehousing) {
		this.xwhsRestWarehousing = xwhsRestWarehousing;
	}

	public String getXwhsMotWarehousingNy() {
		return xwhsMotWarehousingNy;
	}

	public void setXwhsMotWarehousingNy(String xwhsMotWarehousingNy) {
		this.xwhsMotWarehousingNy = xwhsMotWarehousingNy;
	}

	public Integer getXwhsWarehousing_0() {
		return xwhsWarehousing_0;
	}

	public void setXwhsWarehousing_0(Integer xwhsWarehousing_0) {
		this.xwhsWarehousing_0 = xwhsWarehousing_0;
	}

	public Integer getXwhsWarehousing_1() {
		return xwhsWarehousing_1;
	}

	public void setXwhsWarehousing_1(Integer xwhsWarehousing_1) {
		this.xwhsWarehousing_1 = xwhsWarehousing_1;
	}

	public Integer getXwhsWarehousing_2() {
		return xwhsWarehousing_2;
	}

	public void setXwhsWarehousing_2(Integer xwhsWarehousing_2) {
		this.xwhsWarehousing_2 = xwhsWarehousing_2;
	}
	 
}
