/*
 * CDAC Final Project - CDAC APP
 * @Author: Joy Pahari [220340120092]
 * @Date: 16-09-2022
*/

package com.cdac.app.domain;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "current_day_attendance")
@IdClass(AttendanceId.class)
public class CurrentDayAttendance {

	@Id
	@Column(name = "u_prn")
	private Long uPrn;

	@Id
	@Column(name = "module")
	private String module;

	@Column(name = "today_date")
	private LocalDate todayDate;

	@Column(name = "lecture_attendance")
	private Integer lectureAttendance;

	@Column(name = "lab_attendance")
	private Integer labAttendance;

	@Column(name = "total_attended")
	private Integer totalAttended;

	@Column(name = "lecture_count")
	private Integer lectureCount;

	public CurrentDayAttendance() {
		super();
	}

	public CurrentDayAttendance(Long uPrn, String module, LocalDate todayDate, Integer lectureAttendance,
			Integer labAttendance, Integer totalAttended, Integer lectureCount) {
		super();
		this.uPrn = uPrn;
		this.module = module;
		this.todayDate = todayDate;
		this.lectureAttendance = lectureAttendance;
		this.labAttendance = labAttendance;
		this.totalAttended = totalAttended;
		this.lectureCount = lectureCount;
	}

	public Long getuPrn() {
		return uPrn;
	}

	public void setuPrn(Long uPrn) {
		this.uPrn = uPrn;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public LocalDate getTodayDate() {
		return todayDate;
	}

	public void setTodayDate(LocalDate todayDate) {
		this.todayDate = todayDate;
	}

	public Integer getLectureAttendance() {
		return lectureAttendance;
	}

	public void setLectureAttendance(Integer lectureAttendance) {
		this.lectureAttendance = lectureAttendance;
	}

	public Integer getLabAttendance() {
		return labAttendance;
	}

	public void setLabAttendance(Integer labAttendance) {
		this.labAttendance = labAttendance;
	}

	public Integer getTotalAttended() {
		return totalAttended;
	}

	public void setTotalAttended(Integer totalAttended) {
		this.totalAttended = totalAttended;
	}

	public Integer getLectureCount() {
		return lectureCount;
	}

	public void setLectureCount(Integer lectureCount) {
		this.lectureCount = lectureCount;
	}

	@Override
	public String toString() {
		return "CurrentDayAttendance [uPrn=" + uPrn + ", module=" + module + ", todayDate=" + todayDate
				+ ", lectureAttendance=" + lectureAttendance + ", labAttendance=" + labAttendance + ", totalAttended="
				+ totalAttended + ", lectureCount=" + lectureCount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(labAttendance, lectureAttendance, lectureCount, module, todayDate, totalAttended, uPrn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrentDayAttendance other = (CurrentDayAttendance) obj;
		return Objects.equals(labAttendance, other.labAttendance)
				&& Objects.equals(lectureAttendance, other.lectureAttendance)
				&& Objects.equals(lectureCount, other.lectureCount) && Objects.equals(module, other.module)
				&& Objects.equals(todayDate, other.todayDate) && Objects.equals(totalAttended, other.totalAttended)
				&& Objects.equals(uPrn, other.uPrn);
	}

}
