package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.app.domain.PersonalDetails;

public interface IPersonalDetailsRepository extends JpaRepository<PersonalDetails, Long> {
}
