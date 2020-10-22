package com.example.milege;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCaluclator{

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		System.out.print("bike speed is 150");
		
	}

}
