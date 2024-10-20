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

import com.cg.aps.entity.FlatRent;
import com.cg.aps.service.IFlatRentService;

//import io.swagger.annotations.ApiOperation;


	
	@RestController
	@Controller
	@RequestMapping("/FlatRent")
public class FlatRentController {
		

		@Autowired
		IFlatRentService service;
		
		//@ApiOperation(value="Add FlatRent")
		@PostMapping("/addFlatRent")
		public void addFlatRent(@RequestBody FlatRent guard)
		{
			service.add(guard);
		}
		
		//@ApiOperation(value="Add FlatRent")
		@PutMapping("/updateFlatRent")
		public void updateFlatRent(@RequestBody FlatRent guard)
		{
			service.update(guard);
		}
		
		//@ApiOperation(value="Add FlatRent")
		@DeleteMapping("/deleteFlatRent/{flatno}")
		public void deleteFlatRent(@PathVariable("flatno") String id)
		{
			service.delete(id);
		}
		
		//@ApiOperation(value="Add FlatRent")
		@GetMapping("/getName/{name}")
		List<FlatRent> getByName(@PathVariable("name") String name)
		{
			
			return service.findByName(name);
		}
		
		//@ApiOperation(value="Add FlatRent")
		@GetMapping("/getById/{id}")
		 Optional<FlatRent> getByPk(@PathVariable("id") String id)
		 {
			return service.findByPk(id);
		 }
		
		//@ApiOperation(value="Add FlatRent")
		@GetMapping("/getAll")
		List<FlatRent> searchGuards()
		{
			return service.search();
		}

}
