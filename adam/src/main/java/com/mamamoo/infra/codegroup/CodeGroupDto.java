package com.mamamoo.infra.codegroup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeGroupDto {
	private String 	cdgSeq;
	private String 	cdgName;
	private Date 	cdgRegDt;
	private Date 	cdgUdtDt;
	private Integer cdgDelNy;
		
	private Integer xcodeCount;

//	for cache
	public static List<CodeGroupDto> cachedCodeGroupArrayList = new ArrayList<CodeGroupDto>();
	
//	-----------
	
	public String getCdgSeq() {
		return cdgSeq;
	}

	public void setCdgSeq(String cdgSeq) {
		this.cdgSeq = cdgSeq;
	}

	public String getCdgName() {
		return cdgName;
	}

	public void setCdgName(String cdgName) {
		this.cdgName = cdgName;
	}

	public Date getCdgRegDt() {
		return cdgRegDt;
	}

	public void setCdgRegDt(Date cdgRegDt) {
		this.cdgRegDt = cdgRegDt;
	}

	public Date getCdgUdtDt() {
		return cdgUdtDt;
	}

	public void setCdgUdtDt(Date cdgUdtDt) {
		this.cdgUdtDt = cdgUdtDt;
	}

	public Integer getCdgDelNy() {
		return cdgDelNy;
	}

	public void setCdgDelNy(Integer cdgDelNy) {
		this.cdgDelNy = cdgDelNy;
	}

	public Integer getXcodeCount() {
		return xcodeCount;
	}

	public void setXcodeCount(Integer xcodeCount) {
		this.xcodeCount = xcodeCount;
	}
	
	public static List<CodeGroupDto> getCachedCodeGroupArrayList() {
		return cachedCodeGroupArrayList;
	}

	public static void setCachedCodeGroupArrayList(List<CodeGroupDto> cachedCodeGroupArrayList) {
		CodeGroupDto.cachedCodeGroupArrayList = cachedCodeGroupArrayList;
	}
}
