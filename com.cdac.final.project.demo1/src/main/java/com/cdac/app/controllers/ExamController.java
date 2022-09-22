/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083]
 * @Date: 21-09-2022 
 */

package com.cdac.app.controllers;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.domain.QuestionPaper;
import com.cdac.app.service.IExamService;

@RestController
public class ExamController {

	@Autowired
	IExamService service;

	private final static Logger logger = LoggerFactory.getLogger(ExamController.class);

	@GetMapping("/questions/{module}")
	public List<QuestionPaper> getQuestions(@PathVariable(name="module") String module){
		logger.info("*******Receiving Question Paper***********");
		return service.getQuestionPaper(module);
	}

	@PostMapping("/exam")
	public void examAttempt(@RequestBody HashMap<String,String> map, String module, Long uPrn) {
		service.examAttempt(map, module, uPrn);
	}
}
