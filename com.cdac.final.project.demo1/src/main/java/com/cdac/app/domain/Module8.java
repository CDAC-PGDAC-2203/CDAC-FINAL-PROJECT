/*
 * CDAC Final Project - CDAC APP
 * @Author: Udit Keskar [220340120100]
 * @Date: 16-09-2022
*/

package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "module_8")
public class Module8 {

	@Id
	@Column(name = "u_prn")
	private Long uPrn;

	@Column(name = "lab")
	private Long lab;
	@Column(name = "assessment")
	private Long assessment;
	@Column(name = "attendance")
	private Long attendance;

	public Module8() {
		super();
	}

	public Module8(Long uPrn, Long lab, Long assessment, Long attendance) {
		super();
		this.uPrn = uPrn;
		this.lab = lab;
		this.assessment = assessment;
		this.attendance = attendance;
	}

	public Long getuPrn() {
		return uPrn;
	}

	public void setuPrn(Long uPrn) {
		this.uPrn = uPrn;
	}

	public Long getLab() {
		return lab;
	}

	public void setLab(Long lab) {
		this.lab = lab;
	}

	public Long getAssessment() {
		return assessment;
	}

	public void setAssessment(Long assessment) {
		this.assessment = assessment;
	}

	public Long getAttendance() {
		return attendance;
	}

	public void setAttendance(Long attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "Module1 [uPrn=" + uPrn + ", lab=" + lab + ", assessment=" + assessment + ", attendance=" + attendance
				+ "]";
	}

}
