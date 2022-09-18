/*
 * CDAC Final Project - CDAC APP
 * @Author: Joy Pahari [220340120092]
 * @Date: 16-09-2022
*/

package com.cdac.app.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "total_attendance")
@IdClass(AttendanceId.class)
public class TotalAttendance {

	@Id
	@Column(name = "u_prn")
	private Long uPrn;

	@Id
	@Column(name = "module")
	private String module;

	@Column(name = "attended_lecture")
	private Integer attendedLecture;

	@Column(name = "total_lecture")
	private Integer total_lecture;

	public TotalAttendance() {
		super();
	}

	public TotalAttendance(Long uPrn, String module, Integer attendedLecture, Integer total_lecture) {
		super();
		this.uPrn = uPrn;
		this.module = module;
		this.attendedLecture = attendedLecture;
		this.total_lecture = total_lecture;
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

	public Integer getAttendedLecture() {
		return attendedLecture;
	}

	public void setAttendedLecture(Integer attendedLecture) {
		this.attendedLecture = attendedLecture;
	}

	public Integer getTotal_lecture() {
		return total_lecture;
	}

	public void setTotal_lecture(Integer total_lecture) {
		this.total_lecture = total_lecture;
	}

	@Override
	public String toString() {
		return "TotalAttendance [uPrn=" + uPrn + ", module=" + module + ", attendedLecture=" + attendedLecture
				+ ", total_lecture=" + total_lecture + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(attendedLecture, module, total_lecture, uPrn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TotalAttendance other = (TotalAttendance) obj;
		return Objects.equals(attendedLecture, other.attendedLecture) && Objects.equals(module, other.module)
				&& Objects.equals(total_lecture, other.total_lecture) && Objects.equals(uPrn, other.uPrn);
	}

}
