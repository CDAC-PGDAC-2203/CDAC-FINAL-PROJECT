package com.cdac.app.bean;

import java.time.LocalDate;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.LectureLink;
import com.cdac.app.repositories.ILectureLinkRepository;
import com.cdac.app.service.IJoinLectureService;

@Component
@Transactional
public class JoinLectureServiceImpl implements IJoinLectureService {

	@Autowired
	private ILectureLinkRepository repository;

	@Override
	public void uploadLectureLinks(LectureLink lectureLink) {
		repository.save(lectureLink);
	}

	@Override
	public HashMap<String, String> getLectureTime(String date, String course) {

		HashMap<String, String> map = new HashMap<>();
		LectureLink lectureLink =  repository.findByDate(LocalDate.parse(date),course);
		
		map.put("theory",lectureLink.getTheoryLink().split("_")[0].toString());
		map.put("b1", lectureLink.getB1Link().split("_")[0].toString());
		map.put("b2", lectureLink.getB2Link().split("_")[0].toString());
		map.put("b3", lectureLink.getB3Link().split("_")[0].toString());
		map.put("b4", lectureLink.getB4Link().split("_")[0].toString());
		
		return map;
	}

	@Override
	public HashMap<String, String> getLectureLink(String date, String course) {

		HashMap<String, String> map = new HashMap<>();
		LectureLink lectureLink =  repository.findByDate(LocalDate.parse(date),course);
		
		map.put("theory",lectureLink.getTheoryLink().split("_")[1].toString());
		map.put("b1", lectureLink.getB1Link().split("_")[1].toString());
		map.put("b2", lectureLink.getB2Link().split("_")[1].toString());
		map.put("b3", lectureLink.getB3Link().split("_")[1].toString());
		map.put("b4", lectureLink.getB4Link().split("_")[1].toString());
		
		return map;
	}
}
