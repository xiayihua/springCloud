package com.demo.components;

import com.demo.services.SchedualServiceHi;

public class SchedualServiceHiHystric implements SchedualServiceHi{

	public String sayHiFromClientOne(String name) {
		return "sorry"+name;
	}
}
