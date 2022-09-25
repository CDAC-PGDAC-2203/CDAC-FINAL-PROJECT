package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_token")
public class UserToken {

	@Id
	@Column(name = "u_prn")
	private Long uPrn;

	@Column(name = "token")
	private String token;

	@Enumerated(EnumType.STRING)
	@Column(name = "u_role")
	private Role uRole;

	public UserToken() {
		super();
	}

	public UserToken(Long uPrn, String token, Role uRole) {
		super();
		this.uPrn = uPrn;
		this.token = token;
		this.uRole = uRole;
	}

	public Long getuPrn() {
		return uPrn;
	}

	public void setuPrn(Long uPrn) {
		this.uPrn = uPrn;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Role getuRole() {
		return uRole;
	}

	public void setuRole(Role uRole) {
		this.uRole = uRole;
	}

	@Override
	public String toString() {
		return "UserToken [uPrn=" + uPrn + ", token=" + token + ", role=" + uRole + "]";
	}
}