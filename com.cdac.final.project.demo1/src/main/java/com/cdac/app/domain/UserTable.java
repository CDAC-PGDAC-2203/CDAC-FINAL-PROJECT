/*
 * CDAC Final Project - CDAC APP
 * @Author: Joy Pahari [220340120092]
 * @Date: 13-09-2022
*/

package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
@IdClass(UserId.class)
public class UserTable {

	@Id
	@Column(name = "u_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	@Column(name = "f_name")
	private String fName;

	@Id
	@Column(name = "ccat_no")
	private Long ccatNo;

	@Enumerated(EnumType.STRING)
	@Column(name = "u_role")
	private Role userRole;

	public UserTable() {
	}

	public UserTable(String fName, Long ccatNo, Role userRole) {
		this.fName = fName;
		this.ccatNo = ccatNo;
		this.userRole = userRole;
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

	public Long getCcatNo() {
		return ccatNo;
	}

	public void setCcatNo(Long ccatNo) {
		this.ccatNo = ccatNo;
	}

	public Role getUserRole() {
		return userRole;
	}

	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserTable [userId=" + userId + ", fName=" + fName + ", ccatNo=" + ccatNo + ", userRole=" + userRole
				+ "]";
	}
}
