package com.spring.learning.springaop.Info;

import org.springframework.stereotype.Component;

@Component
public class Hardware {

	public void getName() {
		System.out.println("Hardware........");
	}
	
	public void getDetails() {
		System.out.println("Micro Chip.................");
	}
}
