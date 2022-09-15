/*
 * CDAC Final Project - CDAC APP
 * @Author: Joy Pahari [220340120092]
 * @Date: 13-09-2022
*/

package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guardian")
public class Guardian {

	@Id
	@Column(name = "u_id")
	private Long userId;

	@Column(name = "guardian_name")
	private String guardianName;

	@Column(name = "guardian_phone")
	private Long guardianPhone;

	public Guardian() {
		super();
	}

	public Guardian(Long userId, String guardianName, Long guardianPhone) {
		super();
		this.userId = userId;
		this.guardianName = guardianName;
		this.guardianPhone = guardianPhone;
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
		return "Guardian [userId=" + userId + ", guardianName=" + guardianName + ", guardianPhone=" + guardianPhone
				+ "]";
	}

}
