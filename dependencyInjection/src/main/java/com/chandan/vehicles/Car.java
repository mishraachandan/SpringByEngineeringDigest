package com.chandan.vehicles;

public class Car implements Vehicle{
	
	private DiscountService discountService;
	private String brandName;
	private long price;
	
	// Using constructor injection for providing the dependency
//	public Car(DiscountService discountService) {
//		this.discountService = discountService;
//	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}

	@Override
	public long getMileage() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public String getDiscount() {
		// TODO Auto-generated method stub
		return this.discountService.getDiscountMessage();
	}

}
