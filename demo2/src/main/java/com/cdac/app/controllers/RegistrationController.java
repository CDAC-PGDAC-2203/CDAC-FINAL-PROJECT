package com.cdac.app.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	// Input   : ccat_number and first_name
	// Returns : Takes user to registration page
	@PostMapping("/validate")
	public String checkValidStudent(@PathVariable(name = "ccatNo") Long ccatNo, @PathVariable(name = "fName") String fName) {
		return service.checkIfValid(ccatNo, fName);
	}

	// API to fetch data in personal detail page (ajax call)
	// Input   : ccat_number
	// Returns : map (userId, fName, mName, lName, dob)
	@GetMapping("/getDetails")
	public HashMap<String, String> getUserDetails(@PathVariable(name = "ccatNo") Long ccatNo) {
		return service.getUserDetails(ccatNo);
	}

	// API to save personal details in dataBase
	// Input : json in form of object
	@PostMapping("/savePersonalDetails")
	public void savePersonalDetails(@PathVariable(name = "o") Object o) {
		PersonalDetails pDetails = (PersonalDetails)o;
		service.savePersonalDetails(pDetails);
	}
	
	// API to save address details in database
	// Input : json in form of object
	@PostMapping("/saveAddressDetails")
	public void saveAddressDetails(@PathVariable(name = "o") Object o) {
	  UserAddress addressDetails = (UserAddress)o;
	  service.saveAddressDetails(addressDetails);
	}
	
	// API to save guardian details in database
	// Input : json in form of object
	@PostMapping("/saveGuardianDetails")
	public void saveGuardianDetails(@PathVariable(name = "o") Object o) {
		Guardian guardianDetails = (Guardian) o;
		service.saveGuardianDetails(guardianDetails);
	}

	// 
	@PostMapping("/generatePRN")
	public void generatePRN(@PathVariable(name = "courseName") String courseName) {
		service.generatePRN(courseName);
	}
}
