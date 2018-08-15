package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.services.SchedualServiceHi;

@RestController
public class HiController {

	@Autowired
	SchedualServiceHi schedualServiceHi;
	
	@GetMapping(value="/hi")
	public String sayHi(@RequestParam String name) {
		String str = "from Feign==="+ schedualServiceHi.sayHiFromClientOne(name);
		return str;
	}
}
