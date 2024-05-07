package com.mamamoo.infra.codegroup;

import com.mamamoo.common.base.BaseVo;

public class CodeGroupVo extends BaseVo {
	
	private String seq;
	private Integer shOptionGroup;

//=============================================================================

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}
	
	public Integer getShOptionGroup() {
		return shOptionGroup;
	}

	public void setShOptionGroup(Integer shOptionGroup) {
		this.shOptionGroup = shOptionGroup;
	}	
}
