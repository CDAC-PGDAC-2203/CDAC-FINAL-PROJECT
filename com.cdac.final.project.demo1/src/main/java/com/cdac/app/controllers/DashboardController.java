package com.cdac.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.service.IDashboardService;

@RestController
public class DashboardController {

	@Autowired
	private IDashboardService service;

	@PostMapping("/doubt")
	public void DoubtForumDetails(@RequestBody DoubtForum dobutDetails) {
		service.saveDoubtDetails(dobutDetails);
	}

	@GetMapping("/performance/{uPrn}")
	public Double getFinalPerformance(@PathVariable(name = "uPrn") Long uPrn) {
		return service.getPerformance(uPrn);
	}

	@GetMapping("/attendance/{uPrn}")
	public Double getTotalAttendance(@PathVariable(name = "uPrn") Long uPrn) {
		return service.getAttendance(uPrn);
	}
}
