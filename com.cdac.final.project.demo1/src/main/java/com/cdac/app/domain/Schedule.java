package com.cdac.app.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule {

	@Id
	@Column(name = "today_date")
	private LocalDate date;

	@Column(name = "module")
	private String moduleName;

	@Column(name = "lect_link")
	private String lectLink;

	@Column(name = "lab_link")
	private String labLink;

	public Schedule() {
		super();
	}

	public Schedule(LocalDate date, String moduleName, String lectLink, String labLink) {
		super();
		this.date = date;
		this.moduleName = moduleName;
		this.lectLink = lectLink;
		this.labLink = labLink;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getLectLink() {
		return lectLink;
	}

	public void setLectLink(String lectLink) {
		this.lectLink = lectLink;
	}

	public String getLabLink() {
		return labLink;
	}

	public void setLabLink(String labLink) {
		this.labLink = labLink;
	}

	@Override
	public String toString() {
		return "Schedule [date=" + date + ", moduleName=" + moduleName + ", lectLink=" + lectLink + ", labLink="
				+ labLink + "]";
	}

}
