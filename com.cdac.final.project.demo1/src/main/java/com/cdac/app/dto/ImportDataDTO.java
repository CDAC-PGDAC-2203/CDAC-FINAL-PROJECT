package com.cdac.app.dto;

public class ImportDataDTO {
	private String filePath;
	private String subject;

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

	public ImportDataDTO() {
		super();
	}

	public ImportDataDTO(String filePath, String subject) {
		super();
		this.filePath = filePath;
		this.subject = subject;
	}

}