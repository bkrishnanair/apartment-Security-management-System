package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entity.Security;
import com.cg.aps.repository.ISecurityRepository;

@Service("SecurityService")
//@Transactional
public class SecurityServiceImpl implements ISecurityService {

	@Autowired
	ISecurityRepository sRepo;
	@Override
	public Security add(Security bean) {
	
		return sRepo.save(bean);
	}

	@Override
	public Security update(Security bean) {
		
		return sRepo.save(bean);
	}

	@Override
	public void delete(int id) {
			sRepo.deleteById(id);
	}

	@Override
	public Optional<Security> findByPk(Integer id) {
		
		return sRepo.findByAlertId(id);
	}

	@Override
	public List<Security> search(Integer pageNo, Integer pageSize) {
		
		return null;
	}

	@Override
	public List<Security> search() {
		
		return sRepo.findAll();
	}

}
