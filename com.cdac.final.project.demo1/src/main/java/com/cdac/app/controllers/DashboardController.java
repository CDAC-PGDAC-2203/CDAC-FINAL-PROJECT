package com.cdac.app.controllers;

import java.util.HashMap;
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

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.Feedback;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.service.IDashboardService;
import com.cdac.app.service.IFeedbackService;
import com.cdac.app.service.IJoinLectureService;

@Controller
public class DashboardController {

	private final static Logger logger = LoggerFactory.getLogger(DashboardController.class);
	@Autowired
	private IDashboardService service;

	@Autowired
	private IFeedbackService feedbackService;

	@Autowired
	private IJoinLectureService joinLectureService;

	@GetMapping("/dashboard")
	public String loadUserDashboard(){
		return "/studentDashboard";
	}

	@GetMapping("/profile")
	public String loadProfilePage(){
		return "/myProfile";
	}

	@GetMapping("/profile/change")
	public String changePassword() {
		return "/changePassword";
	}

	// API to show user profile details
	@GetMapping("/profile/{uPrn}")
	public ResponseEntity<HashMap<String, String>> getProfile(@PathVariable(name = "uPrn") Long uPrn) {
		try {
			HashMap<String,String> map =  service.getProfile(uPrn);
			logger.info("************Received profile of" + uPrn +"*************");
			return new ResponseEntity<>(map,HttpStatus.OK);
		}catch(Exception e) {
			HashMap<String,String> badMap= null;
			return new ResponseEntity<>(badMap, HttpStatus.OK);
		}
	}

	// API to update user profile (Address)
	@PostMapping("/profile")
	public void updateProfile(@RequestBody UserAddress address, Long uPrn) {
		service.updateProfile(address, uPrn);
	}

	// API to get doubt details
	@PostMapping("/doubt")
	public void DoubtForumDetails(@RequestBody DoubtForum dobutDetails) {
		service.saveDoubtDetails(dobutDetails);
	}

	// API to show student performance
	@GetMapping("/performance/{uPrn}")
	public Double getFinalPerformance(@PathVariable(name = "uPrn") Long uPrn) {
		return service.getPerformance(uPrn);
	}

	// API to show student attendance report
	@GetMapping("/attendance/{uPrn}")
	public Double getTotalAttendance(@PathVariable(name = "uPrn") Long uPrn) {
		return service.getTotalAttendance(uPrn);
	}

	// API to show student module wise attendance report
	@GetMapping("/moduleAttendance/{uPrn}")
	public HashMap<String, Double> getModuleAttendance(@PathVariable(name = "uPrn") Long uPrn) {
		return service.getModuleAttendance(uPrn);
	}

	// API to store feedback
	@PostMapping("/feedback")
	public void submitFeedback(@RequestBody Feedback feedback) {
		feedbackService.submitFeedback(feedback);
	}

	// API to get lecture timings
	@GetMapping("/time/{date}/{course}")
	public HashMap<String, String> lectureTime(@PathVariable(name = "date") String date,
			@PathVariable(name = "course") String course) {
		return joinLectureService.getLectureTime(date, course);
	}

	// API to get lecture links
	@GetMapping("/links/{date}/{course}")
	public HashMap<String, String> lectureLink(@PathVariable(name = "date") String date,
			@PathVariable(name = "course") String course) {
		return joinLectureService.getLectureLink(date, course);
	}

	// API to get notice details on dashBoard
	@GetMapping("/notice")
	public List<HashMap<String, String>> getNotice() {
		return service.getNotice();
	}
}