package com.spring.learning.springaop;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	private String brand;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void getMobileDetails() {
		System.out.println("Inside Mobile::::::");
	}
	
	public String getMobileBrand() {
		System.out.println("Inside Mobile Brand Method.....");
		return "Nokia";
	}
	
	public void throwError() throws Exception {
		System.out.println("Inside Mobile throwError.....");
		throw new Exception("Generic Error");
	}
	
	public void getMobileInfo () {
		System.out.println("Mobile is Nokia.....");
	}
	
}
