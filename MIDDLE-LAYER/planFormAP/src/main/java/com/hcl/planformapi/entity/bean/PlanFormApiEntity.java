package com.hcl.planformapi.entity.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PLAN_FORM")
public class PlanFormApiEntity implements Serializable {

	private static final long serialVersionUID = 2891633271261849647L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plan_Sequence")
	@SequenceGenerator(name = "plan_Sequence", sequenceName = "PLANL_SEQ")
	private Long strSeqNo;
	
	@Column(name = "PLAN_ID")
	private String strPlanid;
	
	@Column(name = "PLAN_FROM_DATE")
	private Date dtplanfromDate;
	
	@Column(name = "PLAN_TO_DATE")
	private Date dtplantoDate;
	
	@Column(name = "PLAN_TYPE")
	private String strplanType;
	
	@Column(name = "PLAN_NAME")
	private String strplanName;
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
