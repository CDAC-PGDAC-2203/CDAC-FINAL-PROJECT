package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.DoubtForum;

@Repository
public interface IDoubtForumRepository extends JpaRepository<DoubtForum,Long> {
}
