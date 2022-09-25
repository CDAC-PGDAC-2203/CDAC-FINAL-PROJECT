package com.cdac.app.controllers;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.Feedback;
import com.cdac.app.domain.LectureLink;
import com.cdac.app.dto.ImportCSVDataDTO;
import com.cdac.app.dto.ResultDTO;
import com.cdac.app.dto.SimpleString;
import com.cdac.app.service.IDashboardService;
import com.cdac.app.service.IExamService;
import com.cdac.app.service.IFeedbackService;
import com.cdac.app.service.IJoinLectureService;
import com.cdac.app.service.IRegistrationService;
import com.cdac.app.service.IResultService;

@Controller
public class AdminController {

	@Autowired
	private IExamService examService;

	@Autowired
	private IRegistrationService registartionService;

	@Autowired
	private IDashboardService dashboardService;

	@Autowired
	private IResultService resultService;

	@Autowired
	private IFeedbackService feedbackService;

	@Autowired
	private IJoinLectureService joinLectureService;

	private final static Logger logger = LoggerFactory.getLogger(AdminController.class);

	@GetMapping("/admin")
	public String loadAdminDashboard() {
		return "/adminDashboard";
	}

	@GetMapping("/admin/gprn")
	public String loadGeneratePRN() {
		return "/adminGeneratePrn";
	}

	@GetMapping("/admin/doubts")
	public String loadActiveDoubts() {
		return "/activeDoubtList";
	}

	@GetMapping("/admin/doubts/flag")
	public String loadUpdateDoubt() {
		return "";
	}

	@GetMapping("/admin/attendance")
	public String loadUploadAttendance() {
		return "/adminAttendance";
	}

	@GetMapping("/admin/result")
	public String loadUploadResult() {
		return "/adminResult";
	}

	@GetMapping("/admin/feedback")
	public String loadGetFeedbacks() {
		return "/feedbackList";
	}

	@GetMapping("/admin/faculty")
	public String loadUploadFacultyList() {
		return "/adminFacultyList";
	}
	
	@GetMapping("/admin/faculty/flag")
	public String loadUpdateFaculty() {
		return "/adminFacultyFeedback";
	}

	@GetMapping("/admin/questions")
	public String loadUploadQuestion() {
		return "/adminQuestionPaper";
	}

	@GetMapping("/admin/links")
	public String loadUploadLinks() {
		return "/adminLectureLink";
	}

	@GetMapping("/admin/notice")
	public String loadUploadNotice() {
		return "";
	}

	
	// API to generate PRN of students course wise
	@PostMapping("/generate/{courseName}")
	public ResponseEntity<?> generatePRN(@PathVariable(name = "courseName") String courseName) {
		SimpleString simple = new SimpleString("DONE");
		try {
			registartionService.generatePRN(courseName);
			logger.info("**************Generated PRN of course: " + courseName + "****************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}catch(Exception e) {
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}

	// API to upload question paper
	@PostMapping("/questions")
	public ResponseEntity<?> uploadExamPaper(@RequestBody ImportCSVDataDTO questionPaper) {
		SimpleString simple = new SimpleString("DONE");
		try {
			examService.uploadExamPaper(questionPaper.getFilePath(), questionPaper.getSubject());
			logger.info("************Uploaded Question Paper*************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}catch(Exception e) {
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}

	// API to get all active doubts
	@GetMapping("/doubts")
	public ResponseEntity<List<DoubtForum>> getAllActiveDoubts() {
		try {
			List<DoubtForum> list = dashboardService.getActiveDoubts();
			logger.info("************Received active doubts*************");
			return new ResponseEntity<>(list,HttpStatus.OK);
		}catch(Exception e) {
			List<DoubtForum> badList = null;
			return new ResponseEntity<>(badList, HttpStatus.OK);
		}
	}

	//TODO UI Screen Pending @Kamana @Mayank
	// API to mark solved doubts
	@PutMapping("/doubt/{doubtId}")
	public void updateActiveFlag(@PathVariable(name = "doubtId") Long doubtId) {
		dashboardService.updateActiveFlag(doubtId);
		logger.info("************Doubt:" + doubtId + " inactive*************");
	}

	// API to upload attendance of students
	@PostMapping("/attendance")
	public ResponseEntity<?> uploadAttendance(@RequestBody ImportCSVDataDTO attendance) {
		SimpleString simple = new SimpleString("DONE");
		try{
			dashboardService.uploadAttendance(attendance.getFilePath(), attendance.getSubject());
			logger.info("************Uploaded Attendance Key*************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}catch(Exception e) {
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}

	// API to upload results of students
	@PostMapping("/result")
	public ResponseEntity<?> setResult(@RequestBody ResultDTO result) {
		SimpleString simple = new SimpleString("DONE");
		try{
			resultService.setResult(result.getFilePath(), result.getSubject(), result.getCourse());
			logger.info("****************RESULT UPDATED OF "+result.getSubject()+"*************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}catch(Exception e) {
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}

	// API to get feedback list
	@GetMapping("/feedback/{course}")
	public ResponseEntity<List<Feedback>> getFeedbackList(@PathVariable(name = "course") String course) {
		try {
			List<Feedback> list = feedbackService.getFeedbackList(course);
			logger.info("************Received feedbacks*************");
			return new ResponseEntity<>(list,HttpStatus.OK);
		}catch(Exception e) {
			List<Feedback> badList = null;
			return new ResponseEntity<>(badList, HttpStatus.OK);
		}
	}

	// API to update faculty list
	@PostMapping("/faculty")
	public ResponseEntity<?> importFacultyList(@RequestBody ImportCSVDataDTO faculty) {
		SimpleString simple = new SimpleString("DONE");
		try{
			feedbackService.importFacultyList(faculty.getFilePath(), faculty.getSubject());
			logger.info("************Uploaded Faculty List*************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}catch(Exception e) {
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}

	// API to make faculty visible for feedback
	@PutMapping("/faculty/{flag}/{facultyId}/{course}")
	public ResponseEntity<?> updateFacultyFlag(@PathVariable(name = "flag") String flag,
			@PathVariable(name = "facultyId") Long facultyId, @PathVariable(name = "course") String course) {
		SimpleString simple = new SimpleString("DONE");
		try{
			feedbackService.updateFacultyFlag(flag, facultyId, course);
			logger.info("************Uploaded Faculty List*************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}catch(Exception e) {
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}	
	
	@PostMapping("/links")
	public ResponseEntity<?> uploadLinks(@RequestBody LectureLink lectureLink) {
		SimpleString simple = new SimpleString("DONE");
		try{
			joinLectureService.uploadLectureLinks(lectureLink);
			logger.info("************Uploaded Links*************");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}catch(Exception e) {
			simple = new SimpleString("FAILED");
			return new ResponseEntity<SimpleString>(simple, HttpStatus.OK);
		}
	}

	// API to upload notice
	@PostMapping("/notice/{name}/{link}")
	public void setNotice(@PathVariable(name = "name") String noticeName,
			@PathVariable(name = "link") String noticeLink) {
		dashboardService.setNotice(noticeName, noticeLink);
	}

	// API to remove an old notice
	@PostMapping("/notice/{name}")
	public void removeNotice(@PathVariable(name = "name") String noticeName) {
		dashboardService.removeNotice(noticeName);
	}
}
