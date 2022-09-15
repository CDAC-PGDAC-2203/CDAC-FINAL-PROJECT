package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.UserTable;

@Repository
public interface IUserTableRepository extends JpaRepository<UserTable, Long> {

	public UserTable findByCcatNo(Long ccatNo);
}
