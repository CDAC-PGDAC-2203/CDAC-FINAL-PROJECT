package com.cdac.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.DoubtForum;

@Repository
public interface IDoubtForumRepository extends JpaRepository<DoubtForum,Long> {
	
	@Query(value = "select d from DoubtForum d where d.activeDoubt = ?1")
	List<DoubtForum> findAllActiveDoubt(String activeDoubt);

	@Query(value = "UPDATE DoubtForum d SET d.activeDoubt = ?2 where d.doubtId = ?1")
	void updateActiveFlag(Long doubtId, String flag);
}
