package com.cdac.app.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.Feedback;
import com.cdac.app.service.IDashboardService;
import com.cdac.app.service.IExamService;
import com.cdac.app.service.IFeedbackService;
import com.cdac.app.service.IRegistrationService;
import com.cdac.app.service.IResultService;

@RestController
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
	
	private final static Logger logger = LoggerFactory.getLogger(AdminController.class);

	@PostMapping("/questions")
	public void uploadExamPaper(@RequestBody String paperPath, String subject) {
		examService.uploadExamPaper(paperPath,subject);
		logger.info("************Uploaded Question Paper*************");
	}

	@PostMapping("/generate/{courseName}")
	public void generatePRN(@PathVariable(name = "courseName") String courseName) {
		registartionService.generatePRN(courseName);
		logger.info("**************Generated PRN of course: "+courseName+"****************");
	}

	@GetMapping("/doubts")
	public List<DoubtForum> getAllActiveDoubts(){
		logger.info("************Receiving active doubts*************");
		return dashboardService.getActiveDoubts();
	}

	@PutMapping("/doubt/{doubtId}")
	public void updateActiveFlag(@PathVariable(name = "doubtId") Long doubtId) {
		dashboardService.updateActiveFlag(doubtId);
		logger.info("************Doubt:"+doubtId+" inactive*************");
	}

	@PostMapping("/attendance")
	public void uploadAttendance(String filePath, String subject) {
		dashboardService.uploadAttendance(filePath,subject);
		logger.info("************Uploaded Question Paper*************");
	}

	@PostMapping("/result")
	public void setResult(@RequestBody String filePath, String module, String course) {
		resultService.setResult(filePath, module,course);
	}

	@GetMapping("/feedback/{course}")
	public List<Feedback> getFeedbackList(@PathVariable(name = "course") String course) {
		return feedbackService.getFeedbackList(course);
	}

	@PostMapping("/faculty")
	public void importFacultyList(@RequestBody String filePath, String course) {
		feedbackService.importFacultyList(filePath, course);
	}

	@PutMapping("/faculty/{flag}/{facultyId}/{course}")
	public void updateFacultyFlag(@PathVariable(name = "flag") String flag, @PathVariable(name = "facultyId") Long facultyId, @PathVariable(name = "course") String course) {
		feedbackService.updateFacultyFlag(flag,facultyId,course);
	}
}
