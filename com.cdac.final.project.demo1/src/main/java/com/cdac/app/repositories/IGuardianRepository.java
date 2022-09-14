package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.app.domain.Guardian;

public interface IGuardianRepository extends JpaRepository<Guardian, Long> {
}
