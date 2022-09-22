package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.UserAddress;

@Repository
public interface IAddressDetailsRepository extends JpaRepository<UserAddress, Long> {

	@Query(value = "select a.* " 
				 + "from user_address a " 
				 + "inner join user_login u on a.u_id = u.u_id "
				 + "where u.u_prn = :uPrn", nativeQuery = true)
	UserAddress findByUPrn(@Param("uPrn") Long uPrn);
}
