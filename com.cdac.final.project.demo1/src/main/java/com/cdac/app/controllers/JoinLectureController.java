package com.cdac.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.service.IJoinLectureService;

@RestController
public class JoinLectureController {
     
	@Autowired
	private IJoinLectureService service;
	
	@PostMapping("/")
	public void setStudentBatch() {
	        service.setActiveBatch(0);	
	}
	 
}
