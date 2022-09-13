/*
 * CDAC Final Project - CDAC APP
 * @Author: Udit Keskar [220340120100]
 * @Date: 13-09-2022 
 */
package com.cdac.app.domain;

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
@Table(name = "user_address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserAddress {

	@Id
	@Column(name = "u_id")
	private Long userId;
	
	@Column(name = "add_line1")
	private String AddLine1;
	
	@Column(name = "add_line2")
	private String AddLine2;

	@Column(name = "state")
	private String State;
	
	@Column(name = "city")
	private String City;
	
	@Column(name = "pincode")
	private Integer Pincode;
	
}
