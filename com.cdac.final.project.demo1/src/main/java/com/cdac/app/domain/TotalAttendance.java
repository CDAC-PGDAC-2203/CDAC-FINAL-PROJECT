package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "total_attendance")
public class TotalAttendance {

	@Column(name = "u_prn")
	private Long uPrn;

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

}
