package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Guardian;

@Repository
public interface IGuardianRepository extends JpaRepository<Guardian, Long> {
}
