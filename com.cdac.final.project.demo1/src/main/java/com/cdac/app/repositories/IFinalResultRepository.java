package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cdac.app.domain.FinalResultTable;

public interface IFinalResultRepository extends JpaRepository<FinalResultTable, Long> {
	@Query(value = "select f from FinalResultTable f where f.uPrn = ?1")
	public FinalResultTable findByUPrn(Long uPrn);
}
