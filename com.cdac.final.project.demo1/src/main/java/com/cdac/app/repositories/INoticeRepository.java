package com.cdac.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Notice;

@Repository
public interface INoticeRepository extends JpaRepository<Notice, String> {

	@Modifying
	@Query(value = "update Notice n SET n.visibility = ?2 where n.noticeName = ?1")
	void removeNotice(String noticeName, String flag);

	@Query(value = "select n from Notice n where n.visibility = ?1")
	List<Notice> findAllByVisibility(String flag);
}
