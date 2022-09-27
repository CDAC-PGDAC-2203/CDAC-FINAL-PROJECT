package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modules")
public class Modules {

	@Id
	@Column(name = "course")
	private String course;

	@Column(name = "mod1")
	private String mod1;

	@Column(name = "mod2")
	private String mod2;

	@Column(name = "mod3")
	private String mod3;

	@Column(name = "mod4")
	private String mod4;

	@Column(name = "mod5")
	private String mod5;

	@Column(name = "mod6")
	private String mod6;

	@Column(name = "mod7")
	private String mod7;

	@Column(name = "mod8")
	private String mod8;

	public Modules() {
		super();
	}

	public Modules(String course, String mod1, String mod2, String mod3, String mod4, String mod5, String mod6,
			String mod7, String mod8) {
		super();
		this.course = course;
		this.mod1 = mod1;
		this.mod2 = mod2;
		this.mod3 = mod3;
		this.mod4 = mod4;
		this.mod5 = mod5;
		this.mod6 = mod6;
		this.mod7 = mod7;
		this.mod8 = mod8;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMod1() {
		return mod1;
	}

	public void setMod1(String mod1) {
		this.mod1 = mod1;
	}

	public String getMod2() {
		return mod2;
	}

	public void setMod2(String mod2) {
		this.mod2 = mod2;
	}

	public String getMod3() {
		return mod3;
	}

	public void setMod3(String mod3) {
		this.mod3 = mod3;
	}

	public String getMod4() {
		return mod4;
	}

	public void setMod4(String mod4) {
		this.mod4 = mod4;
	}

	public String getMod5() {
		return mod5;
	}

	public void setMod5(String mod5) {
		this.mod5 = mod5;
	}

	public String getMod6() {
		return mod6;
	}

	public void setMod6(String mod6) {
		this.mod6 = mod6;
	}

	public String getMod7() {
		return mod7;
	}

	public void setMod7(String mod7) {
		this.mod7 = mod7;
	}

	public String getMod8() {
		return mod8;
	}

	public void setMod8(String mod8) {
		this.mod8 = mod8;
	}

	@Override
	public String toString() {
		return "Modules [course=" + course + ", mod1=" + mod1 + ", mod2=" + mod2 + ", mod3=" + mod3 + ", mod4=" + mod4
				+ ", mod5=" + mod5 + ", mod6=" + mod6 + ", mod7=" + mod7 + ", mod8=" + mod8 + "]";
	}

}
