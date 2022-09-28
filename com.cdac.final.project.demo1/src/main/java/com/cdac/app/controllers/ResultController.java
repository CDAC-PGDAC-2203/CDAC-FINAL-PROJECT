package com.cdac.app.controllers;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cdac.app.service.IResultService;

@Controller
public class ResultController {

	@Autowired
	private IResultService resultService;

	private final static Logger logger = LoggerFactory.getLogger(ResultController.class);

	@GetMapping("/result/mod1")
	public String loadExamMod1() {
		return "/studentResultMod1";
	}

	@GetMapping("/result/mod2")
	public String loadExamMod2() {
		return "/studentResultMod2";
	}

	// API to get fetch result
	@GetMapping("/result/{uPrn}/{moduleName}")
	public ResponseEntity<?> getResult(@PathVariable(name = "uPrn") Long uPrn,
			@PathVariable(name = "moduleName") String moduleName) {
		try {
			HashMap<String, String> map = resultService.getResult(uPrn, moduleName.toLowerCase());
			logger.info("*******Received Question Paper***********");
			return new ResponseEntity<>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			HashMap<String, String> badMap = null;
			return new ResponseEntity<>(badMap, HttpStatus.OK);
		}
	}
}