package com.cdac.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.PersonalDetails;

@Repository
public interface IPersonalDetailsRepository extends JpaRepository<PersonalDetails, Long> {

	@Query(value = "select p " + "from PersonalDetails p " + "where p.course = ?1 "
			+ "order by p.fName, p.mName, p.lName")
	List<PersonalDetails> findAll(String courseName);

	@Query(value = "select p.* " + "from personal_details p " + "inner join user_login u on p.u_id = u.u_id "
			+ "where u.u_prn = :uPrn", nativeQuery = true)
	PersonalDetails findByUPrn(@Param("uPrn") Long uPrn);

	@Query(value = "select p from PersonalDetails p where p.userId = ?1")
	PersonalDetails findByUserId(Long userId);

}
