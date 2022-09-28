package com.cdac.app.bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.EmailDetails;
import com.cdac.app.domain.Faculty;
import com.cdac.app.domain.FinalResult;
import com.cdac.app.domain.Modules;
import com.cdac.app.domain.Notice;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.TotalAttendance;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.domain.UserLogin;
import com.cdac.app.dto.DoubtDTO;
import com.cdac.app.exception.CDACAppException;
import com.cdac.app.repositories.IAddressDetailsRepository;
import com.cdac.app.repositories.IDoubtForumRepository;
import com.cdac.app.repositories.IFacultyRepository;
import com.cdac.app.repositories.IFinalResultRepository;
import com.cdac.app.repositories.IModulesRepository;
import com.cdac.app.repositories.INoticeRepository;
import com.cdac.app.repositories.IPersonalDetailsRepository;
import com.cdac.app.repositories.ITotalAttendanceRepository;
import com.cdac.app.repositories.IUserLoginRepository;
import com.cdac.app.service.IDashboardService;
import com.cdac.app.service.IEmailService;

@Component
@Transactional
public class DashboardServiceImpl implements IDashboardService {

	@Autowired
	private IDoubtForumRepository doubtForumRepository;

	@Autowired
	private IFinalResultRepository finalResultRepositiry;

	@Autowired
	private ITotalAttendanceRepository totalAttendanceRepository;

	@Autowired
	private IPersonalDetailsRepository personalDetailsRepository;

	@Autowired
	private IAddressDetailsRepository addressDetailsRepository;

	@Autowired
	private INoticeRepository noticeRepository;

	@Autowired
	private IUserLoginRepository userLoginRepository;

	@Autowired
	private IEmailService emailService;

	@Autowired
	private IModulesRepository modulesRepository;

	@Autowired
	private IFacultyRepository facultyRepository;

	private PasswordEncoder passwordEncoder;

	// Method to calculate performance of a student
	@Override
	public Double getPerformance(Long uPrn) throws Exception{
		Double performancePercentage = 0.0;
		int total = 0, obtained = 0;

		FinalResult uResult = finalResultRepositiry.findByUPrn(uPrn);
		if(uResult == null) {
			throw new CDACAppException("PERFORMANCE CALCULATION ERROR");
		}

		if (uResult.getMod1() != null) {
			obtained += uResult.getMod1();
			total += 60;
		}

		if (uResult.getMod2() != null) {
			obtained += uResult.getMod2();
			total += 60;
		}

		if (uResult.getMod3() != null) {
			obtained += uResult.getMod3();
			total += 60;
		}

		if (uResult.getMod4() != null) {
			obtained += uResult.getMod4();
			total += 60;
		}

		if (uResult.getMod5() != null) {
			obtained += uResult.getMod5();
			total += 60;
		}

		if (uResult.getMod6() != null) {
			obtained += uResult.getMod6();
			total += 60;
		}

		if (uResult.getMod7() != null) {
			obtained += uResult.getMod7();
			total += 60;
		}

		if (uResult.getMod8() != null) {
			obtained += uResult.getMod8();
			total += 60;
		}

		performancePercentage = ((obtained * 1.0) / total) * 100.0;
		return performancePercentage;
	}

	// Method to calculate attendance of a student
	@Override
	public Double getTotalAttendance(Long uPrn) throws Exception{
		List<TotalAttendance> list = totalAttendanceRepository.findByUPrn(uPrn);
		
		if(!(list.size()>0)) {
			throw new CDACAppException("TOTAL ATTENDANCE ERROR!");
		}
		
		Double attendancePercentage = 0.0;
		int lectureAttended = 0;
		int totalLecture = 0;
		if (list != null) {
			for (TotalAttendance tAttendance : list) {
				lectureAttended += tAttendance.getAttendedLecture();
				totalLecture += tAttendance.getTotalLecture();
			}
		}
		attendancePercentage = ((lectureAttended * 1.0) / totalLecture) * 100.0;
		return attendancePercentage;
	}

	// Method to get module wise attendance of a student
	@Override
	public List<TotalAttendance> getModuleAttendance(Long uPrn) throws Exception{
		List<TotalAttendance> list = totalAttendanceRepository.findByUPrn(uPrn);
		if(list.size()>0) {
			return list;
		}
		throw new CDACAppException("MODULE ATTENDACE NOT FOUND!");
	}

	// Method to store doubt details in dataBase
	@Override
	public void saveDoubtDetails(DoubtDTO doubtDetails) throws Exception{
		PersonalDetails pDetail = personalDetailsRepository.findByUPrn(doubtDetails.getuPrn());
		if(pDetail!=null) {
			String name = pDetail.getfName();
			if (pDetail.getmName() != null) {
				name = name + " " + pDetail.getmName();
			}
			if (pDetail.getlName() != null) {
				name = name + " " + pDetail.getlName();
			}
			
			DoubtForum doubt = new DoubtForum();
			
			doubt.setUserPrn(doubtDetails.getuPrn());
			doubt.setUserName(name);
			doubt.setEmail(pDetail.getEmail());
			doubt.setSubjectName(doubtDetails.getSubjectName());
			doubt.setDoubtContent(doubtDetails.getDoubtContent());
			doubt.setAttachment(doubtDetails.getAttachment());
			doubt.setActiveDoubt("Y");
			
			doubtForumRepository.save(doubt);
		}else {
			throw new CDACAppException("ERROR IN SAVING DOUBT");
		}
	}

	// Method to fetch active doubts
	@Override
	public List<DoubtForum> getActiveDoubts() throws Exception{
			return doubtForumRepository.findAllActiveDoubt("Y");
	}

	// Method to mark solved doubts in dataBase
	@Override
	public void updateActiveFlag(Long doubtId) throws Exception{
		doubtForumRepository.updateActiveFlag(doubtId, "N");
	}

	// Method to upload assignment (Admin functionality)
	@Override
	public void uploadAttendance(String filePath, String module) {
		String line = "";
		String splitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			while ((line = br.readLine()) != null) {
				String[] record = line.split(splitBy);

				Integer lecture = Integer.parseInt(record[2]);
				Integer lab = Integer.parseInt(record[3]);

				TotalAttendance ta = totalAttendanceRepository.findByUPrnAndModule(Long.parseLong(record[0]), module);
				if (ta == null) {
					ta = new TotalAttendance();
					ta.setuPrn(Long.parseLong(record[0]));
					ta.setModule(module);
					ta.setTotalLecture(Integer.parseInt(record[1]));
					ta.setAttendedLecture(lab + lecture);
				} else {
					ta.setTotalLecture(ta.getTotalLecture() + Integer.parseInt(record[1]));
					ta.setAttendedLecture(ta.getAttendedLecture() + lab + lecture);
				}
				totalAttendanceRepository.save(ta);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Method to fetch personal details
	@Override
	public HashMap<String, String> getProfile(Long uPrn) throws Exception {

		PersonalDetails pDetail = personalDetailsRepository.findByUPrn(uPrn);
		UserAddress address = addressDetailsRepository.findByUPrn(uPrn);

		if ((pDetail == null) || (address == null)) {
			throw new CDACAppException("USER DETAILS NOT FOUND!!");
		}
		HashMap<String, String> map = new HashMap<>();

		map.put("u_prn", uPrn.toString());

		String name = pDetail.getfName();
		if (pDetail.getmName() != null) {
			name = name + " " + pDetail.getmName();
		}
		if (pDetail.getlName() != null) {
			name = name + " " + pDetail.getlName();
		}
		map.put("name", name);
		map.put("course", pDetail.getCourse());
		map.put("gender", pDetail.getGender());
		map.put("dob", pDetail.getDob().toString());
		map.put("email", pDetail.getEmail());
		map.put("phone", pDetail.getPhone().toString());
		map.put("photo", pDetail.getPhoto());
		map.put("address1", address.getAddLine1());
		map.put("address2", address.getAddLine2());
		map.put("city", address.getCity());
		map.put("state", address.getState());
		map.put("pincode", address.getPincode().toString());

		return map;
	}

	@Override
	public void updateProfile(String oldPassword, String newPassword, Long uPrn) throws Exception {
		
		passwordEncoder = new BCryptPasswordEncoder();
		UserLogin user = userLoginRepository.findByUPrn(uPrn);

		if (user != null) {
			String encryptedPassword = user.getuPassword();
			if(passwordEncoder.matches(oldPassword, encryptedPassword)) {
				user.setuPassword(passwordEncoder.encode(newPassword));
				sendPasswordChangeMail(newPassword, uPrn);
			}else {
				throw new CDACAppException("WRONG OLD PASSWORD!");
			}
		} else {
			throw new CDACAppException("WRONG OLD PASSWORD!");
		}
	}

	// Method to upload notice (Admin functionality)
	@Override
	public void setNotice(String noticeName, String noticeLink) throws Exception{
		Notice notice = new Notice();
		notice.setNoticeName(noticeName);
		notice.setNoticeLink(noticeLink);
		notice.setVisibility("Y");

		noticeRepository.save(notice);
	}

	// Method to remove notice (Admin functionality)
	@Override
	public void removeNotice(String noticeName) throws Exception{
		noticeRepository.removeNotice(noticeName, "N");
	}

	// Method to get notice (Ajax call)
	@Override
	public List<HashMap<String, String>> getNotice() throws Exception{
		List<Notice> list = noticeRepository.findAllByVisibility("Y");
		List<HashMap<String, String>> listMap = new ArrayList<>();
		
		if((list == null) || (listMap == null)) {
			throw new CDACAppException("NO NOTICES FOUND!");
		}

		for (Notice notice : list) {
			HashMap<String, String> map = new HashMap<>();

			map.put("noticeName", notice.getNoticeName());
			map.put("noticeLink", notice.getNoticeLink());

			listMap.add(map);
		}

		return listMap;
	}

	public void sendPasswordChangeMail(String newPassword, Long uPrn) {
		EmailDetails email = new EmailDetails();
		PersonalDetails user = personalDetailsRepository.findByUPrn(uPrn);
		email.setRecipient(user.getEmail());

		String name = user.getfName();
		if (user.getmName() != null) {
			name = name + " " + user.getmName();
		}
		if (user.getlName() != null) {
			name = name + " " + user.getlName();
		}

		email.setSubject("CDAC ACTS PUNE | " + "Password Change Alert | " + name);

		String messageBody = "Hi "+name+"\n"
					   +"Greetings of the day!\n"
					   +"\n"
					   +"\n"
					   +"\n"
					   +"This is to bring to your kind notice "
					   +"that your login credentials have been recently modified at the "
					   +"CDAC Student Portal.\n"
					   +"Your new credentials to login are as follows:-\n"
					   +"\n"
					   +"\n"
					   +"user-id: " + uPrn +"\n"
					   +"password: " + newPassword +"\n"
					   +"\n"
					   +"\n"
					   +"\n"
					   +"Please get in touch with your Course "
					   +"Coordinator if not done by you.\n"
					   +"Best Regards,\n"
					   +"Administrator \n"
					   +"Student Portal Maintainace Team\n"
					   +"CDAC ACTS Pune.";

		email.setMsgBody(messageBody);
		emailService.sendSimpleMail(email);
	}

	@Override
	public Modules getModulesList(String course) throws Exception {
		Modules module = modulesRepository.findByCourse(course);
		if(module == null) {
			return module;
		}
		throw new CDACAppException("Invalid Course");
	}

	@Override
	public List<Faculty> getFacultyList(String course) throws Exception {
		List<Faculty> list = facultyRepository.findByCourse("Y",course);
		if(list.size()>0) {
			return list;	
		}
		throw new CDACAppException("Faculty list is empty");
	}

}