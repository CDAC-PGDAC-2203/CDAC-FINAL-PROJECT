package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.LabJoin;

@Repository
public interface ILabJoinRepository extends JpaRepository<LabJoin, Long> {
}
