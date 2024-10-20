package com.cg.aps.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.cg.aps.entity.GuardTrainingEntity;
import com.cg.aps.entity.Security;
import com.cg.aps.service.ISecurityService;

//import io.swagger.annotations.ApiOperation;

/**
 * @author Administrator
 *
 */
@RestController
@Controller
@RequestMapping("/security")
public class SecurityController {
	

	
	@Autowired
	ISecurityService service;
	
	//@ApiOperation(value="Add Security")
	@PostMapping("/addSecurity")
	public void addSecurity(@RequestBody Security scr)
	{
		service.add(scr);
	}
	
	//@ApiOperation(value="Update Security")
	@PutMapping("/updateGuard")
	public void updateSecurity(@RequestBody Security scr)
	{
		service.update(scr);
	}
	
	//@ApiOperation(value="Delete Security")
	@DeleteMapping("/deleteSecurity/{id}")
	public void deleteSecurity(@PathVariable("id") int id)
	{
		service.delete(id);
	}
	

	
	//@ApiOperation(value="Get Security Details by alertId")
	@GetMapping("/getById/{id}")
	 Optional<Security> getByPk(@PathVariable("id") int id)
	 {
		return service.findByPk(id);
	 }
	
	//@ApiOperation(value="Get All Security Details")
	@GetMapping("/getAll")
	List<Security> searchSecurity()
	{
		return service.search();
	}
	
	

}
