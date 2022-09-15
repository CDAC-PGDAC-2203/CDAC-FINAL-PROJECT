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

	@Column(name = "f_name")
	private String fName;

	@Column(name = "m_name")
	private String mName;

	@Column(name = "l_name")
	private String lName;

	@Column(name = "u_prn")
	private Long uPrn;

	@Column(name = "u_password")
	private String uPassword;

	public UserLogin() {
		super();
	}

	public UserLogin(Long userId, String fName, String mName, String lName, Long uPrn, String uPassword) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.uPrn = uPrn;
		this.uPassword = uPassword;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
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
		return "UserLogin [userId=" + userId + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", uPrn="
				+ uPrn + ", uPassword=" + uPassword + "]";
	}
}