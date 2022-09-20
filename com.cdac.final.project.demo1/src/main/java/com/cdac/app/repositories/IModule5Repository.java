package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Module5;

@Repository
public interface IModule5Repository extends JpaRepository<Module5, Long> {
	@Query(value = "select m from Module5 m where m.uPrn = ?1")
	public Module5 getResult(Long uPrn);
}
