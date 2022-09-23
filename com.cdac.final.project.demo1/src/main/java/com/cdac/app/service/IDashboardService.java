package com.cdac.app.service;

import java.util.HashMap;
import java.util.List;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.UserAddress;

public interface IDashboardService {
	void saveDoubtDetails(DoubtForum doubtDetails);
	Double getPerformance(Long uPrn);
	Double getTotalAttendance(Long uPrn);
	HashMap<String,Double> getModuleAttendance(Long uPrn);
	List<DoubtForum> getActiveDoubts();
	void updateActiveFlag(Long doubtId);
	void uploadAttendance(String filePath, String subject);
	HashMap<String,String> getProfile(Long uPrn);
	void updateProfile(UserAddress address, Long uPrn);
	void setNotice(String noticeName, String noticeLink);
	void removeNotice(String noticeName);
	List<HashMap<String,String>> getNotice();
}
