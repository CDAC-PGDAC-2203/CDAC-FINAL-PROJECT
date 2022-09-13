package com.cdac.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.domain.CCATStudent;
import com.cdac.app.service.IRegistrationService;

@RestController("/register")
public class RegistrationController {

	@Autowired
	private IRegistrationService service;

	@PostMapping("/validate")
	public String checkValidStudent(Long ccatNo, String fName) {
		return service.checkIfValid(ccatNo, fName);
	}
}
