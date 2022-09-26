package com.cdac.app.domain;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class UserId implements Serializable {

	private Long userId;
	private Long ccatNo;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCcatNo() {
		return ccatNo;
	}

	public void setCcatNo(Long ccatNo) {
		this.ccatNo = ccatNo;
	}

	public UserId() {
		super();
	}

	public UserId(Long userId, Long ccatNo) {
		super();
		this.userId = userId;
		this.ccatNo = ccatNo;
	}

	@Override
	public String toString() {
		return "UserId [userId=" + userId + ", ccatNo=" + ccatNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ccatNo, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserId other = (UserId) obj;
		return Objects.equals(ccatNo, other.ccatNo) && Objects.equals(userId, other.userId);
	}

}
