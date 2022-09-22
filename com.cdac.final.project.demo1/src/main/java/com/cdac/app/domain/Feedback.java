package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {

	@Id
	@Column(name = "u_prn")
	private Long uPrn;

	@Column(name = "course")
	private String course;

	@Column(name = "faculty")
	private String faculty;

	@Column(name = "module")
	private String module;

	@Column(name = "parameter_1")
	private Integer parameter1;

	@Column(name = "parameter_2")
	private Integer parameter2;

	@Column(name = "parameter_3")
	private Integer parameter3;

	@Column(name = "parameter_4")
	private Integer parameter4;

	@Column(name = "parameter_5")
	private Integer parameter5;

	@Column(name = "parameter_total")
	private Integer parameterTotal;

	@Column(name = "suggestion")
	private String suggestion;

	public Feedback() {
		super();
	}

	public Feedback(Long uPrn, String course, String faculty, String module, Integer parameter1, Integer parameter2,
			Integer parameter3, Integer parameter4, Integer parameter5, Integer parameterTotal, String suggestion) {
		super();
		this.uPrn = uPrn;
		this.course = course;
		this.faculty = faculty;
		this.module = module;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
		this.parameter4 = parameter4;
		this.parameter5 = parameter5;
		this.parameterTotal = parameterTotal;
		this.suggestion = suggestion;
	}

	public Long getuPrn() {
		return uPrn;
	}

	public void setuPrn(Long uPrn) {
		this.uPrn = uPrn;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Integer getParameter1() {
		return parameter1;
	}

	public void setParameter1(Integer parameter1) {
		this.parameter1 = parameter1;
	}

	public Integer getParameter2() {
		return parameter2;
	}

	public void setParameter2(Integer parameter2) {
		this.parameter2 = parameter2;
	}

	public Integer getParameter3() {
		return parameter3;
	}

	public void setParameter3(Integer parameter3) {
		this.parameter3 = parameter3;
	}

	public Integer getParameter4() {
		return parameter4;
	}

	public void setParameter4(Integer parameter4) {
		this.parameter4 = parameter4;
	}

	public Integer getParameter5() {
		return parameter5;
	}

	public void setParameter5(Integer parameter5) {
		this.parameter5 = parameter5;
	}

	public Integer getParameterTotal() {
		return parameterTotal;
	}

	public void setParameterTotal(Integer parameterTotal) {
		this.parameterTotal = parameterTotal;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	@Override
	public String toString() {
		return "Feedback [uPrn=" + uPrn + ", course=" + course + ", faculty=" + faculty + ", module=" + module
				+ ", parameter1=" + parameter1 + ", parameter2=" + parameter2 + ", parameter3=" + parameter3
				+ ", parameter4=" + parameter4 + ", parameter5=" + parameter5 + ", parameterTotal=" + parameterTotal
				+ ", suggestion=" + suggestion + "]";
	}

}