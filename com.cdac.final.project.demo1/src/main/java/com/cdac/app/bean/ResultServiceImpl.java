package com.cdac.app.bean;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.ResultTable;
import com.cdac.app.repositories.IResultRepository;
import com.cdac.app.service.IResultService;

@Component
@Transactional
public class ResultServiceImpl implements IResultService {

	@Autowired
	private IResultRepository resultRepository;

	// Method to return result to frontend
	@Override
	public HashMap<String, Object> getResult(String moduleName) {
//		ExamTable examTable = 

		return null;
	}

}
