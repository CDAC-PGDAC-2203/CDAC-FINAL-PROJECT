package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Module6;

@Repository
public interface IModule6Repository extends JpaRepository<Module6, Long> {
	@Query(value = "select m from Module6 m where m.uPrn = ?1")
	public Module6 getResult(Long uPrn);
}
