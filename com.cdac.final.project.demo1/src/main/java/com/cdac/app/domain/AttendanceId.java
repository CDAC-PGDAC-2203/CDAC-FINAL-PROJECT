package com.cdac.app.domain;

public class AttendanceId {

	private Long uPrn;
	private String module;

	public AttendanceId() {
		super();
	}

	public AttendanceId(Long uPrn, String module) {
		super();
		this.uPrn = uPrn;
		this.module = module;
	}

	public Long getuPrn() {
		return uPrn;
	}

	public void setuPrn(Long uPrn) {
		this.uPrn = uPrn;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
