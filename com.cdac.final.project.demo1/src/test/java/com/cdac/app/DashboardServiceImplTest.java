package com.cdac.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.cdac.app.domain.DoubtForum;
import com.cdac.app.repositories.IDoubtForumRepository;

@SpringBootTest
@ActiveProfiles("test")
public class DashboardServiceImplTest {
	
	@Mock
	private IDoubtForumRepository doubtForumRepository;

	@Test
	public void findAllActiveDoubtTest() {
		when(doubtForumRepository.findAllActiveDoubt("Y")).thenReturn(Stream.of(new DoubtForum(1L,220340120001L,"MOCK_U_NAME","MOCK_U_EMAIL","MOCK_SUBJECT","MOCK_CONTENT","MOCK_ATTACHMENT","Y"),new DoubtForum(2L,220340120002L,"MOCK_U_NAME","MOCK_U_EMAIL","MOCK_SUBJECT","MOCK_CONTENT","MOCK_ATTACHMENT","Y")).collect(Collectors.toList()));   
		try {
			assertEquals(2,doubtForumRepository.findAllActiveDoubt("Y").size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}