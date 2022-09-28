package com.cdac.app.bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdac.app.domain.Faculty;
import com.cdac.app.domain.Feedback;
import com.cdac.app.exception.CDACAppException;
import com.cdac.app.repositories.IFacultyRepository;
import com.cdac.app.repositories.IFeedbackRepository;
import com.cdac.app.service.IFeedbackService;

@Component
@Transactional
public class FeedbackServiceImpl implements IFeedbackService {

	@Autowired
	private IFeedbackRepository repository;

	@Autowired
	private IFacultyRepository facultyRepository;

	// Method to store feedback to dataBase
	@Override
	public void submitFeedback(Feedback feedback) throws Exception{
		try {
			repository.save(feedback);			
		} catch(Exception e) {
			e.printStackTrace();
			throw new CDACAppException("Feedback Save Error");
		}
		
	}

	// Method to fetch feedback response (Admin functionality)
	@Override
	public List<Feedback> getFeedbackList(String course) throws Exception{
		return repository.findAllByCourse(course);
	}

	// Method to store faculty list of a particular course
	@Override
	public void importFacultyList(String filePath, String course) {
		String line = "";
		String splitBy = ",";
		List<Faculty> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			while ((line = br.readLine()) != null) {
				String[] record = line.split(splitBy);
				Faculty faculty = new Faculty();

				faculty.setFacultyId(Long.parseLong(record[0]));
				faculty.setFacultyName(record[1]);
				faculty.setCourse(course);
				faculty.setVisibilityFlag("N");

				list.add(faculty);
			}
			facultyRepository.saveAll(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Method to update faculty list (Admin functionality)
	@Override
	public void updateFacultyFlag(String flag, Long facultyId, String course) throws Exception{
		facultyRepository.updateFacultyFlag(flag, facultyId, course);
	}
}