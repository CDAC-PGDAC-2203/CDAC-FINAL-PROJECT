/*
 * CDAC Final Project - CDAC APP
 * @Author: Kamana Mathur [220340120097]
 * @Date: 13-09-2022 
 */
package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_prn")
@Getter
@Setter
@ToString
public class UserPRN {
	@Column(name = "u_id")
	private Long userId;
	@Column(name = "u_prn")
	private Long userPRN;
	@Column(name = "default_password")
	private String defaultPassword;

}
