/*
 * CDAC Final Project - CDAC APP
 * @Author: Mayank Sachan [220340120120]
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
@Table(name = "personal_details")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PersonalDetails {

	@Id
	@Column(name = "u_id")
	private Long uId;

	@Column(name = "f_name")
	private String fName;

	@Column(name = "m_name")
	private String mName;

	@Column(name = "l_name")
	private String lName;
	
	@Column(name = "gender")
	private String gender;

	@Column(name = "dob")
	private LocalDate dob;

	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private Long phone;
	
	@Column(name = "qualification")
	private String qualification;
	
	@Column(name = "photo")
	private String photo;
}
