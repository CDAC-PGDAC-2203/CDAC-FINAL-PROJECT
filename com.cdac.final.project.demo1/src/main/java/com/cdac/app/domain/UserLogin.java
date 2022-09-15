/*
 * CDAC Final Project - CDAC APP
 * @Author: Kamana Mathur [220340120097]
 * @Date: 13-09-2022 
 */
package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_login")
public class UserLogin {

	@Id
	@Column(name = "u_id")
	private Long userId;

	@Column(name = "u_name")
	private String uName;

	@Column(name = "u_prn")
	private Long uPrn;

	@Column(name = "u_password")
	private String uPassword;

	public UserLogin() {
		super();
	}

	public UserLogin(Long userId, String uName, Long uPrn, String uPassword) {
		super();
		this.userId = userId;
		this.uName = uName;
		this.uPrn = uPrn;
		this.uPassword = uPassword;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public Long getuPrn() {
		return uPrn;
	}

	public void setuPrn(Long uPrn) {
		this.uPrn = uPrn;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", uName=" + uName + ", uPrn=" + uPrn + ", uPassword=" + uPassword + "]";
	}

}