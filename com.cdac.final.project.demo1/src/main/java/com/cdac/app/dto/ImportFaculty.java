package com.cdac.app.dto;

public class ImportFaculty {
	private String filePath;
	private String course;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public ImportFaculty(String filePath, String course) {
		super();
		this.filePath = filePath;
		this.course = course;
	}

	public ImportFaculty() {
		super();

	}
}