package com.cdac.app.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ccat_pre")
@Getter
@Setter
@ToString
public class CCATPre {

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
