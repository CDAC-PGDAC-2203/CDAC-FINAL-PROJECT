/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083]
 * @Date: 13-09-2022 
 */
package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_user")
public class StudentUser {
	@Id
	@Column(name = "u_id")
	private Long userId;

	@Column(name = "ccat_no")
	private Integer ccatNo;

	@Column(name = "course")
	private String course;

	public StudentUser() {
		super();
	}

	public StudentUser(Long userId, Integer ccatNo, String course) {
		super();
		this.userId = userId;
		this.ccatNo = ccatNo;
		this.course = course;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getCcatNo() {
		return ccatNo;
	}

	public void setCcatNo(Integer ccatNo) {
		this.ccatNo = ccatNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentUser [userId=" + userId + ", ccatNo=" + ccatNo + ", course=" + course + "]";
	}
}