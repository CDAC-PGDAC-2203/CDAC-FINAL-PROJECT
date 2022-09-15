package com.cdac.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.app.domain.CCATStudent;

@Repository
public interface ICCATUserRepository extends JpaRepository<CCATStudent, Long> {

	@Query(value = "select s "
				 + "from CCATStudent s "
				 + "where s.ccatNo = ?1 and fName = ?2")
	public CCATStudent findByCcatNoAndFName(Long ccatNo,String fName);

	public CCATStudent findByCcatNo(Long ccatNo);
}
