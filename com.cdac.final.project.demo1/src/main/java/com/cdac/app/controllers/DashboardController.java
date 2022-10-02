/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083] & Joy Pahari [220340120092]
 * @Date: 21-09-2022 
 */

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

import com.cdac.app.domain.Faculty;
import com.cdac.app.domain.Feedback;
import com.cdac.app.domain.Modules;
import com.cdac.app.domain.TotalAttendance;
import com.cdac.app.dto.ChangePasswordDTO;
import com.cdac.app.dto.DoubtDTO;
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

	@GetMapping("/exam")
	public String loadExamPage() {
		return "/moduleExam";
	}

	@GetMapping("/result")
	public String loadResultPage() {
		return "/moduleResult";
	}

	@GetMapping("/feedback")
	public String loadFeedbackPage() {
		return "/feedback";
	}

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

	@PostMapping("/doubt")
	public ResponseEntity<?> DoubtForumDetails(@RequestBody DoubtDTO dobutDetails) {
		SimpleString simple = new SimpleString("DONE");
		try {
			service.saveDoubtDetails(dobutDetails);
			logger.info("************Uploaded Attendance Key*************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}

	@GetMapping("/performance/{uPrn}")
	public ResponseEntity<?> getFinalPerformance(@PathVariable(name = "uPrn") Long uPrn) {
		try {
			Double finalPerformance = service.getPerformance(uPrn);
			return new ResponseEntity<Double>(finalPerformance, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			Double bad = 0.0;
			return new ResponseEntity<Double>(bad, HttpStatus.ACCEPTED);
		}
	}

	@GetMapping("/attendance/{uPrn}")
	public ResponseEntity<?> getTotalAttendance(@PathVariable(name = "uPrn") Long uPrn) {
		try {
			Double finalAttendance = service.getTotalAttendance(uPrn);
			return new ResponseEntity<Double>(finalAttendance, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			Double bad = 0.0;
			return new ResponseEntity<Double>(bad, HttpStatus.ACCEPTED);
		}
	}

	@GetMapping("/moduleAttendance/{uPrn}")
	public ResponseEntity<List<TotalAttendance>> getModuleAttendance(@PathVariable(name = "uPrn") Long uPrn) {
		try {
			List<TotalAttendance> list = service.getModuleAttendance(uPrn);
			;
			logger.info("************Received profile of" + uPrn + "*************");
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			List<TotalAttendance> badList = null;
			return new ResponseEntity<>(badList, HttpStatus.OK);
		}
	}

	@PostMapping("/feedback")
	public ResponseEntity<?> submitFeedback(@RequestBody Feedback feedback) {
		SimpleString simple = new SimpleString("DONE");
		try {
			feedbackService.submitFeedback(feedback);
			logger.info("************Uploaded Feedback*************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}

	@PostMapping("/dashboard/time")
	public ResponseEntity<HashMap<String, String>> lectureTime(@RequestBody LectureDTO lecture) {
		try {
			HashMap<String, String> map = joinLectureService.getLectureTime(
					lecture.getYear() + "-" + lecture.getMonth() + "-" + lecture.getDay(), lecture.getCourse());
			logger.info("************Received Links of" + lecture.getYear() + "-" + lecture.getMonth() + "-"
					+ lecture.getDay() + "*************");
			return new ResponseEntity<>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			HashMap<String, String> badMap = null;
			return new ResponseEntity<>(badMap, HttpStatus.OK);
		}
	}

	@PostMapping("/dashboard/links")
	public ResponseEntity<HashMap<String, String>> lectureLink(@RequestBody LectureDTO lecture) {
		try {
			HashMap<String, String> map = joinLectureService.getLectureLink(
					lecture.getYear() + "-" + lecture.getMonth() + "-" + lecture.getDay(), lecture.getCourse());
			logger.info("************Received Links of" + lecture.getYear() + "-" + lecture.getMonth() + "-"
					+ lecture.getDay() + "*************");
			return new ResponseEntity<>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
			HashMap<String, String> badMap = null;
			return new ResponseEntity<>(badMap, HttpStatus.OK);
		}
	}

	@GetMapping("/notice")
	public ResponseEntity<?> getNotice() {
		try {
			List<HashMap<String, String>> map = service.getNotice();
			logger.info("************Received Notices*************");
			return new ResponseEntity<>(map, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			HashMap<String, String> badMap = null;
			return new ResponseEntity<>(badMap, HttpStatus.OK);
		}
	}

	@GetMapping("/modules/{course}")
	public ResponseEntity<?> getModulesList(@PathVariable(name = "course") String course) {
		try {
			Modules moduleList = service.getModulesList(course);
			logger.info("************Received Notices*************");
			return new ResponseEntity<Modules>(moduleList, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			Modules badModuleList = null;
			return new ResponseEntity<Modules>(badModuleList, HttpStatus.OK);
		}
	}

	@GetMapping("/faculty/{course}")
	public ResponseEntity<?> getFacultyList(@PathVariable(name = "course") String course) {
		try {
			List<Faculty> list = service.getFacultyList(course);
			logger.info("************Received Faculty List*************");
			return new ResponseEntity<List<Faculty>>(list, HttpStatus.OK);
		} catch (Exception e) {
			logger.info(e.getMessage());
			List<Faculty> badList = null;
			return new ResponseEntity<List<Faculty>>(badList, HttpStatus.OK);
		}
	}
}