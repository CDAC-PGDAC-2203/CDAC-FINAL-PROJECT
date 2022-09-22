package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cdac.app.domain.MCQExamMarks;

public interface IMCQExamRepository extends JpaRepository<MCQExamMarks, Long> {

	@Query(value = "select m from MCQExamMarks m where m.uPrn = ?1 and m.module = ?2")
	MCQExamMarks findAllByUPrnAndModule(Long uPrn,String module);
}
