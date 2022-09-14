package com.cdac.app.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.service.IRegistrationService;

@RestController("/register")
public class RegistrationController {

	@Autowired
	private IRegistrationService service;

	// To check if student is valid for registration
	@PostMapping("/validate")
	public String checkValidStudent(Long ccatNo, String fName) {
		return service.checkIfValid(ccatNo, fName);
	}

	// To fetch data in personal detail page (ajax call)
	@GetMapping("/getDetails")
	public HashMap<String, String> getUserDetails(Long ccatNo) {
		return service.getUserDetails(ccatNo);
	}

	// To save personal details in dataBase
	@PostMapping("/savePersonalDetails")
	public void savePersonalDetails(Object o) {
		PersonalDetails pDetails = (PersonalDetails)o;
	}
}
