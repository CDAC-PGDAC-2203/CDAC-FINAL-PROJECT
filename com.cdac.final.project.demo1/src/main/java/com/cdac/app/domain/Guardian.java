/*
 * CDAC Final Project - CDAC APP
 * @Author: Joy Pahari [220340120092]
 * @Date: 13-09-2022
*/

package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "guardian")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Guardian {

	@Column(name = "ccat_no")
	private Long ccatNo;

	@Column(name = "u_id")
	private Long userId;

	@Column(name = "guardian_name")
	private String guardianName;

	@Column(name = "guardian_phone")
	private Long guardianPhone;
	
}
