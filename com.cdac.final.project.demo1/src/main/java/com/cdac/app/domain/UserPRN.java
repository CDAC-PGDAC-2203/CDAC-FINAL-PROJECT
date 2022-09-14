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
@Table(name = "user_prn")
public class UserPRN {

	@Column(name = "u_id")
	private Long userId;

	@Column(name = "u_prn")
	private Long userPRN;

	@Column(name = "default_password")
	private String defaultPassword;

	public UserPRN() {
		super();
	}

	public UserPRN(Long userId, Long userPRN, String defaultPassword) {
		super();
		this.userId = userId;
		this.userPRN = userPRN;
		this.defaultPassword = defaultPassword;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserPRN() {
		return userPRN;
	}

	public void setUserPRN(Long userPRN) {
		this.userPRN = userPRN;
	}

	public String getDefaultPassword() {
		return defaultPassword;
	}

	public void setDefaultPassword(String defaultPassword) {
		this.defaultPassword = defaultPassword;
	}

	@Override
	public String toString() {
		return "UserPRN [userId=" + userId + ", userPRN=" + userPRN + ", defaultPassword=" + defaultPassword + "]";
	}
}
