package com.cdac.app.service;

import com.cdac.app.domain.CCATStudent;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.UserAddress;

public interface IRegistrationService {
	public CCATStudent checkIfValid(Long ccatNo, String fName);

	public void saveUser(Long ccatNo, String fName);

	public PersonalDetails savePersonalDetails(PersonalDetails pDetails);

	public UserAddress saveAddressDetails(UserAddress addressDetails);

	public void generatePRN(String courseName);
}
