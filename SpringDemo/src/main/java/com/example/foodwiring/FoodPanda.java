package com.example.foodwiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodPanda {
//	@Autowired
	//@Qualifier("indain")
	//Menu iMenu;
	
	@Autowired
	@Qualifier("chinese")
	Menu cMenu;
	public List<String> showMenu(String choice) {
		
		return cMenu.itemsAvailable();
	
	}
}
