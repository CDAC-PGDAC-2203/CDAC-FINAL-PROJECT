package com.cdac.app.dto;

public class ValidStudent {
	private String ccatNo;

	private String fName;

	public ValidStudent() {
		super();
	}

	public ValidStudent(String ccatNo, String fName) {
		super();
		this.ccatNo = ccatNo;
		this.fName = fName;
	}

	public String getCcatNo() {
		return ccatNo;
	}

	public void setCcatNo(String ccatNo) {
		this.ccatNo = ccatNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

}
