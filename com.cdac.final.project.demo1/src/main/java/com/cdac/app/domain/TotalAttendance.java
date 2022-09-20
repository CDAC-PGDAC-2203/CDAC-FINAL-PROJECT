/*
 * CDAC Final Project - CDAC APP
 * @Author: Joy Pahari [220340120092]
 * @Date: 16-09-2022
*/

package com.cdac.app.domain;

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
	private Integer totalLecture;

	public TotalAttendance() {
		super();
	}

	public TotalAttendance(Long uPrn, String module, Integer attendedLecture, Integer totalLecture) {
		super();
		this.uPrn = uPrn;
		this.module = module;
		this.attendedLecture = attendedLecture;
		this.totalLecture = totalLecture;
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

	public Integer getTotalLecture() {
		return totalLecture;
	}

	public void setTotalLecture(Integer totalLecture) {
		this.totalLecture = totalLecture;
	}

	@Override
	public String toString() {
		return "TotalAttendance [uPrn=" + uPrn + ", module=" + module + ", attendedLecture=" + attendedLecture
				+ ", totalLecture=" + totalLecture + "]";
	}

}
