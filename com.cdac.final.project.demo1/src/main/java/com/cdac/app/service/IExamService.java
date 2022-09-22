/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083]
 * @Date: 21-09-2022 
 */

package com.cdac.app.service;

import java.util.HashMap;
import java.util.List;

import com.cdac.app.domain.QuestionPaper;

public interface IExamService {
	void uploadExamPaper(String paperPath, String subject);

	List<QuestionPaper> getQuestionPaper(String module);

	void examAttempt(HashMap<String,String> map, String module, Long uPrn);
}
