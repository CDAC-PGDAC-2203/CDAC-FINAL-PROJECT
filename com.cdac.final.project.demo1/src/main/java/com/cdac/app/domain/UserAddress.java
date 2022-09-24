/*
 * CDAC Final Project - CDAC APP
 * @Author: Udit Keskar [220340120100]
 * @Date: 13-09-2022 
 */
package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_address")
public class UserAddress {

	@Id
	@Column(name = "u_id")
	private Long userId;

	@Column(name = "add_line1")
	private String addLine1;

	@Column(name = "add_line2")
	private String addLine2;

	@Column(name = "state")
	private String state;

	@Column(name = "city")
	private String city;

	@Column(name = "pincode")
	private Integer pincode;

	public UserAddress() {
		super();
	}

	public UserAddress(Long userId, String addLine1, String addLine2, String state, String city, Integer pincode) {
		super();
		this.userId = userId;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "UserAddress [userId=" + userId + ", AddLine1=" + addLine1 + ", AddLine2=" + addLine2 + ", State="
				+ state + ", City=" + city + ", Pincode=" + pincode + "]";
	}
}
