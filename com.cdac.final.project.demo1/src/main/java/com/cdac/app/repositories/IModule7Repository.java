package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Module7;

@Repository
public interface IModule7Repository extends JpaRepository<Module7, Long> {
	@Query(value = "select m from Module7 m where m.uPrn = ?1")
	public Module7 getResult(Long uPrn);
}
