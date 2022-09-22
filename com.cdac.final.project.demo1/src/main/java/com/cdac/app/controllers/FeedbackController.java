package com.cdac.app.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.domain.Feedback;

@RestController
public class FeedbackController {
	
	@PostMapping("/feedback")
	public void submitFeedback(@RequestBody Feedback feedback) {
		
	}
}
