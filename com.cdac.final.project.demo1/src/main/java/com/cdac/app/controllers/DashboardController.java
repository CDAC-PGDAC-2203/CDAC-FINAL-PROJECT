package com.cdac.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.service.IDashboardService;

@RestController
public class DashboardController {
	
	@Autowired
    private IDashboardService service;
	
	@PostMapping("/submitDoubt")
	public void DoubtForumDetails(@RequestBody DoubtForum dobutDetails) {
		service.saveDoubtDetails(dobutDetails);
	}
}
