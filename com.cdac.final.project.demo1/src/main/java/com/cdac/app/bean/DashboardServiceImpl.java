package com.cdac.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.repositories.IDoubtForumRepository;
import com.cdac.app.service.IDashboardService;

@Component
@Transactional
public class DashboardServiceImpl implements IDashboardService {

	@Autowired
	private IDoubtForumRepository doubtForumRepository;
	
	@Override
	public void saveDoubtDetails(DoubtForum doubtDetails) {
		doubtForumRepository.save(doubtDetails);
		
	}

}
