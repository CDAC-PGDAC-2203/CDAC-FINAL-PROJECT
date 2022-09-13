package com.cdac.app.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.domain.CCATStudent;

@RestController
public class RegistrationController {

	@PostMapping
	public CCATStudent checkValidStudent() {
		CCATStudent validStudent = null;
		
		return validStudent;
	}
}
