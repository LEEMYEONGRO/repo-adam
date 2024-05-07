package com.mamamoo.infra.orders;

import com.mamamoo.common.base.BaseVo;

public class OrdersVo extends BaseVo {

	private Integer shReleasedNy;			//출고여부

	public Integer getShReleasedNy() {
		return shReleasedNy;
	}

	public void setShReleasedNy(Integer shReleasedNy) {
		this.shReleasedNy = shReleasedNy;
	}

}
