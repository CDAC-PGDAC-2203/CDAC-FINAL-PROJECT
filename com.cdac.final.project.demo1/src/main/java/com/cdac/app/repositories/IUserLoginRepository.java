package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.UserLogin;

@Repository
public interface IUserLoginRepository extends JpaRepository<UserLogin, Long> {
}
