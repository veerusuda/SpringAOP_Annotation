package com.spring.learning.springaop.Info;

import org.springframework.stereotype.Component;

@Component
public class Software {
	
	public void getName() {
		System.out.println("Operating System........");
	}
	
	public void getDetails() {
		System.out.println("Android.................");
	}
}
