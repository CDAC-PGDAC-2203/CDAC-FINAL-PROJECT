package com.cdac.app.dto;

import java.util.HashMap;

public class ExamAttemptDTO {

	private HashMap<String, String> map;
	private String module;
	private String uPrn;

	public ExamAttemptDTO() {
		super();
	}

	public ExamAttemptDTO(HashMap<String, String> map, String module, String uPrn) {
		super();
		this.map = map;
		this.module = module;
		this.uPrn = uPrn;
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getuPrn() {
		return uPrn;
	}

	public void setuPrn(String uPrn) {
		this.uPrn = uPrn;
	}

	@Override
	public String toString() {
		return "ExamAttempDTO [map=" + map + ", module=" + module + ", uPrn=" + uPrn + "]";
	}
}
