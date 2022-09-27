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
import com.cdac.app.domain.TotalAttendance;
import com.cdac.app.dto.ChangePasswordDTO;
import com.cdac.app.dto.LectureDTO;
import com.cdac.app.dto.SimpleString;
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
	public String loadUserDashboard() {
		return "/studentDashboard";
	}

	@GetMapping("/profile")
	public String loadProfilePage() {
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
			HashMap<String, String> map = service.getProfile(uPrn);
			logger.info("************Received profile of" + uPrn + "*************");
			return new ResponseEntity<>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			HashMap<String, String> badMap = null;
			return new ResponseEntity<>(badMap, HttpStatus.OK);
		}
	}

	// API to update user password
	@PostMapping("/profile")
	public ResponseEntity<?> updateProfile(@RequestBody ChangePasswordDTO password) {
		SimpleString simple = new SimpleString("DONE");
		try {
			service.updateProfile(password.getOldPassword(), password.getNewPassword(), password.getuPrn());
			logger.info("************Uploaded Attendance Key*************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}

	// API to get doubt details
	@PostMapping("/doubt")
	public void DoubtForumDetails(@RequestBody DoubtForum dobutDetails) {
		service.saveDoubtDetails(dobutDetails);
	}

	// API to show student performance
	@GetMapping("/performance/{uPrn}")
	public ResponseEntity<?> getFinalPerformance(@PathVariable(name = "uPrn") Long uPrn) {
		try {
			Double finalPerformance = service.getPerformance(uPrn);
			return new ResponseEntity<Double>(finalPerformance,HttpStatus.OK);
		}catch(Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			Double bad = 0.0;
			return new ResponseEntity<Double>(bad,HttpStatus.ACCEPTED);
		}
	}

	// API to show student final attendance
	@GetMapping("/attendance/{uPrn}")
	public ResponseEntity<?> getTotalAttendance(@PathVariable(name = "uPrn") Long uPrn) {
		try {
			Double finalAttendance = service.getTotalAttendance(uPrn);
			return new ResponseEntity<Double>(finalAttendance,HttpStatus.OK);
		}catch(Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			Double bad = 0.0;
			return new ResponseEntity<Double>(bad,HttpStatus.ACCEPTED);
		}
	}

	// API to show stuRdent module wise attendance report
	@GetMapping("/moduleAttendance/{uPrn}")
	public  ResponseEntity<List<TotalAttendance>> getModuleAttendance(@PathVariable(name = "uPrn") Long uPrn) {
		try {
			List<TotalAttendance> list = service.getModuleAttendance(uPrn);;
			logger.info("************Received profile of" + uPrn + "*************");
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			List<TotalAttendance> badList = null;
			return new ResponseEntity<>(badList, HttpStatus.OK);
		}
	}

	// API to store feedback
	@PostMapping("/feedback")
	public void submitFeedback(@RequestBody Feedback feedback) {
		feedbackService.submitFeedback(feedback);
	}

	// API to get lecture timings
	@GetMapping("/time/{date}/{course}")
	public ResponseEntity<HashMap<String, String>> lectureTime(@PathVariable(name = "date") String date,
			@PathVariable(name = "course") String course) {
		try {
			HashMap<String, String> map = joinLectureService.getLectureTime(date, course);
			logger.info("************Received Links of" + date + "*************");
			return new ResponseEntity<>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			HashMap<String, String> badMap = null;
			return new ResponseEntity<>(badMap, HttpStatus.OK);
		}
	}

	// API to get lecture links
	@PostMapping("/dashboard/links")
	public ResponseEntity<HashMap<String, String>> lectureLink(@RequestBody LectureDTO lecture) {
		try {
			HashMap<String, String> map = joinLectureService.getLectureLink(lecture.getYear()+"-"+lecture.getMonth()+"-"+lecture.getDay(), lecture.getCourse());
			logger.info("************Received Links of" + lecture.getYear()+"-"+lecture.getMonth()+"-"+lecture.getDay() + "*************");
			return new ResponseEntity<>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			HashMap<String, String> badMap = null;
			return new ResponseEntity<>(badMap, HttpStatus.OK);
		}
	}

	// API to get notice details on dashBoard
	@GetMapping("/notice")
	public List<HashMap<String, String>> getNotice() {
		return service.getNotice();
	}
}