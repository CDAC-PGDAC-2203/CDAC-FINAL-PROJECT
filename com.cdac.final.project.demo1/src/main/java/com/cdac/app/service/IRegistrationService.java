package com.cdac.app.service;

import java.util.HashMap;

import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.UserAddress;

public interface IRegistrationService {
	public String checkIfValid(Long ccatNo,String fName);
	public void saveUser(Long ccatNo,String fName);
	public HashMap<String, Object> getUserDetails(Long ccatNo);
	public void savePersonalDetails(PersonalDetails pDetails);
	public void saveAddressDetails(UserAddress addressDetails);
	public void generatePRN(String courseName);
}
