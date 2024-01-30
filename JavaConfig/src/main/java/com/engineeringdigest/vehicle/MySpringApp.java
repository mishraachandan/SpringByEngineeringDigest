package com.engineeringdigest.vehicle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Vehicle carBean = context.getBean("carBean", Car.class);
		Car car = context.getBean("car", Car.class);
		System.out.println(carBean.getMileage());
		System.out.println(car.getMileage());
//		System.out.println(car.getDiscount());
		System.out.println(car.getDiscount());
		System.out.println(car.getMrp());
		context.close();
	}
}

