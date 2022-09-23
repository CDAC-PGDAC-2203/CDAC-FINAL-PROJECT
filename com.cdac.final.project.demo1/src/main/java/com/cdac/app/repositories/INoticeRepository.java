package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.Notice;

@Repository
public interface INoticeRepository extends JpaRepository<Notice, String> {
}
