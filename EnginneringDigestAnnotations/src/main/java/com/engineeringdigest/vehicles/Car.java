package com.engineeringdigest.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("myCar")
@Component()
@Scope("prototype")
public class Car implements Vehicle {
	
	
	// example of field injection.
	@Autowired
	@Qualifier("noDiscount")
	private Discount discount;
	
	@Autowired
	@Qualifier("discountImpl")
	private Discount giveDiscount;
	
	@Value("${car.mrp}")
	private int mrp;
	
	public int getMrp() {
		return this.mrp;
	}
	
	// example of setter injection
//	@Autowired
//	public void setDiscount(Discount discount) {
//		this.discount = discount;
//	}

	// Example of Constructor injection
//	@Autowired
//	public Car(Discount discount) {
//		this.discount = discount;
//	}

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return "20Kmpl/-";
	}

	@Override
	public String getDiscount() {
		// TODO Auto-generated method stub
		return this.discount.getDiscount();
	}

}
