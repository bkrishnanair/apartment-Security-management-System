package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import com.cg.aps.entity.Security;

public interface ISecurityService {
	
	public Security add(Security bean); 
	
	public Security update(Security bean);
	
	public void delete(int id);
	
	public Optional<Security> findByPk(Integer id); 
	
	public List<Security> search(Integer pageNo, Integer pageSize); 
	
	public List<Security> search();
	
}
