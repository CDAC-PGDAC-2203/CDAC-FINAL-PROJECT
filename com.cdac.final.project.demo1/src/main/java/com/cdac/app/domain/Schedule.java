/*
 * CDAC Final Project - CDAC APP
 * @Author: Udit Keskar [220340120100]
 * @Date: 16-09-2022
*/

package com.cdac.app.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedule_table")
public class Schedule {

	@Id
	@Column(name = "today_date")
	private LocalDate date;

	@Column(name = "module")
	private String moduleName;

	@Column(name = "lect_link")
	private String lectLink;

	@Column(name = "lab_b1_link")
	private String labB1Link;

	@Column(name = "lab_b2_link")
	private String labB2Link;

	@Column(name = "lab_b3_link")
	private String labB3Link;

	@Column(name = "lab_b4_link")
	private String labB4Link;

	public Schedule() {
		super();
	}

	public Schedule(LocalDate date, String moduleName, String lectLink, String labB1Link, String labB2Link,
			String labB3Link, String labB4Link) {
		super();
		this.date = date;
		this.moduleName = moduleName;
		this.lectLink = lectLink;
		this.labB1Link = labB1Link;
		this.labB2Link = labB2Link;
		this.labB3Link = labB3Link;
		this.labB4Link = labB4Link;
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

	public String getLabB1Link() {
		return labB1Link;
	}

	public void setLabB1Link(String labB1Link) {
		this.labB1Link = labB1Link;
	}

	public String getLabB2Link() {
		return labB2Link;
	}

	public void setLabB2Link(String labB2Link) {
		this.labB2Link = labB2Link;
	}

	public String getLabB3Link() {
		return labB3Link;
	}

	public void setLabB3Link(String labB3Link) {
		this.labB3Link = labB3Link;
	}

	public String getLabB4Link() {
		return labB4Link;
	}

	public void setLabB4Link(String labB4Link) {
		this.labB4Link = labB4Link;
	}

	@Override
	public String toString() {
		return "Schedule [date=" + date + ", moduleName=" + moduleName + ", lectLink=" + lectLink + ", labB1Link="
				+ labB1Link + ", labB2Link=" + labB2Link + ", labB3Link=" + labB3Link + ", labB4Link=" + labB4Link
				+ "]";
	}

}
