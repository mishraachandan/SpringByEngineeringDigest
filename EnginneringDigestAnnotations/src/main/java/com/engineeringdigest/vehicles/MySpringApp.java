package com.engineeringdigest.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Vehicle carBean = context.getBean("myCar", Vehicle.class);
		Vehicle carBean = context.getBean("car", Vehicle.class);
		Car carBean2 = context.getBean("car", Car.class);
		System.out.println(carBean.getMileage());
		System.out.println(carBean.getDiscount());
		System.out.println(carBean2.getMrp());
		System.out.println(carBean == carBean2);
	}
}
