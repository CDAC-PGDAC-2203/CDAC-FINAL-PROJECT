package com.cdac.app.service;

import java.util.HashMap;

import com.cdac.app.domain.LectureLink;

public interface IJoinLectureService {
	void uploadLectureLinks(LectureLink lectureLink);

	HashMap<String, String> getLectureTime(String date, String course) throws Exception;

	HashMap<String, String> getLectureLink(String date, String course) throws Exception;
}
