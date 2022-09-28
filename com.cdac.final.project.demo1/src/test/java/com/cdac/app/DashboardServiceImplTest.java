package com.cdac.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.domain.FinalResult;
import com.cdac.app.domain.Notice;
import com.cdac.app.domain.PersonalDetails;
import com.cdac.app.domain.Role;
import com.cdac.app.domain.TotalAttendance;
import com.cdac.app.domain.UserAddress;
import com.cdac.app.domain.UserLogin;
import com.cdac.app.repositories.IAddressDetailsRepository;
import com.cdac.app.repositories.IDoubtForumRepository;
import com.cdac.app.repositories.IFinalResultRepository;
import com.cdac.app.repositories.INoticeRepository;
import com.cdac.app.repositories.IPersonalDetailsRepository;
import com.cdac.app.repositories.ITotalAttendanceRepository;
import com.cdac.app.repositories.IUserLoginRepository;

@SpringBootTest
@ActiveProfiles("test")
public class DashboardServiceImplTest {

	@Mock
	private IDoubtForumRepository doubtForumRepository;

	@Mock
	private IFinalResultRepository finalResultRepository;

	@Mock
	private ITotalAttendanceRepository totalAttendanceRepository;

	@Mock
	private IPersonalDetailsRepository personalDetailsRepository;

	@Mock
	private IAddressDetailsRepository addressDetailsRepository;

	@Mock
	private INoticeRepository noticeRepository;

	@Mock
	private IUserLoginRepository uLoginRepository;

	@Test
	public void findAllActiveDoubtTest() {
		when(doubtForumRepository.findAllActiveDoubt("Y")).thenReturn(Stream.of(
				new DoubtForum(1L, 220340120001L, "MOCK_U_NAME", "MOCK_U_EMAIL", "MOCK_SUBJECT", "MOCK_CONTENT",
						"MOCK_ATTACHMENT", "Y"),
				new DoubtForum(2L, 220340120002L, "MOCK_U_NAME", "MOCK_U_EMAIL", "MOCK_SUBJECT", "MOCK_CONTENT",
						"MOCK_ATTACHMENT", "Y"))
				.collect(Collectors.toList()));
		try {
			assertEquals(2, doubtForumRepository.findAllActiveDoubt("Y").size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getUserByPerformenceTest() {
		FinalResult result = new FinalResult(220340120001L, 20L, 25L, 44L, 30L, 40L, 50L, 40L, 30L);
		when(finalResultRepository.findByUPrn(220340120001L)).thenReturn(result);
		try {
			assertEquals(result, finalResultRepository.findByUPrn(220340120001L));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getTotalAttendanceTest() {
		TotalAttendance tAttendance = new TotalAttendance(220340120001L, "mod1", 8, 10);
		when(totalAttendanceRepository.findByUPrnAndModule(220340120001L, "mod1")).thenReturn(tAttendance);
		try {
			assertEquals(tAttendance, totalAttendanceRepository.findByUPrnAndModule(220340120001L, "mod1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getPersonalDetailsTest() {
		PersonalDetails pDetails = new PersonalDetails(1L, 2203001L, "Joy", "null", "Pahari", "M",
				LocalDate.parse("1998-09-01"), "joy@gmail.com", 7798003910L, "Btech", "joy.png", "PG-DAC", "ABC",
				7499153589L);
		when(personalDetailsRepository.findByUserId(1L)).thenReturn(pDetails);
		try {
			assertEquals(pDetails, personalDetailsRepository.findByUserId(1L));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getUserAddressDetailsTest() {
		UserAddress uAddress = new UserAddress(1L, "Flat C4", "Navelkar Apts", "Goa", "Vasco", 403802);
		UserLogin uLogin = new UserLogin(1L, "Joy Pahari", 202240120002L, "220340120002", Role.valueOf("STUDENT"),
				"PG-DAC");
		when(addressDetailsRepository.findByUPrn(202240120002L)).thenReturn(uAddress);
		try {
			assertEquals(uAddress, addressDetailsRepository.findByUPrn(uLogin.getuPrn()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getNoticeTest() {
		Notice notice1 = new Notice("HIRING", "naukri.com", "Y");
		Notice notice2 = new Notice("HIRING1", "naukri1.com", "Y");
		when(noticeRepository.findAllByVisibility("Y"))
				.thenReturn(Stream.of(notice1, notice2).collect(Collectors.toList()));
		try {
			assertEquals(2, noticeRepository.findAllByVisibility("Y").size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getUserDetailsTest() {
		UserLogin uLogin = new UserLogin(1L, "Joy Pahari", 220340120001L, "220340120001", Role.valueOf("STUDENT"),
				"PG-DAC");
		when(uLoginRepository.findByUPrn(220340120001L)).thenReturn(uLogin);
		try {
			assertEquals(uLogin, uLoginRepository.findByUPrn(220340120001L));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}