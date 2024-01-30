package com.engineeringdigest.vehicles;

import org.springframework.stereotype.Component;

@Component
public class NoDiscount implements Discount {

	@Override
	public String getDiscount() {
		// TODO Auto-generated method stub
		return "Sorry!, no available discount at this point.";
	}

	

}
