package com.rest.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.crud.entities.name;
import com.rest.crud.services.NameService;

@RestController
public class MyController {
	
	@Autowired
	private NameService nameservice;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	@GetMapping("/names")
	public List<name> getNames(){
		
		  return nameservice.getNames();
	}
	
	@PostMapping("/names")
	public name addName(@RequestBody name name) {
		return nameservice.addName(name);
	}
	@PutMapping("/names")
	public name updateName(@RequestBody name name) {
		return nameservice.updateName(name);
	}
	@DeleteMapping("/names")
	public name deleteName(@RequestBody name name) {
		return nameservice.deleteName(name);
	}

}
