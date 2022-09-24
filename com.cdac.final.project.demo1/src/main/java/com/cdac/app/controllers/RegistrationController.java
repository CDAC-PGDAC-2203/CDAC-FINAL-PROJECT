package com.cdac.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cdac.app.domain.CCATStudent;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.dto.ValidStudent;
import com.cdac.app.service.IRegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private IRegistrationService service;

	@GetMapping("/register")
	public String openRegistrationForm() {
		return "/registration";
	}

	// API to check if student is valid for registration
	@PostMapping("/register/validate")
	public ResponseEntity<?> checkValidStudent(@RequestBody ValidStudent student) {
		CCATStudent isValidStudent = service.checkIfValid(Long.parseLong(student.getCcatNo()), student.getfName());
		if (isValidStudent != null) {
			return new ResponseEntity<CCATStudent>(isValidStudent, HttpStatus.OK);
		}
		return null;
	}

	// API to save personal details in dataBase
	@PostMapping("/register/details")
	public ResponseEntity<?> savePersonalDetails(@RequestBody PersonalDetails pDetails) {
		PersonalDetails savedDetails = service.savePersonalDetails(pDetails);
		return new ResponseEntity<PersonalDetails>(savedDetails, HttpStatus.OK);
	}

	// API to save address details in database
	@PostMapping("/register/address")
	public ResponseEntity<?> saveAddressDetails(@RequestBody UserAddress addressDetails) {
		UserAddress savedAddress = service.saveAddressDetails(addressDetails);
		return new ResponseEntity<UserAddress>(savedAddress, HttpStatus.OK);
	}

	@GetMapping("/register/success")
	public String homePage(){
		return "/success";
	}
}
