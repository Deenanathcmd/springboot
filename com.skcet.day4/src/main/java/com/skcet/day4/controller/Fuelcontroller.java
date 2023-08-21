package com.skcet.day4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day4.model.Fuelstation;
import com.skcet.day4.service.petrolservice;

@RestController
public class Fuelcontroller {
	
	@Autowired
	public petrolservice p;
	@PostMapping("/saveFuel")
	public Fuelstation savedetails(@RequestBody Fuelstation fs)
	{
		return p.savedetails(fs);
	}
	@GetMapping("/getFuel")
	public List<Fuelstation> getDetails()
	{
		return p.getDetails();
	}

}