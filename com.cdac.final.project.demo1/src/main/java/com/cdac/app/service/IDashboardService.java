package com.cdac.app.service;

import java.util.HashMap;
import java.util.List;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.Modules;
import com.cdac.app.domain.TotalAttendance;

public interface IDashboardService {
	void saveDoubtDetails(DoubtForum doubtDetails);

	Double getPerformance(Long uPrn) throws Exception;

	Double getTotalAttendance(Long uPrn) throws Exception;

	List<TotalAttendance> getModuleAttendance(Long uPrn) throws Exception;

	List<DoubtForum> getActiveDoubts();

	void updateActiveFlag(Long doubtId);

	void uploadAttendance(String filePath, String subject);

	HashMap<String, String> getProfile(Long uPrn) throws Exception;

	void updateProfile(String oldPassword, String newPassword, Long uPrn) throws Exception;

	void setNotice(String noticeName, String noticeLink);

	void removeNotice(String noticeName);

	List<HashMap<String, String>> getNotice() throws Exception;

	Modules getModulesList(String course) throws Exception;
}
