package com.hcl.student.entity.bean;

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
@Table(name = "STUDENT_REGISTRATION")
public class StudentRegistrationEntity implements Serializable {

	private static final long serialVersionUID = 2891633271261849647L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_Sequence")
	@SequenceGenerator(name = "student_Sequence", sequenceName = "STUDENT_SEQ")
	private Long strStuId;

	@Column(name = "STUDENT_NAME")
	private String strStuName;

	@Column(name = "STUDENT_F_NAME")
	private String strStuFatherName;

	@Column(name = "STUDENT_CURR_ADD1")
	private String strStuCurrentAdd1;

	@Column(name = "STUDENT_CURR_ADD2")
	private String strStuCurrentAdd2;

	@Column(name = "STUDENT_CURR_STATE")
	private String strStuCurrentState;

	@Column(name = "STUDENT_CURR_PIN_CODE")
	private Long lngStuCurrentPinCode;

	@Column(name = "STUDENT_PER_ADD1")
	private String strStuPerAdd1;

	@Column(name = "STUDENT_PER_ADD2")
	private String strStuPerAdd2;

	@Column(name = "STUDENT_PER_STATE")
	private String strStuPerState;

	@Column(name = "STUDENT_PER_PIN_CODE")
	private Long lngStuPerPinCode;

	@Column(name = "STUDENT_PRI_MOBILE_NO")
	private Long lngStuPrimaryMobileNo;

	@Column(name = "STUDENT_SECOND_MOBILE_NO")
	private Long lngStuSecondMobileNo;

	@Column(name = "STUDENT_PRI_EMAIL_ID")
	private String strStuPrimaryEmailId;

	@Column(name = "STUDENT_SECOND_EMAIL_ID")
	private String strStuSecondEmailId;

	@Column(name = "STUDENT_CAURSE")
	private String strStuCaurse;

	@Column(name = "STUDENT_DOB")
	private Date dtStuDateOfBirth;

	@Column(name = "STUDENT_GENDER")
	private String strStuGender;

	
	public StudentRegistrationEntity() {
		
	}
	
	public Long getStrStuId() {
		return strStuId;
	}

	public void setStrStuId(Long strStuId) {
		this.strStuId = strStuId;
	}

	public String getStrStuName() {
		return strStuName;
	}

	public void setStrStuName(String strStuName) {
		this.strStuName = strStuName;
	}

	public String getStrStuFatherName() {
		return strStuFatherName;
	}

	public void setStrStuFatherName(String strStuFatherName) {
		this.strStuFatherName = strStuFatherName;
	}

	public String getStrStuCurrentAdd1() {
		return strStuCurrentAdd1;
	}

	public void setStrStuCurrentAdd1(String strStuCurrentAdd1) {
		this.strStuCurrentAdd1 = strStuCurrentAdd1;
	}

	public String getStrStuCurrentAdd2() {
		return strStuCurrentAdd2;
	}

	public void setStrStuCurrentAdd2(String strStuCurrentAdd2) {
		this.strStuCurrentAdd2 = strStuCurrentAdd2;
	}

	public String getStrStuCurrentState() {
		return strStuCurrentState;
	}

	public void setStrStuCurrentState(String strStuCurrentState) {
		this.strStuCurrentState = strStuCurrentState;
	}

	public Long getLngStuCurrentPinCode() {
		return lngStuCurrentPinCode;
	}

	public void setLngStuCurrentPinCode(Long lngStuCurrentPinCode) {
		this.lngStuCurrentPinCode = lngStuCurrentPinCode;
	}

	public String getStrStuPerAdd1() {
		return strStuPerAdd1;
	}

	public void setStrStuPerAdd1(String strStuPerAdd1) {
		this.strStuPerAdd1 = strStuPerAdd1;
	}

	public String getStrStuPerAdd2() {
		return strStuPerAdd2;
	}

	public void setStrStuPerAdd2(String strStuPerAdd2) {
		this.strStuPerAdd2 = strStuPerAdd2;
	}

	public String getStrStuPerState() {
		return strStuPerState;
	}

	public void setStrStuPerState(String strStuPerState) {
		this.strStuPerState = strStuPerState;
	}

	public Long getLngStuPerPinCode() {
		return lngStuPerPinCode;
	}

	public void setLngStuPerPinCode(Long lngStuPerPinCode) {
		this.lngStuPerPinCode = lngStuPerPinCode;
	}

	public Long getLngStuPrimaryMobileNo() {
		return lngStuPrimaryMobileNo;
	}

	public void setLngStuPrimaryMobileNo(Long lngStuPrimaryMobileNo) {
		this.lngStuPrimaryMobileNo = lngStuPrimaryMobileNo;
	}

	public Long getLngStuSecondMobileNo() {
		return lngStuSecondMobileNo;
	}

	public void setLngStuSecondMobileNo(Long lngStuSecondMobileNo) {
		this.lngStuSecondMobileNo = lngStuSecondMobileNo;
	}

	public String getStrStuPrimaryEmailId() {
		return strStuPrimaryEmailId;
	}

	public void setStrStuPrimaryEmailId(String strStuPrimaryEmailId) {
		this.strStuPrimaryEmailId = strStuPrimaryEmailId;
	}

	public String getStrStuSecondEmailId() {
		return strStuSecondEmailId;
	}

	public void setStrStuSecondEmailId(String strStuSecondEmailId) {
		this.strStuSecondEmailId = strStuSecondEmailId;
	}

	public String getStrStuCaurse() {
		return strStuCaurse;
	}

	public void setStrStuCaurse(String strStuCaurse) {
		this.strStuCaurse = strStuCaurse;
	}

	public Date getDtStuDateOfBirth() {
		return dtStuDateOfBirth;
	}

	public void setDtStuDateOfBirth(Date dtStuDateOfBirth) {
		this.dtStuDateOfBirth = dtStuDateOfBirth;
	}

	public String getStrStuGender() {
		return strStuGender;
	}

	public void setStrStuGender(String strStuGender) {
		this.strStuGender = strStuGender;
	}

}
