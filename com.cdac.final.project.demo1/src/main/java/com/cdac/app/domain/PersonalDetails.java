/*
 * CDAC Final Project - CDAC APP
 * @Author: Mayank Sachan [220340120120]
 * @Date: 13-09-2022 
 */
package com.cdac.app.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personal_details")
public class PersonalDetails {

	@Id
	@Column(name = "u_id")
	private Long userId;

	@Column(name = "f_name")
	private String fName;

	@Column(name = "m_name")
	private String mName;

	@Column(name = "l_name")
	private String lName;
	
	@Column(name = "gender")
	private String gender;

	@Column(name = "dob")
	private LocalDate dob;

	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private Long phone;
	
	@Column(name = "qualification")
	private String qualification;
	
	@Column(name = "photo")
	private String photo;

	@Column(name = "course")
	private String course;
	
	@Column(name = "guardian_name")
	private String guardianName;

	@Column(name = "guardian_phone")
	private Long guardianPhone;

	public PersonalDetails() {
		super();
	}

	public PersonalDetails(Long userId, String fName, String mName, String lName, String gender, LocalDate dob,
			String email, Long phone, String qualification, String photo, String course, String guardianName,
			Long guardianPhone) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.qualification = qualification;
		this.photo = photo;
		this.course = course;
		this.guardianName = guardianName;
		this.guardianPhone = guardianPhone;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
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
		return "PersonalDetails [userId=" + userId + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName
				+ ", gender=" + gender + ", dob=" + dob + ", email=" + email + ", phone=" + phone + ", qualification="
				+ qualification + ", photo=" + photo + ", course=" + course + ", guardianName=" + guardianName
				+ ", guardianPhone=" + guardianPhone + "]";
	}
}
