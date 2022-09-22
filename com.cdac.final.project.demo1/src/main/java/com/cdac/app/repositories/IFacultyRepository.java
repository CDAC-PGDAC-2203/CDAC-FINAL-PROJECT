package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cdac.app.domain.Faculty;

public interface IFacultyRepository extends JpaRepository<Faculty, Long> {

	@Modifying
	@Query(value = "update Faculty f SET f.visibilityFlag = ?1 where f.facultyId = ?2 and f.course = ?3")
	void updateFacultyFlag(String flag,Long facultyId,String course);
}
