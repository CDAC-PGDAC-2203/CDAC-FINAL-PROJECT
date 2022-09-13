package com.cdac.app.service;

import com.cdac.app.domain.CCATStudent;

public interface IRegistrationService {
	public String checkIfValid(Long ccatNo,String fName);
}
