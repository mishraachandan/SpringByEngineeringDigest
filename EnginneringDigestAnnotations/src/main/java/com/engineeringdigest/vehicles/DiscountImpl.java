package com.engineeringdigest.vehicles;

import org.springframework.stereotype.Component;

@Component
public class DiscountImpl implements Discount{

	@Override
	public String getDiscount() {
		// TODO Auto-generated method stub
		return "Congratulation you get a discount of flat 15%..";
	}

}
