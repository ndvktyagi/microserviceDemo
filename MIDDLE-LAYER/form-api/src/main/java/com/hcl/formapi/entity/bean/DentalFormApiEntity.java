package com.hcl.formapi.entity.bean;

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
@Table(name = "DENTAL_FORM")
public class DentalFormApiEntity implements Serializable {

	private static final long serialVersionUID = 2891633271261849647L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dental_Sequence")
	@SequenceGenerator(name = "dental_Sequence", sequenceName = "DENTAL_SEQ")
	private Long strPatientId;
	
	
	@Column(name = "PATIENT_NAME")
	private String strPatientName;
	
	@Column(name = "PATIENT_GENDER")
	private String strPatientGender;
	
	@Column(name = "PATIENT_RELATIONSHIP")
	private String strPatientRelationship;
	
	@Column(name = "EMPLOYEE_NAME")
	private String strEmployeeName;
	
	@Column(name = "EMPLOYEE_CURR_ADD1")
	private String strEmployeeCurrentAdd1;
	
	@Column(name = "EMPLOYEE_CURR_ADD2")
	private String strEmployeeCurrentAdd2;
	
	@Column(name = "EMPLOYEE_CURR_STATE")
	private String strEmployeeCurrentState;
	
	@Column(name = "EMPLOYEE_PER_ADD1")
	private String strEmployeePerAdd1;
	
	@Column(name = "EMPLOYEE_PER_ADD2")
	private String strEmployeePerAdd2;
	
	@Column(name = "EMPLOYEE_PER_STATE")
	private String strEmployeePerState;	
	
	@Column(name = "EMPLOYEE_ID_TYPE")
	private String strEmployeeIDType;
	
	@Column(name = "EMPLOYEE_ID_NUM")
	private String strEmployeeIDNumber;	
	
	@Column(name = "EMPLOYEE_SAP_CODE")
	private String strEmployeeSapCode;
	
	@Column(name = "EMPLOYEE_EMAIL")
	private String strEmployeeEmailId;
	
	@Column(name = "EMPLOYEE_CURR_PIN")
	private Long lngEmployeeCurrentPinCode;
	
	@Column(name = "EMPLOYEE_PER_PIN")
	private Long lngEmployeePerPinCode;
	
	@Column(name = "EMPLOYEE_MOBILE_NUM")
	private Long lngEmployeeMobileNo;
	
	@Column(name = "EMPLOYEE_DOB")
	private Date dtEmployeeDateOfBirth;
	
	@Column(name = "PATIENT_DOB")
	private Date dtPatientDateOfBirth;
		
	public DentalFormApiEntity() {
		
	}

	public Long getStrPatientId() {
		return strPatientId;
	}

	public void setStrPatientId(Long strPatientId) {
		this.strPatientId = strPatientId;
	}

	public String getStrPatientName() {
		return strPatientName;
	}

	public void setStrPatientName(String strPatientName) {
		this.strPatientName = strPatientName;
	}

	public String getStrPatientGender() {
		return strPatientGender;
	}

	public void setStrPatientGender(String strPatientGender) {
		this.strPatientGender = strPatientGender;
	}

	public String getStrPatientRelationship() {
		return strPatientRelationship;
	}

	public void setStrPatientRelationship(String strPatientRelationship) {
		this.strPatientRelationship = strPatientRelationship;
	}

	public String getStrEmployeeName() {
		return strEmployeeName;
	}

	public void setStrEmployeeName(String strEmployeeName) {
		this.strEmployeeName = strEmployeeName;
	}

	public String getStrEmployeeCurrentAdd1() {
		return strEmployeeCurrentAdd1;
	}

	public void setStrEmployeeCurrentAdd1(String strEmployeeCurrentAdd1) {
		this.strEmployeeCurrentAdd1 = strEmployeeCurrentAdd1;
	}

	public String getStrEmployeeCurrentAdd2() {
		return strEmployeeCurrentAdd2;
	}

	public void setStrEmployeeCurrentAdd2(String strEmployeeCurrentAdd2) {
		this.strEmployeeCurrentAdd2 = strEmployeeCurrentAdd2;
	}

	public String getStrEmployeeCurrentState() {
		return strEmployeeCurrentState;
	}

	public void setStrEmployeeCurrentState(String strEmployeeCurrentState) {
		this.strEmployeeCurrentState = strEmployeeCurrentState;
	}

	public String getStrEmployeePerAdd1() {
		return strEmployeePerAdd1;
	}

	public void setStrEmployeePerAdd1(String strEmployeePerAdd1) {
		this.strEmployeePerAdd1 = strEmployeePerAdd1;
	}

	public String getStrEmployeePerAdd2() {
		return strEmployeePerAdd2;
	}

	public void setStrEmployeePerAdd2(String strEmployeePerAdd2) {
		this.strEmployeePerAdd2 = strEmployeePerAdd2;
	}

	public String getStrEmployeePerState() {
		return strEmployeePerState;
	}

	public void setStrEmployeePerState(String strEmployeePerState) {
		this.strEmployeePerState = strEmployeePerState;
	}

	public String getStrEmployeeIDType() {
		return strEmployeeIDType;
	}

	public void setStrEmployeeIDType(String strEmployeeIDType) {
		this.strEmployeeIDType = strEmployeeIDType;
	}

	public String getStrEmployeeIDNumber() {
		return strEmployeeIDNumber;
	}

	public void setStrEmployeeIDNumber(String strEmployeeIDNumber) {
		this.strEmployeeIDNumber = strEmployeeIDNumber;
	}

	public String getStrEmployeeEmailId() {
		return strEmployeeEmailId;
	}

	public void setStrEmployeeEmailId(String strEmployeeEmailId) {
		this.strEmployeeEmailId = strEmployeeEmailId;
	}

	public Long getLngEmployeeCurrentPinCode() {
		return lngEmployeeCurrentPinCode;
	}

	public void setLngEmployeeCurrentPinCode(Long lngEmployeeCurrentPinCode) {
		this.lngEmployeeCurrentPinCode = lngEmployeeCurrentPinCode;
	}

	public Long getLngEmployeePerPinCode() {
		return lngEmployeePerPinCode;
	}

	public void setLngEmployeePerPinCode(Long lngEmployeePerPinCode) {
		this.lngEmployeePerPinCode = lngEmployeePerPinCode;
	}

	public Long getLngEmployeeMobileNo() {
		return lngEmployeeMobileNo;
	}

	public void setLngEmployeeMobileNo(Long lngEmployeeMobileNo) {
		this.lngEmployeeMobileNo = lngEmployeeMobileNo;
	}

	public Date getDtEmployeeDateOfBirth() {
		return dtEmployeeDateOfBirth;
	}

	public void setDtEmployeeDateOfBirth(Date dtEmployeeDateOfBirth) {
		this.dtEmployeeDateOfBirth = dtEmployeeDateOfBirth;
	}

	public Date getDtPatientDateOfBirth() {
		return dtPatientDateOfBirth;
	}

	public void setDtPatientDateOfBirth(Date dtPatientDateOfBirth) {
		this.dtPatientDateOfBirth = dtPatientDateOfBirth;
	}
	
	
}
