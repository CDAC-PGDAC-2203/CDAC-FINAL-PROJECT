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

	@Column(name = "mod2_lab")
	private Integer mod2Lab;
	@Column(name = "mod2_assessment")
	private Integer mod2Assessment;
	@Column(name = "mod2_attendance")
	private Integer mod2Attendance;

	@Column(name = "mod3_lab")
	private Integer mod3Lab;
	@Column(name = "mod3_assessment")
	private Integer mod3Assessment;
	@Column(name = "mod3_attendance")
	private Integer mod3Attendance;

	@Column(name = "mod4_lab")
	private Integer mod4Lab;
	@Column(name = "mod4_assessment")
	private Integer mod4Assessment;
	@Column(name = "mod4_attendance")
	private Integer mod4Attendance;

	@Column(name = "mod5_lab")
	private Integer mod5Lab;
	@Column(name = "mod5_assessment")
	private Integer mod5Assessment;
	@Column(name = "mod5_attendance")
	private Integer mod5Attendance;

	@Column(name = "mod6_lab")
	private Integer mod6Lab;
	@Column(name = "mod6_assessment")
	private Integer mod6Assessment;
	@Column(name = "mod6_attendance")
	private Integer mod6Attendance;

	@Column(name = "mod7_lab")
	private Integer mod7Lab;
	@Column(name = "mod7_assessment")
	private Integer mod7Assessment;
	@Column(name = "mod7_attendance")
	private Integer mod7Attendance;

	@Column(name = "mod8_lab")
	private Integer mod8Lab;
	@Column(name = "mod8_assessment")
	private Integer mod8Assessment;
	@Column(name = "mod8_attendance")
	private Integer mod8Attendance;

	public ResultTable() {
		super();
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

	public Integer getMod4Lab() {
		return mod4Lab;
	}

	public void setMod4Lab(Integer mod4Lab) {
		this.mod4Lab = mod4Lab;
	}

	public Integer getMod4Assessment() {
		return mod4Assessment;
	}

	public void setMod4Assessment(Integer mod4Assessment) {
		this.mod4Assessment = mod4Assessment;
	}

	public Integer getMod4Attendance() {
		return mod4Attendance;
	}

	public void setMod4Attendance(Integer mod4Attendance) {
		this.mod4Attendance = mod4Attendance;
	}

	public Integer getMod5Lab() {
		return mod5Lab;
	}

	public void setMod5Lab(Integer mod5Lab) {
		this.mod5Lab = mod5Lab;
	}

	public Integer getMod5Assessment() {
		return mod5Assessment;
	}

	public void setMod5Assessment(Integer mod5Assessment) {
		this.mod5Assessment = mod5Assessment;
	}

	public Integer getMod5Attendance() {
		return mod5Attendance;
	}

	public void setMod5Attendance(Integer mod5Attendance) {
		this.mod5Attendance = mod5Attendance;
	}

	public Integer getMod6Lab() {
		return mod6Lab;
	}

	public void setMod6Lab(Integer mod6Lab) {
		this.mod6Lab = mod6Lab;
	}

	public Integer getMod6Assessment() {
		return mod6Assessment;
	}

	public void setMod6Assessment(Integer mod6Assessment) {
		this.mod6Assessment = mod6Assessment;
	}

	public Integer getMod6Attendance() {
		return mod6Attendance;
	}

	public void setMod6Attendance(Integer mod6Attendance) {
		this.mod6Attendance = mod6Attendance;
	}

	public Integer getMod7Lab() {
		return mod7Lab;
	}

	public void setMod7Lab(Integer mod7Lab) {
		this.mod7Lab = mod7Lab;
	}

	public Integer getMod7Assessment() {
		return mod7Assessment;
	}

	public void setMod7Assessment(Integer mod7Assessment) {
		this.mod7Assessment = mod7Assessment;
	}

	public Integer getMod7Attendance() {
		return mod7Attendance;
	}

	public void setMod7Attendance(Integer mod7Attendance) {
		this.mod7Attendance = mod7Attendance;
	}

	public Integer getMod8Lab() {
		return mod8Lab;
	}

	public void setMod8Lab(Integer mod8Lab) {
		this.mod8Lab = mod8Lab;
	}

	public Integer getMod8Assessment() {
		return mod8Assessment;
	}

	public void setMod8Assessment(Integer mod8Assessment) {
		this.mod8Assessment = mod8Assessment;
	}

	public Integer getMod8Attendance() {
		return mod8Attendance;
	}

	public void setMod8Attendance(Integer mod8Attendance) {
		this.mod8Attendance = mod8Attendance;
	}

	public ResultTable(Long uPrn, Integer mod1Lab, Integer mod1Assessment, Integer mod1Attendance, Integer mod2Lab,
			Integer mod2Assessment, Integer mod2Attendance, Integer mod3Lab, Integer mod3Assessment,
			Integer mod3Attendance, Integer mod4Lab, Integer mod4Assessment, Integer mod4Attendance, Integer mod5Lab,
			Integer mod5Assessment, Integer mod5Attendance, Integer mod6Lab, Integer mod6Assessment,
			Integer mod6Attendance, Integer mod7Lab, Integer mod7Assessment, Integer mod7Attendance, Integer mod8Lab,
			Integer mod8Assessment, Integer mod8Attendance) {
		super();
		this.uPrn = uPrn;
		this.mod1Lab = mod1Lab;
		this.mod1Assessment = mod1Assessment;
		this.mod1Attendance = mod1Attendance;
		this.mod2Lab = mod2Lab;
		this.mod2Assessment = mod2Assessment;
		this.mod2Attendance = mod2Attendance;
		this.mod3Lab = mod3Lab;
		this.mod3Assessment = mod3Assessment;
		this.mod3Attendance = mod3Attendance;
		this.mod4Lab = mod4Lab;
		this.mod4Assessment = mod4Assessment;
		this.mod4Attendance = mod4Attendance;
		this.mod5Lab = mod5Lab;
		this.mod5Assessment = mod5Assessment;
		this.mod5Attendance = mod5Attendance;
		this.mod6Lab = mod6Lab;
		this.mod6Assessment = mod6Assessment;
		this.mod6Attendance = mod6Attendance;
		this.mod7Lab = mod7Lab;
		this.mod7Assessment = mod7Assessment;
		this.mod7Attendance = mod7Attendance;
		this.mod8Lab = mod8Lab;
		this.mod8Assessment = mod8Assessment;
		this.mod8Attendance = mod8Attendance;
	}

	@Override
	public String toString() {
		return "ResultTable [uPrn=" + uPrn + ", mod1Lab=" + mod1Lab + ", mod1Assessment=" + mod1Assessment
				+ ", mod1Attendance=" + mod1Attendance + ", mod2Lab=" + mod2Lab + ", mod2Assessment=" + mod2Assessment
				+ ", mod2Attendance=" + mod2Attendance + ", mod3Lab=" + mod3Lab + ", mod3Assessment=" + mod3Assessment
				+ ", mod3Attendance=" + mod3Attendance + ", mod4Lab=" + mod4Lab + ", mod4Assessment=" + mod4Assessment
				+ ", mod4Attendance=" + mod4Attendance + ", mod5Lab=" + mod5Lab + ", mod5Assessment=" + mod5Assessment
				+ ", mod5Attendance=" + mod5Attendance + ", mod6Lab=" + mod6Lab + ", mod6Assessment=" + mod6Assessment
				+ ", mod6Attendance=" + mod6Attendance + ", mod7Lab=" + mod7Lab + ", mod7Assessment=" + mod7Assessment
				+ ", mod7Attendance=" + mod7Attendance + ", mod8Lab=" + mod8Lab + ", mod8Assessment=" + mod8Assessment
				+ ", mod8Attendance=" + mod8Attendance + "]";
	}

}
