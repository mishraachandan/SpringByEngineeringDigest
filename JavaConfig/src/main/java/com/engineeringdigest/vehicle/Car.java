package com.engineeringdigest.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Car implements Vehicle {
	
//	@Autowired
	private Discount discount;
	
	public Car(Discount discount) {
		this.discount = discount;
	}
	
	@Value("${car.mrp}")
	private int mrp;

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return "20kmpl/-";
	}
	
	public String getDiscount() {
		return this.discount.getDiscount();
	}
	
	public int getMrp() {
		return this.mrp;
	}

}
