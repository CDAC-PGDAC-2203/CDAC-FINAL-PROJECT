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
@Table(name = "user_login")
@Getter
@Setter
@ToString
public class UserLogin {
	@Column(name = "u_id")
	private Long userId;
	@Column(name = "u_name")
	private Long userName;
	@Column(name = "u_password")
	private String password;

}
