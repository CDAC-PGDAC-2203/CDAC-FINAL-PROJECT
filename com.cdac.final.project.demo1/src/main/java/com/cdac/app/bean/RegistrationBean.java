package com.cdac.app.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.CCATStudent;
import com.cdac.app.domain.Guardian;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.Role;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.domain.UserLogin;
import com.cdac.app.domain.UserTable;
import com.cdac.app.repositories.IAddressDetailsRepository;
import com.cdac.app.repositories.ICCATUserRepository;
import com.cdac.app.repositories.IGuardianRepository;
import com.cdac.app.repositories.IPersonalDetailsRepository;
import com.cdac.app.repositories.IUserLoginRepository;
import com.cdac.app.repositories.IUserTableRepository;
import com.cdac.app.service.IRegistrationService;


@Component
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

	@Autowired
	private IUserLoginRepository userLoginRepository;

	// Method to validate user before registration
	// If valid   : move to personal_details page
	// If invalid : return to registration page
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

	// Method to save user in user_table
	// User can be :
		// 1. Admin
		// 2. Student
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

	// Method to return user details to frontend
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

	// Method to save user personal details in personal_details table
	@Override
	public void savePersonalDetails(PersonalDetails pDetails) {

		personalDetailsRepository.save(pDetails);

	}

	// Method to save user address in user_address table
	@Override
	public void saveAddressDetails(UserAddress addressDetails) {

		addressDetailsRepository.save(addressDetails);	

	}

	// Method to store user guardian details in guardian table
	@Override
	public void saveGuardianDetails(Guardian guardianDetails) {
		guardianRepository.save(guardianDetails);
	}

	@Override
	public void generatePRN() {
		List<PersonalDetails> list = personalDetailsRepository.findAll();
		List<UserLogin> prnList = populatePRNList(list);
		userLoginRepository.saveAll(prnList);
	}

	public List<UserLogin> populatePRNList(List<PersonalDetails> list){
		List<UserLogin> prnList = new ArrayList<>();
		Long prnNo = 220340120001L;
		for(PersonalDetails pDetail : list) {
			UserLogin userLogin = new UserLogin();

			userLogin.setUserId(pDetail.getUserId());
			userLogin.setuName(pDetail.getfName()+pDetail.getmName()+pDetail.getlName());
			userLogin.setuPrn(prnNo);
			userLogin.setuPassword(prnNo.toString());

			prnList.add(userLogin);
		}
		return prnList;
	}
}