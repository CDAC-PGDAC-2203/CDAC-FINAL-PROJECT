package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Module8;

@Repository
public interface IModule8Repository extends JpaRepository<Module8, Long> {
	@Query(value = "select m from Module8 m where m.uPrn = ?1")
	public Module8 getResult(Long uPrn);
}
