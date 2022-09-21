/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083]
 * @Date: 21-09-2022 
 */

package com.cdac.app.bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdac.app.domain.QuestionPaper;
import com.cdac.app.repositories.IExamRepository;
import com.cdac.app.service.IExamService;

@Component
@Transactional
public class ExamServiceImpl implements IExamService {

	@Autowired
	private IExamRepository repository;
	
	@Override
	public void uploadExamPaper(String paperPath, String subject) {
		String line = "";
		String splitBy = ",";
		List<QuestionPaper> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(paperPath))) {
			while ((line = br.readLine()) != null) {
				String[] record = line.split(splitBy);
				QuestionPaper question = new QuestionPaper();
				
				question.setQuestion(record[0]);
				question.setOption1(record[1]);
				question.setOption2(record[2]);
				question.setOption3(record[3]);
				question.setOption4(record[4]);
				question.setAnswer(record[5]);
				question.setModule(record[6]);

				list.add(question);
			}
			repository.saveAll(list);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<QuestionPaper> getQuestionPaper(String module) {
		return repository.findAllByModule(module);
	}
}
