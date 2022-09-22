package com.cdac.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.TotalAttendance;

@Repository
public interface ITotalAttendanceRepository extends JpaRepository<TotalAttendance, Long> {
	@Query(value = "select t from TotalAttendance t where t.uPrn = ?1")
	List<TotalAttendance> findByUPrn(Long uPrn);

	@Query(value = "select t from TotalAttendance t where t.uPrn = ?1 and t.module = ?2")
	TotalAttendance findByUPrnAndModule(Long uPrn, String module);
}
