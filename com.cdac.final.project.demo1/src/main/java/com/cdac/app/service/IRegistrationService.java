package com.cdac.app.service;

import java.util.HashMap;

import com.cdac.app.domain.PersonalDetails;

public interface IRegistrationService {
	public String checkIfValid(Long ccatNo,String fName);
	public void saveUser(Long ccatNo,String fName);
	public HashMap<String, String> getUserDetails(Long ccatNo);
	public void savePersonalDetails(PersonalDetails pDetails);
}
