/*
 * CDAC Final Project - CDAC APP
 * @Author: Hardik Agarwal [220340120083]
 * @Date: 21-09-2022 
 */

package com.cdac.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.QuestionPaper;

@Repository
public interface IExamRepository extends JpaRepository<QuestionPaper, String> {

	@Query(value = "select q from QuestionPaper q where q.module = ?1 order by q.qId")
	List<QuestionPaper> findAllByModule(String module);
}
