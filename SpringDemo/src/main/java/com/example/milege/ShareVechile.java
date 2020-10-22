package com.example.milege;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class ShareVechile {
	
    @Autowired
    @Qualifier("bike")
	MileCaluclator Bmile;
    @Autowired
    @Qualifier("car")
    MileCaluclator Cmile;

public void getMileage(String choice) {
	if(choice.equals("bike")) {
		Bmile.showMileage();
	}
	else {
		Cmile.showMileage();
	}
}
	
}
