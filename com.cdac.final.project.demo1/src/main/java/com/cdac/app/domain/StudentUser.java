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

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student_user")
@Getter
@Setter
@ToString
public class StudentUser {
	@Id
	@Column(name = "u_id")
	private Long userId;

	@Column(name = "ccat_no")
	private Integer ccatNo;

	@Column(name = "course")
	private String course;
}