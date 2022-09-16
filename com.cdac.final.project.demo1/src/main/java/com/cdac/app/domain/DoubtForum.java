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
	
}
