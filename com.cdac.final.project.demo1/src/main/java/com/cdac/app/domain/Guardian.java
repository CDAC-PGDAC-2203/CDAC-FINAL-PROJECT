package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "guardian")
@Getter
@Setter
@ToString
public class Guardian {

	@Column(name = "ccat_no")
	private Integer ccatNo;

	@Column(name = "u_id")
	private Integer userId;

	@Column(name = "guardian_name")
	private String guardianName;

	@Column(name = "guardian_phone")
	private Integer guardianPhone;
}
