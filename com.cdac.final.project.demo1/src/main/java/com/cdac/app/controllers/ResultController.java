package com.cdac.app.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.service.IResultService;

@RestController
public class ResultController {

	@Autowired
	private IResultService resultService;

	// API to get fetch result
	@GetMapping("/result/{uPrn}/{moduleName}")
	public HashMap<String, String> getResult(@PathVariable(name = "uPrn") Long uPrn,
			@PathVariable(name = "moduleName") String moduleName) {
		return resultService.getResult(uPrn, moduleName.toLowerCase());
	}
}
