package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.ResultTable;

@Repository
public interface IResultRepository extends JpaRepository<ResultTable, Long> {
}
