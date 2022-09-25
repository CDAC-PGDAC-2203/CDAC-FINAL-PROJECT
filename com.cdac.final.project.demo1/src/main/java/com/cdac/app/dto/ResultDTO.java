package com.cdac.app.dto;

public class ResultDTO {
	private String filePath;
	private String subject;
	private String course;
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public ResultDTO(String filePath, String subject, String course) {
		super();
		this.filePath = filePath;
		this.subject = subject;
		this.course = course;
	}
	public ResultDTO() {
		super();
	}
}
