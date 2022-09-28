package com.cdac.app.service;

import com.cdac.app.domain.CCATStudent;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.UserAddress;

public interface IRegistrationService {
	public CCATStudent checkIfValid(Long ccatNo, String fName);

	public void saveUser(Long ccatNo, String fName);

	public PersonalDetails savePersonalDetails(PersonalDetails pDetails) throws Exception;

	public UserAddress saveAddressDetails(UserAddress addressDetails) throws Exception;
	
	public void removeDataFromUserTable(PersonalDetails pDetail);

	public void generatePRN(String courseName) throws Exception;
}
