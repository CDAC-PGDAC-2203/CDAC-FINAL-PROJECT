package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.UserLogin;

@Repository
public interface IUserLoginRepository extends JpaRepository<UserLogin, Long> {

	@Query(value = "select u from UserLogin u where u.userId = ?1")
	UserLogin findByUserId(Long userId);

	@Query(value = "select u from UserLogin u where u.uPrn = ?1")
	UserLogin findByUPrn(Long userName);
}
