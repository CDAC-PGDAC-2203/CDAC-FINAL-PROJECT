package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
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

	public UserToken() {
		super();
	}

	public UserToken(Long uPrn, String token) {
		super();
		this.uPrn = uPrn;
		this.token = token;
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

	@Override
	public String toString() {
		return "UserToken [uPrn=" + uPrn + ", token=" + token + "]";
	}
}