package com.spring.learning.springaop;

import org.springframework.stereotype.Component;

@Component
public class Processor {
	
	public void getName() {
		System.out.println("AMD Processor....");
	}
	
	public void getSpeed() {
		System.out.println("3 GHZ.........");
	}

}
