/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083]
 * @Date: 21-09-2022 
 */

package com.cdac.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.service.IExamService;

@RestController
public class ExamController {

	@Autowired
	IExamService service;

	private final static Logger logger = LoggerFactory.getLogger(ExamController.class);

	@PostMapping("/questions")
	public void uploadExamPaper(@RequestBody String paperPath, String subject) {

		service.uploadExamPaper(paperPath,subject);
		logger.info("************Uploaded Question Paper*************");
	}
}
