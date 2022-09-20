/*
 * CDAC Final Project - CDAC APP
 * @Author: Udit Keskar [220340120100]
 * @Date: 16-09-2022
*/

package com.cdac.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "final_result_table")
public class FinalResultTable {

	@Id
	@Column(name = "u_prn")
	private Long uPrn;

	@Column(name = "mod1")
	private Integer mod1;

	@Column(name = "mod2")
	private Integer mod2;

	@Column(name = "mod3")
	private Integer mod3;

	@Column(name = "mod4")
	private Integer mod4;

	@Column(name = "mod5")
	private Integer mod5;

	@Column(name = "mod6")
	private Integer mod6;

	@Column(name = "mod7")
	private Integer mod7;

	@Column(name = "mod8")
	private Integer mod8;

	public FinalResultTable() {
		super();
	}

	@Override
	public String toString() {
		return "FinalResultTable [uPrn=" + uPrn + ", mod1=" + mod1 + ", mod2=" + mod2 + ", mod3=" + mod3 + ", mod4="
				+ mod4 + ", mod5=" + mod5 + ", mod6=" + mod6 + ", mod7=" + mod7 + ", mod8=" + mod8 + "]";
	}

	public Long getuPrn() {
		return uPrn;
	}

	public void setuPrn(Long uPrn) {
		this.uPrn = uPrn;
	}

	public Integer getMod1() {
		return mod1;
	}

	public void setMod1(Integer mod1) {
		this.mod1 = mod1;
	}

	public Integer getMod2() {
		return mod2;
	}

	public void setMod2(Integer mod2) {
		this.mod2 = mod2;
	}

	public Integer getMod3() {
		return mod3;
	}

	public void setMod3(Integer mod3) {
		this.mod3 = mod3;
	}

	public Integer getMod4() {
		return mod4;
	}

	public void setMod4(Integer mod4) {
		this.mod4 = mod4;
	}

	public Integer getMod5() {
		return mod5;
	}

	public void setMod5(Integer mod5) {
		this.mod5 = mod5;
	}

	public Integer getMod6() {
		return mod6;
	}

	public void setMod6(Integer mod6) {
		this.mod6 = mod6;
	}

	public Integer getMod7() {
		return mod7;
	}

	public void setMod7(Integer mod7) {
		this.mod7 = mod7;
	}

	public Integer getMod8() {
		return mod8;
	}

	public void setMod8(Integer mod8) {
		this.mod8 = mod8;
	}

	public FinalResultTable(Long uPrn, Integer mod1, Integer mod2, Integer mod3, Integer mod4, Integer mod5,
			Integer mod6, Integer mod7, Integer mod8) {
		super();
		this.uPrn = uPrn;
		this.mod1 = mod1;
		this.mod2 = mod2;
		this.mod3 = mod3;
		this.mod4 = mod4;
		this.mod5 = mod5;
		this.mod6 = mod6;
		this.mod7 = mod7;
		this.mod8 = mod8;
	}

}
