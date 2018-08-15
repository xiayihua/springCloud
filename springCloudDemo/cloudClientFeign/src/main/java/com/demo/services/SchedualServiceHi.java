package com.demo.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.components.SchedualServiceHiHystric;

@FeignClient(value="service-hi", fallback=SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	public String sayHiFromClientOne(@RequestParam(value="name") String name);
}
