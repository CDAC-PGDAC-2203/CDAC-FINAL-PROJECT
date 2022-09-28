package com.cdac.app.domain;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class MCQExamMarksId implements Serializable {

	private Long uPrn;
	private String module;

	public MCQExamMarksId() {
		super();
	}

	public MCQExamMarksId(Long uPrn, String module) {
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
		MCQExamMarksId other = (MCQExamMarksId) obj;
		return Objects.equals(module, other.module) && Objects.equals(uPrn, other.uPrn);
	}

}
