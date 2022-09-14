package com.cdac.app.service;

public interface IRegistrationService {
	public String checkIfValid(Long ccatNo,String fName);
	public void saveUser(Long ccatNo,String fName);
}
