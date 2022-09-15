package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.app.domain.UserLogin;

public interface IUserLoginRepository extends JpaRepository<UserLogin, Long> {

}
