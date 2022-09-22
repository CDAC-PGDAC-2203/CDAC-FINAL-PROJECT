package com.cdac.app.service;

import java.util.List;

import com.cdac.app.domain.Feedback;

public interface IFeedbackService {
	void submitFeedback(Feedback feedback);
	List<Feedback> getFeedbackList(String course);
	void importFacultyList(String filePath, String course);
	void updateFacultyFlag(String flag, Long facultyId,String course);
}
