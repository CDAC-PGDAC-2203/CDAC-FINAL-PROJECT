package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty {

	@Id
	@Column(name = "faculty_id")
	private Long facultyId;

	@Column(name = "faculty_name")
	private String facultyName;

	@Column(name = "visibility_flag")
	private String visibilityFlag;

	@Column(name = "course")
	private String course;

	public Faculty() {
		super();
	}

	public Faculty(Long facultyId, String facultyName, String visibilityFlag, String course) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.visibilityFlag = visibilityFlag;
		this.course = course;
	}

	public Long getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getVisibilityFlag() {
		return visibilityFlag;
	}

	public void setVisibilityFlag(String visibilityFlag) {
		this.visibilityFlag = visibilityFlag;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "FacultyList [facultyId=" + facultyId + ", facultyName=" + facultyName + ", visibilityFlag="
				+ visibilityFlag + ", course=" + course + "]";
	}	
}