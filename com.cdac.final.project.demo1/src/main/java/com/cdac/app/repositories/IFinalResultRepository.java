package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cdac.app.domain.FinalResult;

public interface IFinalResultRepository extends JpaRepository<FinalResult, Long> {
	@Query(value = "select f from FinalResult f where f.uPrn = ?1")
	public FinalResult findByUPrn(Long uPrn);
}
