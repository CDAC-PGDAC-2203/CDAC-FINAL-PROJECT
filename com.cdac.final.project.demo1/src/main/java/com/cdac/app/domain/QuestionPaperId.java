package com.cdac.app.domain;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class QuestionPaperId implements Serializable {

	private Integer qId;
	private String module;

	public QuestionPaperId() {
		super();
	}

	public Integer getqId() {
		return qId;
	}

	public void setqId(Integer qId) {
		this.qId = qId;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public QuestionPaperId(Integer qId, String module) {
		super();
		this.qId = qId;
		this.module = module;
	}

	@Override
	public int hashCode() {
		return Objects.hash(module, qId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionPaperId other = (QuestionPaperId) obj;
		return Objects.equals(module, other.module) && Objects.equals(qId, other.qId);
	}

}
