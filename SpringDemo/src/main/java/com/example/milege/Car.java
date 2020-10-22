package com.example.milege;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCaluclator {

	@Override
	public void showMileage() {
	System.out.println("car speed 120 ");	
	}

}
