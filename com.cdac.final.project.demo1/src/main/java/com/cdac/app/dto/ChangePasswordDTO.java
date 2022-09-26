package com.cdac.app.dto;

public class ChangePasswordDTO {

	private String oldPassword;

	private String newPassword;

	private Long uPrn;

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public Long getuPrn() {
		return uPrn;
	}

	public void setuPrn(Long uPrn) {
		this.uPrn = uPrn;
	}

	public ChangePasswordDTO(String oldPassword, String newPassword, Long uPrn) {
		super();
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.uPrn = uPrn;
	}

	public ChangePasswordDTO() {
		super();
	}

	@Override
	public String toString() {
		return "ChangePasswordDTO [oldPassword=" + oldPassword + ", newPassword=" + newPassword + ", uPrn=" + uPrn
				+ "]";
	}

}
