package com.cdac.app.bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.FinalResult;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.TotalAttendance;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.repositories.IAddressDetailsRepository;
import com.cdac.app.repositories.IDoubtForumRepository;
import com.cdac.app.repositories.IFinalResultRepository;
import com.cdac.app.repositories.IPersonalDetailsRepository;
import com.cdac.app.repositories.ITotalAttendanceRepository;
import com.cdac.app.service.IDashboardService;
import com.cdac.app.utils.Utils;

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
	private Utils utils;

	@Override
	public Double getPerformance(Long uPrn) {
		Double performancePercentage = 0.0;
		int total = 0, obtained = 0;

		FinalResult uResult = finalResultRepositiry.findByUPrn(uPrn);

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

	@Override
	public Double getTotalAttendance(Long uPrn) {
		List<TotalAttendance> list = totalAttendanceRepository.findByUPrn(uPrn);
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

	@Override
	public HashMap<String, Double> getModuleAttendance(Long uPrn) {
		List<TotalAttendance> list = totalAttendanceRepository.findByUPrn(uPrn);
		HashMap<String,Double> map = new HashMap<>();
		for(TotalAttendance ta:list) {
			map.put(ta.getModule(), ((ta.getAttendedLecture()*1.0)/ta.getTotalLecture())*100);
		}
		return map;
	}

	@Override
	public void saveDoubtDetails(DoubtForum doubtDetails) {
		doubtDetails.setActiveDoubt("Y");
		doubtDetails.setAttachment(utils.uploadFileAddress(doubtDetails.getAttachment(),
				doubtDetails.getUserPrn() + doubtDetails.getSubjectName()));
		doubtForumRepository.save(doubtDetails);

	}

	@Override
	public List<DoubtForum> getActiveDoubts() {
		return doubtForumRepository.findAllActiveDoubt("Y");
	}

	@Override
	public void updateActiveFlag(Long doubtId) {
		doubtForumRepository.updateActiveFlag(doubtId, "N");
	}

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

	@Override
	public HashMap<String, String> getProfile(Long uPrn) {

		PersonalDetails pDetail = personalDetailsRepository.findByUPrn(uPrn);
		UserAddress address = addressDetailsRepository.findByUPrn(uPrn);

		HashMap<String,String> map = new HashMap<>();

		map.put("u_prn", uPrn.toString());
		
		String name = pDetail.getfName();
		if (pDetail.getmName() != null) {
			name = name + " " + pDetail.getmName();
		}
		if (pDetail.getlName() != null) {
			name = name + " " +  pDetail.getlName();
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
	public void updateProfile(UserAddress address, Long uPrn) {
		UserAddress addressSaved = addressDetailsRepository.findByUPrn(uPrn);
		if((!(address.getAddLine1()).equals(addressSaved.getAddLine1())) || !(address.getPincode()).equals(addressSaved.getPincode())) {
			addressDetailsRepository.save(address);
		}
	}
}
