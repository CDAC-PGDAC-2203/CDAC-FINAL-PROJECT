package com.cdac.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.LabJoin;
import com.cdac.app.repositories.ILabJoinRepository;
import com.cdac.app.service.IJoinLectureService;

@Component
@Transactional
public class JoinLectureServiceImpl implements IJoinLectureService {
	
	@Autowired
	private ILabJoinRepository labJoinRepository;

	@Override
	public void setActiveBatch(long uPrn) {
		LabJoin labJoin = new LabJoin();
		if(uPrn < 220340120060L) {
            labJoin.setLabB1("Y");
            labJoin.setLabB2("N");
            labJoin.setLabB3("N");
            labJoin.setLabB4("N");
		}
		if(uPrn > 220340120060L && uPrn < 220340120120L) {
            labJoin.setLabB1("N");
            labJoin.setLabB2("Y");
            labJoin.setLabB3("N");
            labJoin.setLabB4("N");
		}
		if(uPrn > 220340120120L && uPrn < 220340120180L) {
            labJoin.setLabB1("N");
            labJoin.setLabB2("N");
            labJoin.setLabB3("Y");
            labJoin.setLabB4("N");
		}
		if(uPrn > 220340120180L) {
            labJoin.setLabB1("N");
            labJoin.setLabB2("N");
            labJoin.setLabB3("N");
            labJoin.setLabB4("Y");
		}
		labJoinRepository.save(labJoin);
	}

}
