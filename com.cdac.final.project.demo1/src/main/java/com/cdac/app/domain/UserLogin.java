package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_login")
@Getter
@Setter
@ToString
public class UserLogin {
	@Column(name = "u_id")
	private Long userId;
	@Column(name = "user_name")
	private Long userName;
	@Column(name = "password")
	private String password;

}
