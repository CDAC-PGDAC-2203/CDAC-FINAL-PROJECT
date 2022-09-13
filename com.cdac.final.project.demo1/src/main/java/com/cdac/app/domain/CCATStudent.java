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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ccat_student")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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

}
