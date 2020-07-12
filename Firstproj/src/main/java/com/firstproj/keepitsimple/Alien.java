package com.firstproj.keepitsimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	@Autowired
	Laptop lap;

	public void code() {
		// TODO Auto-generated method stub
		lap.compile();
		System.out.println("I am coding ...");
		
	}

	

}
