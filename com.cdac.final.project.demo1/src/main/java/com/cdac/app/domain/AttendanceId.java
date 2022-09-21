package com.cdac.app.domain;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class AttendanceId implements Serializable {

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

	@Override
	public int hashCode() {
		return Objects.hash(module, uPrn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendanceId other = (AttendanceId) obj;
		return Objects.equals(module, other.module) && Objects.equals(uPrn, other.uPrn);
	}

}
