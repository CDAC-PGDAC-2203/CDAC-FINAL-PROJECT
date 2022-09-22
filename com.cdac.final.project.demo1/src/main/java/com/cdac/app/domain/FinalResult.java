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
@Table(name = "final_result")
public class FinalResult {

	@Id
	@Column(name = "u_prn")
	private Long uPrn;

	@Column(name = "mod1")
	private Long mod1;

	@Column(name = "mod2")
	private Long mod2;

	@Column(name = "mod3")
	private Long mod3;

	@Column(name = "mod4")
	private Long mod4;

	@Column(name = "mod5")
	private Long mod5;

	@Column(name = "mod6")
	private Long mod6;

	@Column(name = "mod7")
	private Long mod7;

	@Column(name = "mod8")
	private Long mod8;

	public FinalResult() {
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

	public Long getMod1() {
		return mod1;
	}

	public void setMod1(Long mod1) {
		this.mod1 = mod1;
	}

	public Long getMod2() {
		return mod2;
	}

	public void setMod2(Long mod2) {
		this.mod2 = mod2;
	}

	public Long getMod3() {
		return mod3;
	}

	public void setMod3(Long mod3) {
		this.mod3 = mod3;
	}

	public Long getMod4() {
		return mod4;
	}

	public void setMod4(Long mod4) {
		this.mod4 = mod4;
	}

	public Long getMod5() {
		return mod5;
	}

	public void setMod5(Long mod5) {
		this.mod5 = mod5;
	}

	public Long getMod6() {
		return mod6;
	}

	public void setMod6(Long mod6) {
		this.mod6 = mod6;
	}

	public Long getMod7() {
		return mod7;
	}

	public void setMod7(Long mod7) {
		this.mod7 = mod7;
	}

	public Long getMod8() {
		return mod8;
	}

	public void setMod8(Long mod8) {
		this.mod8 = mod8;
	}

	public FinalResult(Long uPrn, Long mod1, Long mod2, Long mod3, Long mod4, Long mod5,
			Long mod6, Long mod7, Long mod8) {
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
