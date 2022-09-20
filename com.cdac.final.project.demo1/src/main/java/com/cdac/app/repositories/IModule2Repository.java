package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Module2;

@Repository
public interface IModule2Repository extends JpaRepository<Module2, Long> {
	@Query(value = "select m from Module2 m where m.uPrn = ?1")
	public Module2 getResult(Long uPrn);
}
