package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.TotalAttendance;
import com.cdac.app.domain.AttendanceId;

@Repository
public interface ITotalAttendanceRepository extends JpaRepository<TotalAttendance, AttendanceId> {
}
