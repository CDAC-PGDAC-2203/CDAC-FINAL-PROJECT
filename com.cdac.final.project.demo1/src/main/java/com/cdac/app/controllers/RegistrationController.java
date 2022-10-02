/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083] & Joy Pahari [220340120092]
 * @Date: 22-09-2022 
 */

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

	@PostMapping("/register/validate")
	public ResponseEntity<?> checkValidStudent(@RequestBody ValidStudent student) {
		CCATStudent isValidStudent = service.checkIfValid(Long.parseLong(student.getCcatNo()), student.getfName());
		if (isValidStudent != null) {
			return new ResponseEntity<CCATStudent>(isValidStudent, HttpStatus.OK);
		}
		return null;
	}

	@PostMapping("/register/details")
	public ResponseEntity<?> savePersonalDetails(@RequestBody PersonalDetails pDetails) {
		try {
			PersonalDetails savedDetails = service.savePersonalDetails(pDetails);
			return new ResponseEntity<PersonalDetails>(savedDetails, HttpStatus.OK);
		}catch(Exception e) {
			service.removeDataFromUserTable(pDetails);
			PersonalDetails savedDetails = null;
			return new ResponseEntity<PersonalDetails>(savedDetails, HttpStatus.OK);
		}
	}

	@PostMapping("/register/address")
	public ResponseEntity<?> saveAddressDetails(@RequestBody UserAddress addressDetails) {
		try {
			UserAddress savedAddress = service.saveAddressDetails(addressDetails);
			return new ResponseEntity<UserAddress>(savedAddress, HttpStatus.OK);
		}catch(Exception e) {			
			UserAddress savedAddress = null;
			return new ResponseEntity<UserAddress>(savedAddress,HttpStatus.OK);
		}
	}

	@GetMapping("/register/success")
	public String homePage(){
		return "/success";
	}
}
