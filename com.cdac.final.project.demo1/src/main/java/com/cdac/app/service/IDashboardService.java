package com.cdac.app.service;

import com.cdac.app.domain.DoubtForum;

public interface IDashboardService {
	public void saveDoubtDetails(DoubtForum doubtDetails);
	public Double getPerformance(Long uPrn);
	public Double getAttendance(Long uPrn);
}
