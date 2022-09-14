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
	private String AddLine1;
	
	@Column(name = "add_line2")
	private String AddLine2;

	@Column(name = "state")
	private String State;
	
	@Column(name = "city")
	private String City;
	
	@Column(name = "pincode")
	private Integer Pincode;

	public UserAddress() {
		super();
	}

	public UserAddress(Long userId, String addLine1, String addLine2, String state, String city, Integer pincode) {
		super();
		this.userId = userId;
		AddLine1 = addLine1;
		AddLine2 = addLine2;
		State = state;
		City = city;
		Pincode = pincode;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAddLine1() {
		return AddLine1;
	}

	public void setAddLine1(String addLine1) {
		AddLine1 = addLine1;
	}

	public String getAddLine2() {
		return AddLine2;
	}

	public void setAddLine2(String addLine2) {
		AddLine2 = addLine2;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Integer getPincode() {
		return Pincode;
	}

	public void setPincode(Integer pincode) {
		Pincode = pincode;
	}

	@Override
	public String toString() {
		return "UserAddress [userId=" + userId + ", AddLine1=" + AddLine1 + ", AddLine2=" + AddLine2 + ", State="
				+ State + ", City=" + City + ", Pincode=" + Pincode + "]";
	}
}
