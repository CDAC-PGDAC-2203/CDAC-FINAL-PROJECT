package com.cdac.app.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.service.IResultService;

@RestController
public class ExamController {

	@Autowired
	private IResultService resultService;

	// API to get result using module name
	@GetMapping("/result/{moduleName}")
	public HashMap<String, Object> getResult(@PathVariable(name = "moduleName") String moduleName) {
		return resultService.getResult(moduleName);
	}
}
