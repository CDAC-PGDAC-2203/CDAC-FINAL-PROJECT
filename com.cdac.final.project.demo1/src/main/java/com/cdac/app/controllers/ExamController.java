/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083] & Joy Pahari [220340120092]
 * @Date: 23-09-2022 
 */

package com.cdac.app.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cdac.app.domain.QuestionPaper;
import com.cdac.app.dto.ExamAttemptDTO;
import com.cdac.app.dto.SimpleString;
import com.cdac.app.service.IExamService;

@Controller
public class ExamController {

	@Autowired
	IExamService service;

	private final static Logger logger = LoggerFactory.getLogger(ExamController.class);

	@GetMapping("/exam/mod1")
	public String loadExamMod1() {
		return "/examPageMod1";
	}

	@GetMapping("/exam/mod2")
	public String loadExamMod2() {
		return "/examPageMod2";
	}

	@GetMapping("/exam/questions/{module}")
	public ResponseEntity<?> getQuestions(@PathVariable(name = "module") String module) {
		try {
			List<QuestionPaper> list = service.getQuestionPaper(module);
			logger.info("*******Received Question Paper***********");
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			List<QuestionPaper> badList = null;
			return new ResponseEntity<>(badList, HttpStatus.OK);
		}
	}

	@PostMapping("/exam/attempt")
	public ResponseEntity<?> examAttempt(@RequestBody ExamAttemptDTO exam) {
		SimpleString simple = new SimpleString("DONE");
		try {
			service.examAttempt(exam.getMap(), exam.getModule(), Long.parseLong(exam.getuPrn()));
			logger.info("************Exam Submitted of " + exam.getuPrn() + " " + "of " + exam.getModule()
					+ "*************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}
}
