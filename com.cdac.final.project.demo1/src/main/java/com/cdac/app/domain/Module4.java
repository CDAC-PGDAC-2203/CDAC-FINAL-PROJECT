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
@Table(name = "module_4")
public class Module4 {

	@Id
	@Column(name = "u_prn")
	private Long uPrn;

	@Column(name = "lab")
	private Integer lab;
	@Column(name = "assessment")
	private Integer assessment;
	@Column(name = "attendance")
	private Integer attendance;
	
	public Module4() {
		super();
	}

	public Module4(Long uPrn, Integer lab, Integer assessment, Integer attendance) {
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

	public Integer getLab() {
		return lab;
	}

	public void setLab(Integer lab) {
		this.lab = lab;
	}

	public Integer getAssessment() {
		return assessment;
	}

	public void setAssessment(Integer assessment) {
		this.assessment = assessment;
	}

	public Integer getAttendance() {
		return attendance;
	}

	public void setAttendance(Integer attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "Module1 [uPrn=" + uPrn + ", lab=" + lab + ", assessment=" + assessment + ", attendance=" + attendance
				+ "]";
	}

}
