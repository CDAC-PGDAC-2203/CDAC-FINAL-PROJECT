package com.cdac.app.service;

import com.cdac.app.domain.CCATStudent;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.UserAddress;

public interface IRegistrationService {
	public CCATStudent checkIfValid(Long ccatNo,String fName);
	public void saveUser(Long ccatNo,String fName);
	//public HashMap<String, Object> getUserDetails(Long ccatNo);
	public void savePersonalDetails(PersonalDetails pDetails);
	public void saveAddressDetails(UserAddress addressDetails);
	public void generatePRN(String courseName);
}
