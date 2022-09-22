package com.cdac.app.service;

import java.util.List;

import com.cdac.app.domain.DoubtForum;

public interface IDashboardService {
	void saveDoubtDetails(DoubtForum doubtDetails);
	Double getPerformance(Long uPrn);
	Double getAttendance(Long uPrn);
	List<DoubtForum> getActiveDoubts();
	void updateActiveFlag(Long doubtId);
	void uploadAttendance(String filePath, String subject);
}
