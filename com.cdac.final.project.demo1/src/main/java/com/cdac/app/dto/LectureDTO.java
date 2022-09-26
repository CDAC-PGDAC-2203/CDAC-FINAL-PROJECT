package com.cdac.app.dto;

public class LectureDTO {
	private String day;

	private String month;

	private String year;

	private String course;

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "LectureDTO [day=" + day + ", month=" + month + ", year=" + year + ", course=" + course + "]";
	}

	public LectureDTO(String day, String month, String year, String course) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.course = course;
	}

	public LectureDTO() {
		super();
	}

}
