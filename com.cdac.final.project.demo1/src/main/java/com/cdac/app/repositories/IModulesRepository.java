package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Modules;

@Repository
public interface IModulesRepository extends JpaRepository<Modules, String> {
	@Query(value = "select m from Modules m where m.course = ?1")
	Modules findByCourse(String course);
}
