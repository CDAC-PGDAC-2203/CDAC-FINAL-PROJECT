package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Module4;

@Repository
public interface IModule4Repository extends JpaRepository<Module4, Long> {
	@Query(value = "select m from Module4 m where m.uPrn = ?1")
	public Module4 getResult(Long uPrn);
}
