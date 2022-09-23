package com.cdac.app.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.Feedback;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.service.IDashboardService;
import com.cdac.app.service.IFeedbackService;
import com.cdac.app.service.IJoinLectureService;

@RestController
public class DashboardController {

	@Autowired
	private IDashboardService service;

	@Autowired
	private IFeedbackService feedbackService;

	@Autowired
	private IJoinLectureService joinLectureService;

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
		return service.getTotalAttendance(uPrn);
	}

	@GetMapping("/moduleAttendance/{uPrn}")
	public HashMap<String,Double> getModuleAttendance(@PathVariable(name = "uPrn") Long uPrn){
		return service.getModuleAttendance(uPrn);
	}

	@GetMapping("/profile/{uPrn}")
	public HashMap<String, String> getProfile(@PathVariable(name = "uPrn") Long uPrn) {
		return service.getProfile(uPrn);
	}

	@PostMapping("/profile")
	public void updateProfile(@RequestBody UserAddress address, Long uPrn) {
		service.updateProfile(address, uPrn);
	}

	@PostMapping("/feedback")
	public void submitFeedback(@RequestBody Feedback feedback) {
		feedbackService.submitFeedback(feedback);
	}

	@GetMapping("/time/{date}/{course}")
	public HashMap<String,String> lectureTime(@PathVariable(name = "date") String date,@PathVariable(name="course")  String course){
		return joinLectureService.getLectureTime(date,course);
	}

	@GetMapping("/links/{date}/{course}")
	public HashMap<String,String> lectureLink(@PathVariable(name = "date") String date,@PathVariable(name="course")  String course){
		return joinLectureService.getLectureLink(date,course);
	}
}