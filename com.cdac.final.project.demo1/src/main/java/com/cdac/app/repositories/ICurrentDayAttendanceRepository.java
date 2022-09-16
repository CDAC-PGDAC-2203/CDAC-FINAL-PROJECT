package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.AttendanceId;
import com.cdac.app.domain.CurrentDayAttendance;

@Repository
public interface ICurrentDayAttendanceRepository extends JpaRepository<CurrentDayAttendance, AttendanceId> {
}
