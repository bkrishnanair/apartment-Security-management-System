package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import com.cg.aps.entity.FlatRent;


public interface IFlatRentService {
	
	public FlatRent add(FlatRent bean);
	
	public FlatRent update(FlatRent bean);
	
	public void delete(String id);
	
	public List<FlatRent> findByName(String name);
	
	public Optional<FlatRent> findByPk(String id);
	
	public List<FlatRent> search(FlatRent bean, long pageNo, int pageSize);
	
	public List<FlatRent> search();
	

}
