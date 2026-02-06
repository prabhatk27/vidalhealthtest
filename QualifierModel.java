package com.cdac.model;

public class QualifierModel {

	String name;
	String regNo;
	String email;
	
	public QualifierModel(String name,String regNo,String email) {
		this.name=name;
		this.regNo=regNo;
		this.email=email;
	}
	
	public QualifierModel() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
