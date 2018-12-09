package com.hcl.planformapi.model;

import java.util.Date;

public class PlanFormApiModel {
	
	
	private Long strSeqNo;
	private String strPlanid;
	private Date dtplanfromDate;
	private Date dtplantoDate;
	private String strplanType;
	private String strplanName;
	
	public Long strLngSeqNo() {
		return strSeqNo;
	}
	public void setstrSeqNo(Long strSeqNo) {
		this.strSeqNo = strSeqNo;
	}
	public String getStrPlanid() {
		return strPlanid;
	}
	public void setStrPlanid(String strPlanid) {
		this.strPlanid = strPlanid;
	}
	public Date getDtplanfromDate() {
		return dtplanfromDate;
	}
	public void setDtplanfromDate(Date dtplanfromDate) {
		this.dtplanfromDate = dtplanfromDate;
	}
	public Date getDtplantoDate() {
		return dtplantoDate;
	}
	public void setDtplantoDate(Date dtplantoDate) {
		this.dtplantoDate = dtplantoDate;
	}
	public String getStrplanType() {
		return strplanType;
	}
	public void setStrplanType(String strplanType) {
		this.strplanType = strplanType;
	}
	public String getStrplanName() {
		return strplanName;
	}
	public void setStrplanName(String strplanName) {
		this.strplanName = strplanName;
	}
		
}
