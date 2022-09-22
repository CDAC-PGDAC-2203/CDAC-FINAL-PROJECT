package com.cdac.app.bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.app.domain.FinalResult;
import com.cdac.app.domain.MCQExamMarks;
import com.cdac.app.domain.Module1;
import com.cdac.app.domain.Module2;
import com.cdac.app.domain.Module3;
import com.cdac.app.domain.Module4;
import com.cdac.app.domain.Module5;
import com.cdac.app.domain.Module6;
import com.cdac.app.domain.Module7;
import com.cdac.app.domain.Module8;
import com.cdac.app.domain.TotalAttendance;
import com.cdac.app.repositories.IFinalResultRepository;
import com.cdac.app.repositories.IMCQExamRepository;
import com.cdac.app.repositories.IModule1Repository;
import com.cdac.app.repositories.IModule2Repository;
import com.cdac.app.repositories.IModule3Repository;
import com.cdac.app.repositories.IModule4Repository;
import com.cdac.app.repositories.IModule5Repository;
import com.cdac.app.repositories.IModule6Repository;
import com.cdac.app.repositories.IModule7Repository;
import com.cdac.app.repositories.IModule8Repository;
import com.cdac.app.repositories.ITotalAttendanceRepository;
import com.cdac.app.service.IResultService;

@Component
@Transactional
public class ResultServiceImpl implements IResultService {

	@Autowired
	private IModule1Repository module1Repository;

	@Autowired
	private IModule2Repository module2Repository;

	@Autowired
	private IModule3Repository module3Repository;

	@Autowired
	private IModule4Repository module4Repository;

	@Autowired
	private IModule5Repository module5Repository;

	@Autowired
	private IModule6Repository module6Repository;

	@Autowired
	private IModule7Repository module7Repository;

	@Autowired
	private IModule8Repository module8Repository;

	@Autowired
	private ITotalAttendanceRepository totalAttendanceRepository;

	@Autowired
	private IMCQExamRepository mcqExamRepository;

	@Autowired
	private IFinalResultRepository finalResultRepository;

	// Method to return result to frontend
	@Override
	public HashMap<String, String> getResult(Long uPrn, String moduleName) {
		HashMap<String, String> map = new HashMap<>();
		Module1 m1 = null;
		Module2 m2 = null;
		Module3 m3 = null;
		Module4 m4 = null;
		Module5 m5 = null;
		Module6 m6 = null;
		Module7 m7 = null;
		Module8 m8 = null;

		if ("mod1".equals(moduleName)) {
			m1 = module1Repository.getResult(uPrn);
			map.put("lab", m1.getLab().toString());
			map.put("assessment", m1.getAssessment().toString());
			map.put("attendance", m1.getAttendance().toString());
		}
		if ("mod2".equals(moduleName)) {
			m2 = module2Repository.getResult(uPrn);
			map.put("lab", m2.getLab().toString());
			map.put("assessment", m2.getAssessment().toString());
			map.put("attendance", m2.getAttendance().toString());
		}
		if ("mod3".equals(moduleName)) {
			m3 = module3Repository.getResult(uPrn);
			map.put("lab", m3.getLab().toString());
			map.put("assessment", m3.getAssessment().toString());
			map.put("attendance", m3.getAttendance().toString());
		}
		if ("mod4".equals(moduleName)) {
			m4 = module4Repository.getResult(uPrn);
			map.put("lab", m4.getLab().toString());
			map.put("assessment", m4.getAssessment().toString());
			map.put("attendance", m4.getAttendance().toString());
		}
		if ("mod5".equals(moduleName)) {
			m5 = module5Repository.getResult(uPrn);
			map.put("lab", m5.getLab().toString());
			map.put("assessment", m5.getAssessment().toString());
			map.put("attendance", m5.getAttendance().toString());
		}
		if ("mod6".equals(moduleName)) {
			m6 = module6Repository.getResult(uPrn);
			map.put("lab", m6.getLab().toString());
			map.put("assessment", m6.getAssessment().toString());
			map.put("attendance", m6.getAttendance().toString());
		}
		if ("mod7".equals(moduleName)) {
			m7 = module7Repository.getResult(uPrn);
			map.put("lab", m7.getLab().toString());
			map.put("assessment", m7.getAssessment().toString());
			map.put("attendance", m7.getAttendance().toString());
		}
		if ("mod8".equals(moduleName)) {
			m8 = module8Repository.getResult(uPrn);
			map.put("lab", m8.getLab().toString());
			map.put("assessment", m8.getAssessment().toString());
			map.put("attendance", m8.getAttendance().toString());
		}

		return map;
	}

	@Override
	public void setResult(String filePath, String module, String course) {
		String line = "";
		String splitBy = ",";
		List<Module1> list1 = new ArrayList<>();
		List<Module2> list2 = new ArrayList<>();
		List<Module3> list3 = new ArrayList<>();
		List<Module4> list4 = new ArrayList<>();
		List<Module5> list5 = new ArrayList<>();
		List<Module6> list6 = new ArrayList<>();
		List<Module7> list7 = new ArrayList<>();
		List<Module8> list8 = new ArrayList<>();
		List<FinalResult> listFinal = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			while ((line = br.readLine()) != null) {
				String[] record = line.split(splitBy);
				FinalResult finalResult = new FinalResult();

				if ("mod1".equals(module)) {
					Module1 moduleResult = new Module1();
					moduleResult.setuPrn(Long.parseLong(record[0]));
					moduleResult.setAttendance(getAttendanceMarks(Long.parseLong(record[0]), module));
					moduleResult.setLab(Long.parseLong(record[1]));
					moduleResult.setAssessment(getMCQMarks(Long.parseLong(record[0]), module));

					finalResult.setuPrn(Long.parseLong(record[0]));
					finalResult.setMod1(moduleResult.getAssessment() + moduleResult.getLab() + moduleResult.getAttendance());

					list1.add(moduleResult);
					listFinal.add(finalResult);

				} else if ("mod2".equals(module)) {
					Module2 moduleResult = new Module2();
					moduleResult.setuPrn(Long.parseLong(record[0]));
					moduleResult.setAttendance(getAttendanceMarks(Long.parseLong(record[0]), module));
					moduleResult.setLab(Long.parseLong(record[1]));
					moduleResult.setAssessment(getMCQMarks(Long.parseLong(record[0]), module));

					finalResult.setuPrn(Long.parseLong(record[0]));
					finalResult.setMod2(moduleResult.getAssessment() + moduleResult.getLab() + moduleResult.getAttendance());

					list2.add(moduleResult);
					listFinal.add(finalResult);

				} else if ("mod3".equals(module)) {
					Module3 moduleResult = new Module3();
					moduleResult.setuPrn(Long.parseLong(record[0]));
					moduleResult.setAttendance(getAttendanceMarks(Long.parseLong(record[0]), module));
					moduleResult.setLab(Long.parseLong(record[1]));
					moduleResult.setAssessment(getMCQMarks(Long.parseLong(record[0]), module));

					finalResult.setuPrn(Long.parseLong(record[0]));
					finalResult.setMod3(moduleResult.getAssessment() + moduleResult.getLab() + moduleResult.getAttendance());

					list3.add(moduleResult);
					listFinal.add(finalResult);

				} else if ("mod4".equals(module)) {
					Module4 moduleResult = new Module4();
					moduleResult.setuPrn(Long.parseLong(record[0]));
					moduleResult.setAttendance(getAttendanceMarks(Long.parseLong(record[0]), module));
					moduleResult.setLab(Long.parseLong(record[1]));
					moduleResult.setAssessment(getMCQMarks(Long.parseLong(record[0]), module));

					finalResult.setuPrn(Long.parseLong(record[0]));
					finalResult.setMod4(moduleResult.getAssessment() + moduleResult.getLab() + moduleResult.getAttendance());
					
					list4.add(moduleResult);
					listFinal.add(finalResult);

				} else if ("mod5".equals(module)) {
					Module5 moduleResult = new Module5();
					moduleResult.setuPrn(Long.parseLong(record[0]));
					moduleResult.setAttendance(getAttendanceMarks(Long.parseLong(record[0]), module));
					moduleResult.setLab(Long.parseLong(record[1]));
					moduleResult.setAssessment(getMCQMarks(Long.parseLong(record[0]), module));

					finalResult.setuPrn(Long.parseLong(record[0]));
					finalResult.setMod5(moduleResult.getAssessment() + moduleResult.getLab() + moduleResult.getAttendance());

					list5.add(moduleResult);
					listFinal.add(finalResult);

				} else if ("mod6".equals(module)) {
					Module6 moduleResult = new Module6();
					moduleResult.setuPrn(Long.parseLong(record[0]));
					moduleResult.setAttendance(getAttendanceMarks(Long.parseLong(record[0]), module));
					moduleResult.setLab(Long.parseLong(record[1]));
					moduleResult.setAssessment(getMCQMarks(Long.parseLong(record[0]), module));

					finalResult.setuPrn(Long.parseLong(record[0]));
					finalResult.setMod6(moduleResult.getAssessment() + moduleResult.getLab() + moduleResult.getAttendance());

					list6.add(moduleResult);
					listFinal.add(finalResult);

				} else if ("mod7".equals(module)) {
					Module7 moduleResult = new Module7();
					moduleResult.setuPrn(Long.parseLong(record[0]));
					moduleResult.setAttendance(getAttendanceMarks(Long.parseLong(record[0]), module));
					moduleResult.setLab(Long.parseLong(record[1]));
					moduleResult.setAssessment(getMCQMarks(Long.parseLong(record[0]), module));

					finalResult.setuPrn(Long.parseLong(record[0]));
					finalResult.setMod7(moduleResult.getAssessment() + moduleResult.getLab() + moduleResult.getAttendance());

					list7.add(moduleResult);
					listFinal.add(finalResult);

				} else {
					Module8 moduleResult = new Module8();
					moduleResult.setuPrn(Long.parseLong(record[0]));
					moduleResult.setAttendance(getAttendanceMarks(Long.parseLong(record[0]), module));
					moduleResult.setLab(Long.parseLong(record[1]));
					moduleResult.setAssessment(getMCQMarks(Long.parseLong(record[0]), module));

					finalResult.setuPrn(Long.parseLong(record[0]));
					finalResult.setMod8(moduleResult.getAssessment() + moduleResult.getLab() + moduleResult.getAttendance());

					list8.add(moduleResult);
					listFinal.add(finalResult);

				}
			}
			if (!list1.isEmpty()) {
				module1Repository.saveAll(list1);
			} else if (!list2.isEmpty()) {
				module2Repository.saveAll(list2);
			} else if (!list3.isEmpty()) {
				module3Repository.saveAll(list3);
			} else if (!list4.isEmpty()) {
				module4Repository.saveAll(list4);
			} else if (!list5.isEmpty()) {
				module5Repository.saveAll(list5);
			} else if (!list6.isEmpty()) {
				module6Repository.saveAll(list6);
			} else if (!list7.isEmpty()) {
				module7Repository.saveAll(list7);
			} else {
				module8Repository.saveAll(list8);
			}
			finalResultRepository.saveAll(listFinal);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Long getAttendanceMarks(Long uPRN, String module) {
		TotalAttendance ta = totalAttendanceRepository.findByUPrnAndModule(uPRN, module);
		if(ta!=null){
			Integer totalAttendance = ta.getTotalLecture();
			Integer actualAttendance = ta.getAttendedLecture();
			return Math.round(((actualAttendance * 1.0) / totalAttendance) * 10);
		}
		return 0L;
	}

	public Long getMCQMarks(Long uPrn, String module) {
		MCQExamMarks mcqMarks = mcqExamRepository.findAllByUPrnAndModule(uPrn,module);
		return mcqMarks.getMarks();
	}
}
