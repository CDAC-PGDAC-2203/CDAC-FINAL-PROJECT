package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notice")
public class Notice {

	@Id
	@Column(name = "notice_name")
	private String noticeName;

	@Column(name = "notice_link")
	private String noticeLink;

	@Column(name = "visibility")
	private String visibility;

	public Notice() {
		super();
	}

	public Notice(String noticeName, String noticeLink, String visibility) {
		super();
		this.noticeName = noticeName;
		this.noticeLink = noticeLink;
		this.visibility = visibility;
	}

	public String getNoticeName() {
		return noticeName;
	}

	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}

	public String getNoticeLink() {
		return noticeLink;
	}

	public void setNoticeLink(String noticeLink) {
		this.noticeLink = noticeLink;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	@Override
	public String toString() {
		return "Notice [noticeName=" + noticeName + ", noticeLink=" + noticeLink + ", visibility=" + visibility + "]";
	}
}
