package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Module1;

@Repository
public interface IModule1Repository extends JpaRepository<Module1, Long> {
	@Query(value = "select m from Module1 m where m.uPrn = ?1")
	public Module1 getResult(Long uPrn);
}
