package com.cdac.app.dto;

public class DoubtDTO {

	private Long uPrn;
	private String subjectName;
	private String doubtContent;
	private String attachment;

	public DoubtDTO() {
		super();
	}

	public DoubtDTO(Long uPrn, String subjectName, String doubtContent, String attachment) {
		super();
		this.uPrn = uPrn;
		this.subjectName = subjectName;
		this.doubtContent = doubtContent;
		this.attachment = attachment;
	}

	public Long getuPrn() {
		return uPrn;
	}

	public void setuPrn(Long uPrn) {
		this.uPrn = uPrn;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getDoubtContent() {
		return doubtContent;
	}

	public void setDoubtContent(String doubtContent) {
		this.doubtContent = doubtContent;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	@Override
	public String toString() {
		return "DoubtDTO [uPrn=" + uPrn + ", subjectName=" + subjectName + ", doubtContent=" + doubtContent
				+ ", attachment=" + attachment + "]";
	}
}
