package com.mamamoo.infra.members;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MembersDto {
	private String mbrSeq;
	private String mbrGbnCd;
	private String mbrClientCd;
	private String mbrClientName;
	private String mbrName;
	private String mbrGenderCd;
	private String mbrPhone;
	private String mbrTel;
	private String mbrBirthday;
	private String mbrDeptCd;
	private String mbrPosCd;
	private Date   mbrInDt;
	private Date   mbrOutDt;
	private String mbrCompNo;
	private String mbrZip;
	private String mbrAddr;
	private String mbrAddrDetail;
	private String mbrEmail;
	private String mbrPassWord;
	private String mbrDelNy;
	private Date   mbrRegDt;
	private Date   mbrUdtDt;
	
	private Integer xmbrCount;
	
	//	for cache
	public static List<MembersDto> cachedMembersArrayList = new ArrayList<MembersDto>();

	public String getMbrSeq() {
		return mbrSeq;
	}

	public void setMbrSeq(String mbrSeq) {
		this.mbrSeq = mbrSeq;
	}

	public String getMbrGbnCd() {
		return mbrGbnCd;
	}

	public void setMbrGbnCd(String mbrGbnCd) {
		this.mbrGbnCd = mbrGbnCd;
	}

	public String getMbrClientCd() {
		return mbrClientCd;
	}

	public void setMbrClientCd(String mbrClientCd) {
		this.mbrClientCd = mbrClientCd;
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

	public String getMbrGenderCd() {
		return mbrGenderCd;
	}

	public void setMbrGenderCd(String mbrGenderCd) {
		this.mbrGenderCd = mbrGenderCd;
	}

	public String getMbrPhone() {
		return mbrPhone;
	}

	public void setMbrPhone(String mbrPhone) {
		this.mbrPhone = mbrPhone;
	}

	public String getMbrTel() {
		return mbrTel;
	}

	public void setMbrTel(String mbrTel) {
		this.mbrTel = mbrTel;
	}

	public String getMbrBirthday() {
		return mbrBirthday;
	}

	public void setMbrBirthday(String mbrBirthday) {
		this.mbrBirthday = mbrBirthday;
	}

	public String getMbrDeptCd() {
		return mbrDeptCd;
	}

	public void setMbrDeptCd(String mbrDeptCd) {
		this.mbrDeptCd = mbrDeptCd;
	}

	public String getMbrPosCd() {
		return mbrPosCd;
	}

	public void setMbrPosCd(String mbrPosCd) {
		this.mbrPosCd = mbrPosCd;
	}

	public Date getMbrInDt() {
		return mbrInDt;
	}

	public void setMbrInDt(Date mbrInDt) {
		this.mbrInDt = mbrInDt;
	}

	public Date getMbrOutDt() {
		return mbrOutDt;
	}

	public void setMbrOutDt(Date mbrOutDt) {
		this.mbrOutDt = mbrOutDt;
	}

	public String getMbrCompNo() {
		return mbrCompNo;
	}

	public void setMbrCompNo(String mbrCompNo) {
		this.mbrCompNo = mbrCompNo;
	}

	public String getMbrZip() {
		return mbrZip;
	}

	public void setMbrZip(String mbrZip) {
		this.mbrZip = mbrZip;
	}

	public String getMbrAddr() {
		return mbrAddr;
	}

	public void setMbrAddr(String mbrAddr) {
		this.mbrAddr = mbrAddr;
	}

	public String getMbrAddrDetail() {
		return mbrAddrDetail;
	}

	public void setMbrAddrDetail(String mbrAddrDetail) {
		this.mbrAddrDetail = mbrAddrDetail;
	}

	public String getMbrEmail() {
		return mbrEmail;
	}

	public void setMbrEmail(String mbrEmail) {
		this.mbrEmail = mbrEmail;
	}

	public String getMbrPassWord() {
		return mbrPassWord;
	}

	public void setMbrPassWord(String mbrPassWord) {
		this.mbrPassWord = mbrPassWord;
	}

	public String getMbrDelNy() {
		return mbrDelNy;
	}

	public void setMbrDelNy(String mbrDelNy) {
		this.mbrDelNy = mbrDelNy;
	}

	public Date getMbrRegDt() {
		return mbrRegDt;
	}

	public void setMbrRegDt(Date mbrRegDt) {
		this.mbrRegDt = mbrRegDt;
	}

	public Date getMbrUdtDt() {
		return mbrUdtDt;
	}

	public void setMbrUdtDt(Date mbrUdtDt) {
		this.mbrUdtDt = mbrUdtDt;
	}

	public Integer getXmbrCount() {
		return xmbrCount;
	}

	public void setXmbrCount(Integer xmbrCount) {
		this.xmbrCount = xmbrCount;
	}

	public static List<MembersDto> getCachedMembersArrayList() {
		return cachedMembersArrayList;
	}

	public static void setCachedMembersArrayList(List<MembersDto> cachedMembersArrayList) {
		MembersDto.cachedMembersArrayList = cachedMembersArrayList;
	}
}
