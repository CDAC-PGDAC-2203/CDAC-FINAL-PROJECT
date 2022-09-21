package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.LectureLink;

@Repository
public interface ILectureLinkRepository extends JpaRepository<LectureLink, String> {
}
