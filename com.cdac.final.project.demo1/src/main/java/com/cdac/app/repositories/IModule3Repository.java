package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Module3;

@Repository
public interface IModule3Repository extends JpaRepository<Module3, Long> {
	@Query(value = "select m from Module3 m where m.uPrn = ?1")
	public Module3 getResult(Long uPrn);
}
