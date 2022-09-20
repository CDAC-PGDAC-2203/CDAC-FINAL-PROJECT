package com.cdac.app.bean;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.Module1;
import com.cdac.app.domain.Module2;
import com.cdac.app.domain.Module3;
import com.cdac.app.domain.Module4;
import com.cdac.app.domain.Module5;
import com.cdac.app.domain.Module6;
import com.cdac.app.domain.Module7;
import com.cdac.app.domain.Module8;
import com.cdac.app.repositories.IModule1Repository;
import com.cdac.app.repositories.IModule2Repository;
import com.cdac.app.repositories.IModule3Repository;
import com.cdac.app.repositories.IModule4Repository;
import com.cdac.app.repositories.IModule5Repository;
import com.cdac.app.repositories.IModule6Repository;
import com.cdac.app.repositories.IModule7Repository;
import com.cdac.app.repositories.IModule8Repository;
import com.cdac.app.service.IResultService;

@Component
@Transactional
public class ResultServiceImpl implements IResultService {

	@Autowired
	private IModule1Repository module1Repository;
	
	@Autowired
	private IModule2Repository module2Repository;
	
	@Autowired
	private IModule3Repository module3Repository;
	
	@Autowired
	private IModule4Repository module4Repository;
	
	@Autowired
	private IModule5Repository module5Repository;
	
	@Autowired
	private IModule6Repository module6Repository;
	
	@Autowired
	private IModule7Repository module7Repository;
	
	@Autowired
	private IModule8Repository module8Repository;

	// Method to return result to frontend
	@Override
	public HashMap<String, String> getResult(Long uPrn, String moduleName) {
		HashMap<String, String> map = new HashMap<>();
		Module1 m1 = null;
		Module2 m2 = null;
		Module3 m3 = null;
		Module4 m4 = null;
		Module5 m5 = null;
		Module6 m6 = null;
		Module7 m7 = null;
		Module8 m8 = null;
		
		if("mod1".equals(moduleName)) {
			m1 = module1Repository.getResult(uPrn);
			map.put("lab", m1.getLab().toString());
			map.put("assessment", m1.getAssessment().toString());
			map.put("attendance", m1.getAttendance().toString());
		}
		if("mod2".equals(moduleName)) {
			m2 = module2Repository.getResult(uPrn);
			map.put("lab", m2.getLab().toString());
			map.put("assessment", m2.getAssessment().toString());
			map.put("attendance", m2.getAttendance().toString());
		}
		if("mod3".equals(moduleName)) {
			m3 = module3Repository.getResult(uPrn);
			map.put("lab", m3.getLab().toString());
			map.put("assessment", m3.getAssessment().toString());
			map.put("attendance", m3.getAttendance().toString());
		}
		if("mod4".equals(moduleName)) {
			m4 = module4Repository.getResult(uPrn);
			map.put("lab", m4.getLab().toString());
			map.put("assessment", m4.getAssessment().toString());
			map.put("attendance", m4.getAttendance().toString());
		}
		if("mod5".equals(moduleName)) {
			m5 = module5Repository.getResult(uPrn);
			map.put("lab", m5.getLab().toString());
			map.put("assessment", m5.getAssessment().toString());
			map.put("attendance", m5.getAttendance().toString());
		}
		if("mod6".equals(moduleName)) {
			m6 = module6Repository.getResult(uPrn);
			map.put("lab", m6.getLab().toString());
			map.put("assessment", m6.getAssessment().toString());
			map.put("attendance", m6.getAttendance().toString());
		}
		if("mod7".equals(moduleName)) {
			m7 = module7Repository.getResult(uPrn);
			map.put("lab", m7.getLab().toString());
			map.put("assessment", m7.getAssessment().toString());
			map.put("attendance", m7.getAttendance().toString());
		}
		if("mod8".equals(moduleName)) {
			m8 = module8Repository.getResult(uPrn);
			map.put("lab", m8.getLab().toString());
			map.put("assessment", m8.getAssessment().toString());
			map.put("attendance", m8.getAttendance().toString());
		}

		return map;
	}
}
