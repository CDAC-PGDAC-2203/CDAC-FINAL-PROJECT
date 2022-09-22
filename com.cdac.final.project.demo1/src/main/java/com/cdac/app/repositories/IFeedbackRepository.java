package com.cdac.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cdac.app.domain.Feedback;

public interface IFeedbackRepository extends JpaRepository<Feedback, Long> {
	
	@Query(value = "select f from Feedback f where f.course = ?1")
	List<Feedback> findAllByCourse(String course);

}
