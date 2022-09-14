/*
 * CDAC Final Project - CDAC APP
 * @Author: Joy Pahari [220340120092]
 * @Date: 13-09-2022
*/

package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "guardian")
public class Guardian {

	@Column(name = "ccat_no")
	private Long ccatNo;

	@Column(name = "u_id")
	private Long userId;

	@Column(name = "guardian_name")
	private String guardianName;

	@Column(name = "guardian_phone")
	private Long guardianPhone;

	public Guardian() {
		super();
	}

	public Guardian(Long ccatNo, Long userId, String guardianName, Long guardianPhone) {
		super();
		this.ccatNo = ccatNo;
		this.userId = userId;
		this.guardianName = guardianName;
		this.guardianPhone = guardianPhone;
	}

	public Long getCcatNo() {
		return ccatNo;
	}

	public void setCcatNo(Long ccatNo) {
		this.ccatNo = ccatNo;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public Long getGuardianPhone() {
		return guardianPhone;
	}

	public void setGuardianPhone(Long guardianPhone) {
		this.guardianPhone = guardianPhone;
	}

	@Override
	public String toString() {
		return "Guardian [ccatNo=" + ccatNo + ", userId=" + userId + ", guardianName=" + guardianName
				+ ", guardianPhone=" + guardianPhone + "]";
	}
}
