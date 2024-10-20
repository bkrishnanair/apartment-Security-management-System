package com.cg.aps.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cg.aps.entity.FlatRent;

@Repository
public interface IFlatRentRepository  extends JpaRepository<FlatRent, String>{
	
	List<FlatRent> findByRenterName(String name);
	Optional<FlatRent> findByFlatId(String id);
	
	

}
