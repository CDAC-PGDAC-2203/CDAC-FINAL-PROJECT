package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.UserTable;

@Repository
public interface IUserTableRepository extends JpaRepository<UserTable, Long> {

	@Query(value = "select u from UserTable u where u.ccatNo = ccatNo")
	public UserTable findByCcatNo(@Param("ccatNo") Long ccatNo);
}
