package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_table")
@Getter
@Setter
@ToString
public class UserTable {

	@Column(name = "u_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	@Column(name = "f_name")
	private String fName;

	@Column(name = "ccat_no")
	private Integer ccatNo;

	@Column(name = "u_role")
	private Role userRole;
}
