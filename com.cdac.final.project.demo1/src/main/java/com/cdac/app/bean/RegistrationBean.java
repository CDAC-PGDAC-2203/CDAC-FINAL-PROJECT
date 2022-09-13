package com.cdac.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.CCATStudent;
import com.cdac.app.repositories.IRegistrationRepository;
import com.cdac.app.service.IRegistrationService;

@Transactional
public class RegistrationBean implements IRegistrationService{

	@Autowired
	private IRegistrationRepository repository;

	@Override
	public String checkIfValid(Long ccatNo, String fName) {
		CCATStudent validStudent = repository.findByCcatNoAndFName(ccatNo, fName);
		return null;
	}

}
