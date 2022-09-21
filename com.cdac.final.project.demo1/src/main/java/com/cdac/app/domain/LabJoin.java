package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="lab_join_table")
public class LabJoin {
     
	@Column(name = "u_prn")
	private long uPrn;

	@Column(name = "lab_b1")
	private String labB1;
	
	@Column(name = "lab_b2")
	private String labB2;
	
	@Column(name = "lab_b3")
	private String labB3;
	
	@Column(name = "lab_b4")
	private String labB4;
	
	public LabJoin() {
		
	}

	public LabJoin(long uPrn, String labB1, String labB2, String labB3, String labB4) {
		super();
		this.uPrn = uPrn;
		this.labB1 = labB1;
		this.labB2 = labB2;
		this.labB3 = labB3;
		this.labB4 = labB4;
	}

	public long getuPrn() {
		return uPrn;
	}

	public void setuPrn(long uPrn) {
		this.uPrn = uPrn;
	}

	public String getLabB1() {
		return labB1;
	}

	public void setLabB1(String labB1) {
		this.labB1 = labB1;
	}

	public String getLabB2() {
		return labB2;
	}

	public void setLabB2(String labB2) {
		this.labB2 = labB2;
	}

	public String getLabB3() {
		return labB3;
	}

	public void setLabB3(String labB3) {
		this.labB3 = labB3;
	}

	public String getLabB4() {
		return labB4;
	}

	public void setLabB4(String labB4) {
		this.labB4 = labB4;
	}

	@Override
	public String toString() {
		return "LabJoin [uPrn=" + uPrn + ", labB1=" + labB1 + ", labB2=" + labB2 + ", labB3=" + labB3 + ", labB4="
				+ labB4 + "]";
	}
	
	
	
}
