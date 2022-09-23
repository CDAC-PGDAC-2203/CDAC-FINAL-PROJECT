package com.cdac.app.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.LectureLink;

@Repository
public interface ILectureLinkRepository extends JpaRepository<LectureLink, Integer> {
	@Query(value = "select l from LectureLink l where l.sessionDate = ?1 and l.course = ?2")
	LectureLink findByDate(LocalDate date, String course);
}
