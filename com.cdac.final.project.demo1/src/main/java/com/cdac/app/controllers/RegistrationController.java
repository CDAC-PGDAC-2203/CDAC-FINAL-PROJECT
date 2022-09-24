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
	public String openRegistrationForm(){
		return "/registration";
	}

	// API to check if student is valid for registration
	@PostMapping("/register/validate")
	public ResponseEntity<?> checkValidStudent(@RequestBody ValidStudent student) {
		CCATStudent isValidStudent = service.checkIfValid(Long.parseLong(student.getCcatNo()),student.getfName());
		if(isValidStudent!=null) {
			return new ResponseEntity<CCATStudent>(isValidStudent, HttpStatus.OK);
		}
		return null;
	}

	// API to fetch data in personal detail page (Ajax call)
	// TODO DELETE IT
	/*
	 * @GetMapping("/register/details/{ccatNo}") public HashMap<String, Object>
	 * getUserDetails(@PathVariable(name = "ccatNo") Long ccatNo) { return
	 * service.getUserDetails(ccatNo); }
	 */

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
