/*
 * CDAC Final Project - CDAC APP
 * @Author: Kamana Mathur [220340120097]
 * @Date: 13-09-2022 
 */
package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_login")
public class UserLogin {

	@Column(name = "u_id")
	private Long userId;

	@Column(name = "u_name")
	private Long userName;

	@Column(name = "u_password")
	private String password;

	public UserLogin() {
		super();
	}

	public UserLogin(Long userId, Long userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserName() {
		return userName;
	}

	public void setUserName(Long userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}

}
