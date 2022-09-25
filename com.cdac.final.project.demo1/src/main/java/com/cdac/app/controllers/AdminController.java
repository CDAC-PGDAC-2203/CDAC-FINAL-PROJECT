package com.cdac.app.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.Feedback;
import com.cdac.app.domain.LectureLink;
import com.cdac.app.dto.ImportFaculty;
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

	// API to generate PRN of students course wise
	@PostMapping("/generate/{courseName}")
	public void generatePRN(@PathVariable(name = "courseName") String courseName) {
		registartionService.generatePRN(courseName);
		logger.info("**************Generated PRN of course: " + courseName + "****************");
	}

	// API to upload question paper
	@PostMapping("/questions")
	public void uploadExamPaper(@RequestBody String paperPath, String subject) {
		examService.uploadExamPaper(paperPath, subject);
		logger.info("************Uploaded Question Paper*************");
	}

	// API to get all active doubts
	@GetMapping("/doubts")
	public List<DoubtForum> getAllActiveDoubts() {
		logger.info("************Receiving active doubts*************");
		return dashboardService.getActiveDoubts();
	}

	// API to mark solved doubts
	@PutMapping("/doubt/{doubtId}")
	public void updateActiveFlag(@PathVariable(name = "doubtId") Long doubtId) {
		dashboardService.updateActiveFlag(doubtId);
		logger.info("************Doubt:" + doubtId + " inactive*************");
	}

	// API to upload attendance of students
	@PostMapping("/attendance")
	public void uploadAttendance(@RequestBody String filePath, String subject) {
		dashboardService.uploadAttendance(filePath, subject);
		logger.info("************Uploaded Attendance Key*************");
	}

	// API to upload results of students
	@PostMapping("/result")
	public void setResult(@RequestBody String filePath, String module, String course) {
		resultService.setResult(filePath, module, course);
	}

	// API to get feedback list
	@GetMapping("/feedback/{course}")
	public List<Feedback> getFeedbackList(@PathVariable(name = "course") String course) {
		return feedbackService.getFeedbackList(course);
	}

	// API to update faculty list
	@PostMapping("/faculty")
	public void importFacultyList(@RequestBody ImportFaculty faculty) {
		feedbackService.importFacultyList(faculty.getFilePath(), faculty.getCourse());
	}

	// API to assign faculty to a course
	@PutMapping("/faculty/{flag}/{facultyId}/{course}")
	public void updateFacultyFlag(@PathVariable(name = "flag") String flag,
			@PathVariable(name = "facultyId") Long facultyId, @PathVariable(name = "course") String course) {
		feedbackService.updateFacultyFlag(flag, facultyId, course);
	}

	// API to upload lecture links
	@PostMapping("/links")
	public void uploadLinks(@RequestBody LectureLink lectureLink) {
		joinLectureService.uploadLectureLinks(lectureLink);
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
