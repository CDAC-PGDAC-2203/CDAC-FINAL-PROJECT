package com.cdac.app.service;

import java.util.HashMap;

public interface IResultService {
	HashMap<String, String> getResult(Long uPrn, String moduleName) throws Exception;
	void setResult(String filePath, String module, String course);
}
