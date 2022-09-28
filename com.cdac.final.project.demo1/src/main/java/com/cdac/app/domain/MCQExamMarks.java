package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "mcq_marks")
@IdClass(MCQExamMarksId.class)
public class MCQExamMarks {
	@Id
	@Column(name = "u_prn")
	private Long uPrn;

	@Id
	@Column(name = "module")
	private String module;

	@Column(name = "marks")
	private Long marks;

	public MCQExamMarks() {
		super();
	}

	public MCQExamMarks(Long uPrn, String module, Long marks) {
		super();
		this.uPrn = uPrn;
		this.module = module;
		this.marks = marks;
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

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "MCQExamMarks [uPrn=" + uPrn + ", module=" + module + ", marks=" + marks + "]";
	}

}
