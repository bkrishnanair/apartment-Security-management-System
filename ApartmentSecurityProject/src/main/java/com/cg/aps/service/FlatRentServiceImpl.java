package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.aps.entity.FlatRent;
import com.cg.aps.repository.IFlatRentRepository;

@Service("FlatRentService")
@Transactional

public class FlatRentServiceImpl implements IFlatRentService {
	

	@Autowired
	IFlatRentRepository frRepo;

	@Override
	public FlatRent add(FlatRent bean) {

		return frRepo.save(bean);
	}

	@Override
	public FlatRent update(FlatRent bean) {

		return frRepo.save(bean);
	}

	@Override
	public void delete(String id) {

		frRepo.deleteById(id);
	}

	@Override
	public List<FlatRent> findByName(String name) {

		return frRepo.findByRenterName(name);
	}

	@Override
	public Optional<FlatRent> findByPk(String id) {
		
		return frRepo.findByFlatId(id);
	}

	@Override
	public List<FlatRent> search(FlatRent bean, long pageNo, int pageSize) {
		
		return null;
	}

	@Override
	public List<FlatRent> search() {
		
		return frRepo.findAll();
	}
	
	

}
