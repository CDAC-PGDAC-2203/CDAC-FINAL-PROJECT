/*
 * CDAC Final Project - CDAC APP
 * @Author: Kamana Mathur [220340120098]
 * @Date: 16-09-2022
*/

package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doubt_forum")
public class DoubtForum {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "d_id")
	private Long doubtId;
	
	@Column(name = "u_prn")
	private Long userPrn;
	
	@Column(name = "u_name")
	private String userName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "sub_name")
	private String subjectName;
	
	@Column(name = "doubt_content")
	private String doubtContent;
	
	@Column(name = "attachment")
	private String attachment;
	
	@Column(name = "active_doubt")
	private String activeDoubt;
	
	public DoubtForum() {
	}

	public DoubtForum(Long doubtId, Long userPrn, String userName, String email, String subjectName,
			String doubtContent, String attachment, String activeDoubt) {
		super();
		this.doubtId = doubtId;
		this.userPrn = userPrn;
		this.userName = userName;
		this.email = email;
		this.subjectName = subjectName;
		this.doubtContent = doubtContent;
		this.attachment = attachment;
		this.activeDoubt = activeDoubt;
	}

	public Long getDoubtId() {
		return doubtId;
	}

	public void setDoubtId(Long doubtId) {
		this.doubtId = doubtId;
	}

	public Long getUserPrn() {
		return userPrn;
	}

	public void setUserPrn(Long userPrn) {
		this.userPrn = userPrn;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getActiveDoubt() {
		return activeDoubt;
	}

	public void setActiveDoubt(String activeDoubt) {
		this.activeDoubt = activeDoubt;
	}

	@Override
	public String toString() {
		return "DoubtForum [doubtId=" + doubtId + ", userPrn=" + userPrn + ", userName=" + userName + ", email=" + email
				+ ", subjectName=" + subjectName + ", doubtContent=" + doubtContent + ", attachment=" + attachment
				+ ", activeDoubt=" + activeDoubt + "]";
	}
	
	
	
}
