package com.cdac.app.bean;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.cdac.app.domain.CCATStudent;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.Role;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.domain.UserLogin;
import com.cdac.app.domain.UserTable;
import com.cdac.app.repositories.IAddressDetailsRepository;
import com.cdac.app.repositories.ICCATUserRepository;
import com.cdac.app.repositories.IPersonalDetailsRepository;
import com.cdac.app.repositories.IUserLoginRepository;
import com.cdac.app.repositories.IUserTableRepository;
import com.cdac.app.service.IRegistrationService;

@Component
@Transactional
public class RegistrationServiceImpl implements IRegistrationService {

	private static Long prnDAC = 220340120001L;
	private static Long prnDBDA = 220340130001L;
	private static Long prnDESD = 220340140001L;

	private final static Logger logger = LoggerFactory.getLogger(RegistrationServiceImpl.class);

	@Autowired
	private ICCATUserRepository ccatUserRepository;

	@Autowired
	private IUserTableRepository userTableRepository;

	@Autowired
	private IPersonalDetailsRepository personalDetailsRepository;

	@Autowired
	private IAddressDetailsRepository addressDetailsRepository;

	@Autowired
	private IUserLoginRepository userLoginRepository;

	@Value("${application.bucket.name}")
	private String bucketName;

	@Autowired
	private AmazonS3 s3Client;

	// Method to validate user before registration
	// If valid : move to personal_details page
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
	public HashMap<String, Object> getUserDetails(Long ccatNo) {
		CCATStudent ccatStudent = ccatUserRepository.findByCcatNo(ccatNo);
		UserTable uTable = userTableRepository.findByCcatNo(ccatNo);
		HashMap<String, Object> map = new HashMap<>();

		map.put("userId", uTable.getUserId());
		map.put("fName", ccatStudent.getfName());
		map.put("mName", ccatStudent.getmName());
		map.put("lName", ccatStudent.getlName());
		map.put("dob", ccatStudent.getDob());

		logger.info("********* DETAILS OF CCAT NO: " + ccatNo + " = " + map + "***********************");

		return map;
	}

	// Method to save user personal details in personal_details table
	@Override
	public void savePersonalDetails(PersonalDetails pDetails) {
		pDetails.setPhoto(uploadImageAddress(pDetails.getPhoto(),
				pDetails.getfName() + pDetails.getUserId().toString() + LocalDate.now().toString()));
		personalDetailsRepository.save(pDetails);
	}

	// Method to save user address in user_address table
	@Override
	public void saveAddressDetails(UserAddress addressDetails) {

		addressDetailsRepository.save(addressDetails);

	}

	@Override
	public void generatePRN(String courseName) {
		List<PersonalDetails> list = personalDetailsRepository.findAll(courseName);
		List<UserLogin> prnList = populatePRNList(list);
		userLoginRepository.saveAll(prnList);
	}

	public List<UserLogin> populatePRNList(List<PersonalDetails> list) {
		List<UserLogin> prnList = new ArrayList<>();
		Long prnNo = 0L;

		if ((list.size() > 0)) {
			String courseName = list.get(0).getCourse();
			if (("PG-DAC").equals(courseName)) {
				prnNo = prnDAC;
			} else if (("PG-DBDA").equals(courseName)) {
				prnNo = prnDBDA;
			} else {
				prnNo = prnDESD;
			}
		}
		for (PersonalDetails pDetail : list) {
			UserLogin userLogin = new UserLogin();

			userLogin.setUserId(pDetail.getUserId());

			String name = pDetail.getfName();
			if (pDetail.getmName() != null) {
				name += pDetail.getmName();
			}
			if (pDetail.getlName() != null) {
				name += pDetail.getlName();
			}

			userLogin.setuName(name);
			userLogin.setuPrn(prnNo);
			userLogin.setuPassword(prnNo.toString());
			userLogin.setCourse(pDetail.getCourse());

			prnList.add(userLogin);
		}
		return prnList;
	}

	public String uploadImageAddress(String imagePath, String fileName) {
		File convertedFile = new File(imagePath);
		s3Client.putObject(new PutObjectRequest(bucketName, fileName, convertedFile));
		convertedFile.delete();
		return fileName;
	}
}