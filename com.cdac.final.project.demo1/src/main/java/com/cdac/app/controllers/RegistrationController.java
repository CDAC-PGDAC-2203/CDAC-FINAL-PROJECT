package com.cdac.app.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.domain.Guardian;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.service.IRegistrationService;

@RestController("/register")
public class RegistrationController {

	@Autowired
	private IRegistrationService service;

	// API to check if student is valid for registration
	@PostMapping("/validate")
	public String checkValidStudent(Long ccatNo, String fName) {
		return service.checkIfValid(ccatNo, fName);
	}

	// API to fetch data in personal detail page (ajax call)
	@GetMapping("/getDetails")
	public HashMap<String, String> getUserDetails(Long ccatNo) {
		return service.getUserDetails(ccatNo);
	}

	// API to save personal details in dataBase
	@PostMapping("/savePersonalDetails")
	public void savePersonalDetails(Object o) {
		PersonalDetails pDetails = (PersonalDetails)o;
		service.savePersonalDetails(pDetails);
	}
	
	// API to save address details in database
	@PostMapping("/saveAddressDetails")
	public void saveAddressDetails(Object o) {
	  UserAddress addressDetails = (UserAddress)o;
	  service.saveAddressDetails(addressDetails);
	}
	
	// API to save guardian details in database
	@PostMapping("/saveGuardianDetails")
	public void saveGuardianDetails(Object o) {
		Guardian guardianDetails = (Guardian) o;
		service.saveGuardianDetails(guardianDetails);
	}
}
