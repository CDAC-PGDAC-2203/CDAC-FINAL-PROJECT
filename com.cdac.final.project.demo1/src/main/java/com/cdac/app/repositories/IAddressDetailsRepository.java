package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.app.domain.UserAddress;

public interface IAddressDetailsRepository extends JpaRepository<UserAddress, Long> {
}
