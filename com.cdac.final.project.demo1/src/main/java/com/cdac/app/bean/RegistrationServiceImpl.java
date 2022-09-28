package com.cdac.app.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.CCATStudent;
import com.cdac.app.domain.EmailDetails;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.Role;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.domain.UserLogin;
import com.cdac.app.domain.UserTable;
import com.cdac.app.exception.CDACAppException;
import com.cdac.app.repositories.IAddressDetailsRepository;
import com.cdac.app.repositories.ICCATUserRepository;
import com.cdac.app.repositories.IPersonalDetailsRepository;
import com.cdac.app.repositories.IUserLoginRepository;
import com.cdac.app.repositories.IUserTableRepository;
import com.cdac.app.service.IEmailService;
import com.cdac.app.service.IRegistrationService;

@Component
@Transactional
public class RegistrationServiceImpl implements IRegistrationService {

	private static Long prnDAC = 220340120001L;
	private static Long prnDBDA = 220340130001L;
	private static Long prnDESD = 220340140001L;

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

	@Autowired
	private IEmailService emailService;

	PasswordEncoder passwordEncoder;

	// Method to validate user before registration
	@Override
	public CCATStudent checkIfValid(Long ccatNo, String fName) {
		CCATStudent validStudent = ccatUserRepository.findByCcatNoAndFName(ccatNo, fName);
		if (validStudent != null) {
			saveUser(ccatNo, fName);
			return validStudent;
		}
		return null;
	}

	// Method to save user details to dataBase
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

	// Method to save user personal details
	@Override
	public PersonalDetails savePersonalDetails(PersonalDetails pDetails) throws Exception{
		UserTable uTable = userTableRepository.findByFNameAndCCATNo(pDetails.getfName(), pDetails.getCcatNo());
		pDetails.setUserId(uTable.getUserId());

		personalDetailsRepository.save(pDetails);

		return pDetails;
	}

	// Method to save user address details
	@Override
	public UserAddress saveAddressDetails(UserAddress addressDetails) throws Exception{
		addressDetailsRepository.save(addressDetails);
		sendRegisterationEmail(addressDetails.getUserId());

		return addressDetails;

	}

	// Method to store PRN of students course wise (Admin functionality)
	@Override
	public void generatePRN(String courseName) throws Exception{
		List<PersonalDetails> list = personalDetailsRepository.findAll(courseName);
		if(list.size()>0) {
			List<UserLogin> prnList = populatePRNList(list);
			userLoginRepository.saveAll(prnList);			
		}else {
			throw new CDACAppException("NO USER REGISTERED YET!");
		}
	}

	// Method to generate PRN of students course wise
	public List<UserLogin> populatePRNList(List<PersonalDetails> list) throws Exception{
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
			UserTable userTable = userTableRepository.findByUserId(pDetail.getUserId());
			UserLogin userLogin = new UserLogin();
			passwordEncoder = new BCryptPasswordEncoder();

			userLogin.setUserId(pDetail.getUserId());

			String name = pDetail.getfName();
			if (pDetail.getmName() != null) {
				name = name + " " + pDetail.getmName();
			}
			if (pDetail.getlName() != null) {
				name = name + " " + pDetail.getlName();
			}

			userLogin.setuName(name);
			userLogin.setuPrn(prnNo);
			userLogin.setuPassword(passwordEncoder.encode(prnNo.toString()));
			userLogin.setCourse(pDetail.getCourse());
			userLogin.setuRole(userTable.getUserRole());

			prnList.add(userLogin);
			sendCredentialsEmail(prnNo,name,pDetail.getEmail());
			prnNo += 1;
		}
		return prnList;
	}

	public void sendRegisterationEmail(Long userId) {
		PersonalDetails user = personalDetailsRepository.findByUserId(userId);
		if(user!=null) {
			EmailDetails email = new EmailDetails();
			
			email.setRecipient(user.getEmail());

			String name = user.getfName();
			if (user.getmName() != null) {
				name = name + " " + user.getmName();
			}
			if (user.getlName() != null) {
				name = name + " " + user.getlName();
			}

			email.setSubject("CDAC ACTS PUNE | "
							+ "Registration Success | "
							+ name);

			String messageBody = "Hi "+name+"\n"
							   +"Greetings of the day!\n"
							   +"Welcome to CDAC ACTS Pune.\n"
							   +"\n"
							   +"\n"
							   +"\n"
							   +"You are successfully registered over the "
							   +"Student Portal.\n"
							   +"Your profile is under review with your "
							   +"Course Coordinator.\n"
							   +"You will be mailed with your login "
							   +"credentials as soon as your profile is "
							   +"verified and your account at the "
							   +"Student Portal is functional."
							   +"\n"
							   +"\n"
							   +"\n"
							   +"Best Regards,\n"
							   +"Administrator \n"
							   +"Student Portal Maintainace Team\n"
							   +"CDAC ACTS Pune.";
			email.setMsgBody(messageBody);
			emailService.sendSimpleMail(email);	
		}
	}

	public void sendCredentialsEmail(Long prnNo,String name, String emailId){
		EmailDetails email = new EmailDetails();
		email.setRecipient(emailId);
		email.setSubject("CDAC ACTS PUNE | " 
					   + "Registration Success | "
					   + name);
		
		String messageBody = "Hi "+name+"\n"
					   +"Greetings of the day!\n"
					   +"Welcome to CDAC ACTS Pune.\n"
					   +"\n"
					   +"\n"
					   +"\n"
					   +"You are successfully registered over the "
					   +"Student Portal.\n"
					   +"Your credentials to login are as follows:-\n"
					   +"\n"
					   +"\n"
					   +"user-id: " + prnNo +"\n"
					   +"password: " + prnNo +"\n"
					   +"\n"
					   +"\n"
					   +"\n"
					   +"Best Regards,\n"
					   +"Administrator \n"
					   +"Student Portal Maintainace Team\n"
					   +"CDAC ACTS Pune.";
			email.setMsgBody(messageBody);
			emailService.sendSimpleMail(email);	
		}

	@Override
	public void removeDataFromUserTable(PersonalDetails pDetail) {
		userTableRepository.deleteByCcatNo(pDetail.getCcatNo());
		
	}

	
}