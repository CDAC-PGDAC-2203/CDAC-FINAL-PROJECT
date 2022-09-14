package com.cdac.app.bean;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.CCATStudent;
import com.cdac.app.domain.Role;
import com.cdac.app.domain.UserTable;
import com.cdac.app.repositories.ICCATUserRepository;
import com.cdac.app.repositories.IUserTableRepository;
import com.cdac.app.service.IRegistrationService;

@Transactional
public class RegistrationBean implements IRegistrationService {

	@Autowired
	private ICCATUserRepository ccatUserRepository;

	@Autowired
	private IUserTableRepository userTableRepository;

	@Override
	public String checkIfValid(Long ccatNo, String fName) {
		CCATStudent validStudent = ccatUserRepository.findByCcatNoAndFName(ccatNo, fName);
		if (validStudent == null) {
			return "/register";
		} else {
			saveUser(ccatNo, fName);
			return "/register/personal_details";
		}
	}

	@Override
	public void saveUser(Long ccatNo, String fName) {
		UserTable uTable = new UserTable();
		uTable.setCcatNo(ccatNo);
		uTable.setfName(fName);
		if (ccatNo == 1111111) {
			uTable.setUserRole(Role.valueOf("ADMIN"));
		} else {
			uTable.setUserRole(Role.valueOf("STUDENT"));
		}
		userTableRepository.save(uTable);
	}

	@Override
	public HashMap<String, String> getUserDetails(Long ccatNo) {
		CCATStudent ccatStudent = ccatUserRepository.findByCcatNo(ccatNo);
		UserTable uTable = userTableRepository.findByCcatNo(ccatNo);
		HashMap<String, String> map = new HashMap<>();

		map.put("userId", uTable.getUserId().toString());
		map.put("fName", ccatStudent.getfName());
		map.put("mName", ccatStudent.getmName());
		map.put("lName", ccatStudent.getlName());
		map.put("dob", ccatStudent.getDob().toString());

		return map;
	}
}