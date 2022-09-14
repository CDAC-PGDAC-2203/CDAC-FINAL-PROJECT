/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083]
 * @Date: 13-09-2022 
 */

package com.cdac.app.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ccat_student")
public class CCATStudent {

	@Id
	@Column(name = "ccat_no")
	private Integer ccatNo;

	@Column(name = "f_name")
	private String fName;

	@Column(name = "m_name")
	private String mName;

	@Column(name = "l_name")
	private String lName;

	@Column(name = "dob")
	private LocalDate dob;

	@Column(name = "course")
	private String course;

	public CCATStudent() {
		super();
	}

	public CCATStudent(Integer ccatNo, String fName, String mName, String lName, LocalDate dob, String course) {
		super();
		this.ccatNo = ccatNo;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.dob = dob;
		this.course = course;
	}

	public Integer getCcatNo() {
		return ccatNo;
	}

	public void setCcatNo(Integer ccatNo) {
		this.ccatNo = ccatNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "CCATStudent [ccatNo=" + ccatNo + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", dob="
				+ dob + ", course=" + course + "]";
	}
}
