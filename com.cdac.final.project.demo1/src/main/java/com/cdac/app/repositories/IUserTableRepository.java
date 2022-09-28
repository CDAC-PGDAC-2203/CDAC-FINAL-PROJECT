package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.UserTable;

@Repository
public interface IUserTableRepository extends JpaRepository<UserTable, Long> {

	@Query(value = "select u from UserTable u where u.fName = ?1 and u.ccatNo = ?2")
	public UserTable findByFNameAndCCATNo(String fName, Long ccatNo);

	@Query(value = "select u from UserTable u where u.userId = ?1")
	public UserTable findByUserId(Long userId);

	@Modifying
	@Query(value = "delete from UserTable u where u.ccatNo = ?1")
	public void deleteByCcatNo(Long ccatNo);
}
