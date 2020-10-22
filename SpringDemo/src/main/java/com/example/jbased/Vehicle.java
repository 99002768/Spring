package com.example.jbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	 String VehicleName;
	 int vehicleId;
	 String brand;
	
	 public String getVehicleName() {
		
		 return VehicleName;
	}
	
	 @Value("bajaj")
	public void setVehicleName(String vehicleName) {
		 
		VehicleName = vehicleName;
	}
	 
	public int getVehicleId() {
		
		return vehicleId;
	}
	
	@Value("1010")
	public void setVehicleId(int vehicleId) {
		
		this.vehicleId = vehicleId;
	}
	
	public String getBrand() {
		
		return brand;
	}
	
	@Value("hondA")
	public void setBrand(String brand) {
		
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		
		return "Vehicle [VehicleName=" + VehicleName + ", vehicleId=" + vehicleId + ", brand=" + brand + "]";
	}
	
}
