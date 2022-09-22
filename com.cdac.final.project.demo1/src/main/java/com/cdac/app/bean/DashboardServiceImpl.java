package com.cdac.app.bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.CurrentDayAttendance;
import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.FinalResultTable;
import com.cdac.app.domain.TotalAttendance;
import com.cdac.app.repositories.ICurrentDayAttendanceRepository;
import com.cdac.app.repositories.IDoubtForumRepository;
import com.cdac.app.repositories.IFinalResultRepository;
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
	private ICurrentDayAttendanceRepository currentDayAttendanceRepository;

	@Autowired
	private Utils utils;

	@Override
	public Double getPerformance(Long uPrn) {
		Double performancePercentage = 0.0;
		int total = 0, obtained = 0;

		FinalResultTable uResult = finalResultRepositiry.findByUPrn(uPrn);

		List<Integer> list = Arrays.asList(uResult.getMod1(), uResult.getMod2(), uResult.getMod3(), uResult.getMod4(),
				uResult.getMod5(), uResult.getMod6(), uResult.getMod7(), uResult.getMod8());

		for (int i : list) {
			obtained += i;
			if (i > 0) {
				total += 60;
			}
		}

		performancePercentage = ((obtained * 1.0) / total) * 100.0;
		return performancePercentage;
	}

	@Override
	public Double getAttendance(Long uPrn) {
		Double attendancePercentage = 0.0;
		List<TotalAttendance> list = totalAttendanceRepository.findByUPrn(uPrn);

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
	public void uploadAttendance(String filePath, String subject) {
		String line = "";
		String splitBy = ",";
		List<CurrentDayAttendance> list = new ArrayList<>();
		List<TotalAttendance> listTotal = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			while ((line = br.readLine()) != null) {
				String[] record = line.split(splitBy);
				CurrentDayAttendance cda = new CurrentDayAttendance();

				cda.setuPrn(Long.parseLong(record[0]));
				cda.setModule(subject);
				cda.setTodayDate(LocalDate.parse(record[1]));
				cda.setLectureCount(Integer.parseInt(record[2]));

				Integer lecture = Integer.parseInt(record[3]);
				Integer lab = Integer.parseInt(record[4]);

				cda.setLectureAttendance(lecture);
				cda.setLabAttendance(lab);
				cda.setTotalAttended(lab + lecture);

				TotalAttendance ta = totalAttendanceRepository.findByUPrnAndModule(cda.getuPrn(), subject);
				if (ta == null) {
					ta = new TotalAttendance();
				}

				ta.setuPrn(cda.getuPrn());
				ta.setModule(cda.getModule());
				if ((ta.getTotalLecture() == null) && (ta.getAttendedLecture() == null)) {
					ta.setTotalLecture(cda.getLectureCount());
					ta.setAttendedLecture(lab + lecture);
				} else {
					ta.setTotalLecture(ta.getTotalLecture() + cda.getLectureCount());
					ta.setAttendedLecture(ta.getAttendedLecture() + lab + lecture);
				}

				list.add(cda);
				listTotal.add(ta);
			}
			currentDayAttendanceRepository.saveAll(list);
			totalAttendanceRepository.saveAll(listTotal);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
