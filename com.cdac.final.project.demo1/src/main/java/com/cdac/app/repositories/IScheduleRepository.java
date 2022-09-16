package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Schedule;

@Repository
public interface IScheduleRepository extends JpaRepository<Schedule, Long> {
}
