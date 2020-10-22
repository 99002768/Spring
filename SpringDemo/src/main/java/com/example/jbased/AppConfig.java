package com.example.jbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.autowired.Rectangle;
import com.example.autowired.Shape;
import com.example.autowired.ShapeFactory;
import com.example.autowired.Triangle;

@Configuration
public class AppConfig {
	
	@Bean
	public Shape getTriangle() {
		
		return new Triangle();
	}

	
	@Bean
	@Primary
	public Shape getRectangle() {
		
		return new Rectangle();
	}
	
	
	@Bean
	public Vehicle getVehicle() {
		
		return new Vehicle();
	}
	
	@Bean
	ShapeFactory getFactory() {
		
		return new ShapeFactory();
	}
}
