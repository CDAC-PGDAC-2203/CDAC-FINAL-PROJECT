package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.UserAddress;

@Repository
public interface IAddressDetailsRepository extends JpaRepository<UserAddress, Long> {
}
