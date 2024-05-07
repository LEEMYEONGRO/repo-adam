package com.mamamoo.infra.orders;

import java.util.Date;

public class OrdersDto {
	
// orders
	private String ordSeq;			//주문순번
	private Date ordDate;			//주문일시
	private Integer ordDelNy;		//삭제여부
	private Date ordRegDt;			//등록일시
	private Date ordModDt;			//수정일시
	private Integer ordReleasedNy;	//출고여부(0:미출고, 1:출고, 2:일부출고)
	private String mbrSeq;			//회원순번
// orders
	
// orderdetail
	private String ortSeq;			
	private String ortCompCd;		//주문처
	private String ortCount;		//주문수량
	private Double ortAmt;			//주문금액
	private String ortShippingCd;	//배송처
	private Date ortReleaseDt;		//출고일자
	private Integer ortReleaseNy;	//출고여부(0:미출고, 1:출고)
	private Integer ortDelNy;		//삭제여부
	private Date ortRegDt;			//등록일시
	private Date ortModDt;			//수정일시
	private String pdtSeq;			//상품순번
// orderdetail

// product
	private String pdtName; 		//상품평
	private Double pdtPrice;		//상품단가
// product
	
// members	
	private String mbrClientName;	//거래처명
	private String mbrName;			//거래처성명
	private String xmbrClientName;	//배송처명
	private String xmbrName;		//배송처성명
// members

//	미출고, 출고완료, 일부출고
	private Integer xorderdetail_0; // 미출고
	private Integer xordortCount;
//	private Integer xorderdetail_2; // 출고
//	private Integer xorderdetail_3; // 일부출고
//	미출고, 출고완료, 일부출고
	
	public String getOrdSeq() {
		return ordSeq;
	}
	
	public void setOrdSeq(String ordSeq) {
		this.ordSeq = ordSeq;
	}
	
	public Date getOrdDate() {
		return ordDate;
	}
	
	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}
	
	public Integer getOrdDelNy() {
		return ordDelNy;
	}
	
	public void setOrdDelNy(Integer ordDelNy) {
		this.ordDelNy = ordDelNy;
	}
	
	public Date getOrdRegDt() {
		return ordRegDt;
	}
	
	public void setOrdRegDt(Date ordRegDt) {
		this.ordRegDt = ordRegDt;
	}
	
	public Date getOrdModDt() {
		return ordModDt;
	}
	
	public void setOrdModDt(Date ordModDt) {
		this.ordModDt = ordModDt;
	}
	
	public Integer getOrdReleasedNy() {
		return ordReleasedNy;
	}

	public void setOrdReleasedNy(Integer ordReleasedNy) {
		this.ordReleasedNy = ordReleasedNy;
	}

	public String getMbrSeq() {
		return mbrSeq;
	}
	
	public void setMbrSeq(String mbrSeq) {
		this.mbrSeq = mbrSeq;
	}
	
	public String getOrtSeq() {
		return ortSeq;
	}
	
	public void setOrtSeq(String ortSeq) {
		this.ortSeq = ortSeq;
	}
	
	public String getOrtCompCd() {
		return ortCompCd;
	}
	
	public void setOrtCompCd(String ortCompCd) {
		this.ortCompCd = ortCompCd;
	}
	
	public String getOrtCount() {
		return ortCount;
	}
	
	public void setOrtCount(String ortCount) {
		this.ortCount = ortCount;
	}
	
	public Double getOrtAmt() {
		return ortAmt;
	}
	
	public void setOrtAmt(Double ortAmt) {
		this.ortAmt = ortAmt;
	}
	
	public String getOrtShippingCd() {
		return ortShippingCd;
	}
	
	public void setOrtShippingCd(String ortShippingCd) {
		this.ortShippingCd = ortShippingCd;
	}
	
	public Date getOrtReleaseDt() {
		return ortReleaseDt;
	}
	
	public void setOrtReleaseDt(Date ortReleaseDt) {
		this.ortReleaseDt = ortReleaseDt;
	}
	
	public Integer getOrtReleaseNy() {
		return ortReleaseNy;
	}
	
	public void setOrtReleaseNy(Integer ortReleaseNy) {
		this.ortReleaseNy = ortReleaseNy;
	}
	
	public Integer getOrtDelNy() {
		return ortDelNy;
	}
	
	public void setOrtDelNy(Integer ortDelNy) {
		this.ortDelNy = ortDelNy;
	}
	
	public Date getOrtRegDt() {
		return ortRegDt;
	}
	
	public void setOrtRegDt(Date ortRegDt) {
		this.ortRegDt = ortRegDt;
	}
	
	public Date getOrtModDt() {
		return ortModDt;
	}
	
	public void setOrtModDt(Date ortModDt) {
		this.ortModDt = ortModDt;
	}
	
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

	public String getMbrClientName() {
		return mbrClientName;
	}

	public void setMbrClientName(String mbrClientName) {
		this.mbrClientName = mbrClientName;
	}

	public String getMbrName() {
		return mbrName;
	}

	public void setMbrName(String mbrName) {
		this.mbrName = mbrName;
	}
	
	public String getXmbrClientName() {
		return xmbrClientName;
	}

	public void setXmbrClientName(String xmbrClientName) {
		this.xmbrClientName = xmbrClientName;
	}

	public String getXmbrName() {
		return xmbrName;
	}

	public void setXmbrName(String xmbrName) {
		this.xmbrName = xmbrName;
	}

	public Integer getXorderdetail_0() {
		return xorderdetail_0;
	}

	public void setXorderdetail_0(Integer xorderdetail_0) {
		this.xorderdetail_0 = xorderdetail_0;
	}

	public Integer getXordortCount() {
		return xordortCount;
	}

	public void setXordortCount(Integer xordortCount) {
		this.xordortCount = xordortCount;
	}

	
	
	
}
