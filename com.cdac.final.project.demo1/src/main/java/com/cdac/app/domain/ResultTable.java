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
@Table(name = "result_table")
public class ResultTable {

	@Id
	@Column(name = "u_prn")
	private Long uPrn;

	@Column(name = "mod1_lab")
	private Integer mod1Lab;
	@Column(name = "mod1_assessment")
	private Integer mod1Assessment;
	@Column(name = "mod1_attendance")
	private Integer mod1Attendance;
	@Column(name = "mod1_total")
	private Integer mod1Total;
	
	@Column(name = "mod2_lab")
	private Integer mod2Lab;
	@Column(name = "mod2_assessment")
	private Integer mod2Assessment;
	@Column(name = "mod2_attendance")
	private Integer mod2Attendance;
	@Column(name = "mod2_total")
	private Integer mod2Total;
	
	@Column(name = "mod3_lab")
	private Integer mod3Lab;
	@Column(name = "mod3_assessment")
	private Integer mod3Assessment;
	@Column(name = "mod3_attendance")
	private Integer mod3Attendance;
	@Column(name = "mod3_total")
	private Integer mod3Total;

	public ResultTable() {
		super();
	}

	public ResultTable(Long uPrn, Integer mod1Lab, Integer mod1Assessment, Integer mod1Attendance, Integer mod1Total,
			Integer mod2Lab, Integer mod2Assessment, Integer mod2Attendance, Integer mod2Total, Integer mod3Lab,
			Integer mod3Assessment, Integer mod3Attendance, Integer mod3Total) {
		super();
		this.uPrn = uPrn;
		this.mod1Lab = mod1Lab;
		this.mod1Assessment = mod1Assessment;
		this.mod1Attendance = mod1Attendance;
		this.mod1Total = mod1Total;
		this.mod2Lab = mod2Lab;
		this.mod2Assessment = mod2Assessment;
		this.mod2Attendance = mod2Attendance;
		this.mod2Total = mod2Total;
		this.mod3Lab = mod3Lab;
		this.mod3Assessment = mod3Assessment;
		this.mod3Attendance = mod3Attendance;
		this.mod3Total = mod3Total;
	}

	public Long getuPrn() {
		return uPrn;
	}

	public void setuPrn(Long uPrn) {
		this.uPrn = uPrn;
	}

	public Integer getMod1Lab() {
		return mod1Lab;
	}

	public void setMod1Lab(Integer mod1Lab) {
		this.mod1Lab = mod1Lab;
	}

	public Integer getMod1Assessment() {
		return mod1Assessment;
	}

	public void setMod1Assessment(Integer mod1Assessment) {
		this.mod1Assessment = mod1Assessment;
	}

	public Integer getMod1Attendance() {
		return mod1Attendance;
	}

	public void setMod1Attendance(Integer mod1Attendance) {
		this.mod1Attendance = mod1Attendance;
	}

	public Integer getMod1Total() {
		return mod1Total;
	}

	public void setMod1Total(Integer mod1Total) {
		this.mod1Total = mod1Total;
	}

	public Integer getMod2Lab() {
		return mod2Lab;
	}

	public void setMod2Lab(Integer mod2Lab) {
		this.mod2Lab = mod2Lab;
	}

	public Integer getMod2Assessment() {
		return mod2Assessment;
	}

	public void setMod2Assessment(Integer mod2Assessment) {
		this.mod2Assessment = mod2Assessment;
	}

	public Integer getMod2Attendance() {
		return mod2Attendance;
	}

	public void setMod2Attendance(Integer mod2Attendance) {
		this.mod2Attendance = mod2Attendance;
	}

	public Integer getMod2Total() {
		return mod2Total;
	}

	public void setMod2Total(Integer mod2Total) {
		this.mod2Total = mod2Total;
	}

	public Integer getMod3Lab() {
		return mod3Lab;
	}

	public void setMod3Lab(Integer mod3Lab) {
		this.mod3Lab = mod3Lab;
	}

	public Integer getMod3Assessment() {
		return mod3Assessment;
	}

	public void setMod3Assessment(Integer mod3Assessment) {
		this.mod3Assessment = mod3Assessment;
	}

	public Integer getMod3Attendance() {
		return mod3Attendance;
	}

	public void setMod3Attendance(Integer mod3Attendance) {
		this.mod3Attendance = mod3Attendance;
	}

	public Integer getMod3Total() {
		return mod3Total;
	}

	public void setMod3Total(Integer mod3Total) {
		this.mod3Total = mod3Total;
	}

	@Override
	public String toString() {
		return "ResultTable [uPrn=" + uPrn + ", mod1Lab=" + mod1Lab + ", mod1Assessment=" + mod1Assessment
				+ ", mod1Attendance=" + mod1Attendance + ", mod1Total=" + mod1Total + ", mod2Lab=" + mod2Lab
				+ ", mod2Assessment=" + mod2Assessment + ", mod2Attendance=" + mod2Attendance + ", mod2Total="
				+ mod2Total + ", mod3Lab=" + mod3Lab + ", mod3Assessment=" + mod3Assessment + ", mod3Attendance="
				+ mod3Attendance + ", mod3Total=" + mod3Total + "]";
	}

}
