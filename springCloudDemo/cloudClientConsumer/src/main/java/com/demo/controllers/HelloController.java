package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.services.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	HelloService helloService;
	
	@GetMapping(value="/hi")
	public String hi(@RequestParam String name) {
		String str = "from Ribbon===" + helloService.hiService(name);
		return str;
	}
}
