package com.cdac.app.bean;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.CCATStudent;
import com.cdac.app.domain.Guardian;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.Role;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.domain.UserTable;
import com.cdac.app.repositories.IAddressDetailsRepository;
import com.cdac.app.repositories.ICCATUserRepository;
import com.cdac.app.repositories.IGuardianRepository;
import com.cdac.app.repositories.IPersonalDetailsRepository;
import com.cdac.app.repositories.IUserTableRepository;
import com.cdac.app.service.IRegistrationService;

@Transactional
public class RegistrationBean implements IRegistrationService {

	@Autowired
	private ICCATUserRepository ccatUserRepository;

	@Autowired
	private IUserTableRepository userTableRepository;
	
	@Autowired
	private IPersonalDetailsRepository personalDetailsRepository;
	
	@Autowired
	private IAddressDetailsRepository addressDetailsRepository;
	
	@Autowired
	private IGuardianRepository guardianRepository;

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

	@Override
	public void savePersonalDetails(PersonalDetails pDetails) {

		personalDetailsRepository.save(pDetails);

	}

	@Override
	public void saveAddressDetails(UserAddress addressDetails) {

		addressDetailsRepository.save(addressDetails);	

	}

	@Override
	public void saveGuardianDetails(Guardian guardianDetails) {

		guardianRepository.save(guardianDetails);
	}
}