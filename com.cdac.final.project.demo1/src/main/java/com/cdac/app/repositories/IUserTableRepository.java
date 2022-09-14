package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.app.domain.UserTable;

public interface IUserTableRepository extends JpaRepository<UserTable, Long> {
}
