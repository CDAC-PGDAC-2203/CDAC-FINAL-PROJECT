/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083]
 * @Date: 21-09-2022 
 */

package com.cdac.app.bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.cdac.app.service.IExamService;

@Component
@Transactional
public class ExamServiceImpl implements IExamService {

	@Override
	public void uploadExamPaper(String paperPath, String subject) {
		String line = "";
		String splitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(paperPath))) {
			while ((line = br.readLine()) != null) {
				String[] employee = line.split(splitBy);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
