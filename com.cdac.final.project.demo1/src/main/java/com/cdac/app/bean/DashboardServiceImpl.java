package com.cdac.app.bean;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.FinalResultTable;
import com.cdac.app.repositories.IDoubtForumRepository;
import com.cdac.app.repositories.IFinalResultRepositiry;
import com.cdac.app.service.IDashboardService;

@Component
@Transactional
public class DashboardServiceImpl implements IDashboardService {

	@Autowired
	private IDoubtForumRepository doubtForumRepository;

//	@Autowired
//	private IResultRepository resultRepository;

	@Autowired
	private IFinalResultRepositiry finalResultRepositiry;

	@Override
	public void saveDoubtDetails(DoubtForum doubtDetails) {
		doubtForumRepository.save(doubtDetails);

	}

	@Override
	public Double getPerformance(Long uPrn) {
		Double performancePercentage = 0.0;
		int total = 0, obtained = 0;
		
		FinalResultTable uResult = finalResultRepositiry.findByUPrn(uPrn);
	
		List<Integer> list = Arrays.asList(uResult.getMod1(),uResult.getMod2(),uResult.getMod3(),uResult.getMod4(),uResult.getMod5(),uResult.getMod6(),uResult.getMod7(),uResult.getMod8());
		
		for(int i : list) {
			obtained += i;
			if(i > 0) {
				total += 60;
			}
		}
		
		performancePercentage = ((obtained * 1.0)/total) * 100.0;
		return performancePercentage;
	}
}
