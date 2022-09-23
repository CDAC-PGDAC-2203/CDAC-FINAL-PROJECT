package com.cdac.app.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lecture_link")
public class LectureLink {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "course")
	private String course;
	
	@Column(name = "session_date")
	private LocalDate sessionDate;
	
	@Column(name = "lect_link")
	private String theoryLink;

	@Column(name = "b1_link")
	private String b1Link;

	@Column(name = "b2_link")
	private String b2Link;

	@Column(name = "b3_link")
	private String b3Link;

	@Column(name = "b4_link")
	private String b4Link;

	public LectureLink() {
		super();
	}

	public LectureLink(Integer id, String course, LocalDate sessionDate, String theoryLink, String b1Link,
			String b2Link, String b3Link, String b4Link) {
		super();
		this.id = id;
		this.course = course;
		this.sessionDate = sessionDate;
		this.theoryLink = theoryLink;
		this.b1Link = b1Link;
		this.b2Link = b2Link;
		this.b3Link = b3Link;
		this.b4Link = b4Link;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public LocalDate getSessionDate() {
		return sessionDate;
	}

	public void setSessionDate(LocalDate sessionDate) {
		this.sessionDate = sessionDate;
	}

	public String getTheoryLink() {
		return theoryLink;
	}

	public void setTheoryLink(String theoryLink) {
		this.theoryLink = theoryLink;
	}

	public String getB1Link() {
		return b1Link;
	}

	public void setB1Link(String b1Link) {
		this.b1Link = b1Link;
	}

	public String getB2Link() {
		return b2Link;
	}

	public void setB2Link(String b2Link) {
		this.b2Link = b2Link;
	}

	public String getB3Link() {
		return b3Link;
	}

	public void setB3Link(String b3Link) {
		this.b3Link = b3Link;
	}

	public String getB4Link() {
		return b4Link;
	}

	public void setB4Link(String b4Link) {
		this.b4Link = b4Link;
	}

	@Override
	public String toString() {
		return "LectureLink [id=" + id + ", course=" + course + ", sessionDate=" + sessionDate + ", theoryLink="
				+ theoryLink + ", b1Link=" + b1Link + ", b2Link=" + b2Link + ", b3Link=" + b3Link + ", b4Link=" + b4Link
				+ "]";
	}

}
