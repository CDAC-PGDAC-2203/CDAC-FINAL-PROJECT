package com.cdac.app.service;

import java.util.HashMap;

public interface IRegistrationService {
	public String checkIfValid(Long ccatNo,String fName);
	public void saveUser(Long ccatNo,String fName);
	public HashMap<String, String> getUserDetails(Long ccatNo);
}
