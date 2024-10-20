package com.cg.aps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import com.cg.aps.entity.Security;

@Repository
public interface ISecurityRepository extends JpaRepository<Security,Integer>{
	
	Optional<Security> findByAlertId (Integer id);

}
