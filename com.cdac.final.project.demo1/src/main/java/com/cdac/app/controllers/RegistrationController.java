package com.cdac.app.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.service.IRegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private IRegistrationService service;

	@GetMapping("/register")
	public String openRegistrationForm(){
		return "/registration";
	}

	// API to check if student is valid for registration
	@PostMapping("/register/validate/{ccatNo}/{fName}")
	public String checkValidStudent(@PathVariable(name = "ccatNo") Long ccatNo,
			@PathVariable(name = "fName") String fName) {
		return service.checkIfValid(ccatNo, fName);
	}

	// API to fetch data in personal detail page (Ajax call)
	@GetMapping("/register/details/{ccatNo}")
	public HashMap<String, Object> getUserDetails(@PathVariable(name = "ccatNo") Long ccatNo) {
		return service.getUserDetails(ccatNo);
	}

	// API to save personal details in dataBase
	@PostMapping("/register/details")
	public void savePersonalDetails(@RequestBody PersonalDetails pDetails) {
		service.savePersonalDetails(pDetails);
	}

	// API to save address details in database
	@PostMapping("/register/address")
	public void saveAddressDetails(@RequestBody UserAddress addressDetails) {
		service.saveAddressDetails(addressDetails);
	}

}
