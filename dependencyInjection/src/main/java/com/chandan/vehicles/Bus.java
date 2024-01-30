package com.chandan.vehicles;

public class Bus implements Vehicle {
	
	private DiscountService discountService;
	
	private long price;
	
	private String brandName;
	
	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
//	public Bus(DiscountService discountService) {
//		this.discountService = discountService;
//	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}

	@Override
	public long getMileage() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public String getDiscount() {
		// TODO Auto-generated method stub
		return this.discountService.getDiscountMessage();
	}

	@Override
	public String getBrandName() {
		// TODO Auto-generated method stub
		return brandName;
	}

}
