package com.chandan.vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Vehicle carBean = context.getBean("myCar", Vehicle.class);
		Vehicle carBean2 = context.getBean("myCar", Vehicle.class);
		System.out.println(carBean == carBean2); // true as >> by default singleton is used. 
		
//		Vehicle beanBus = context.getBean("myBus", Vehicle.class);
//		System.out.println(carBean.getMileage());
//		System.out.println(carBean.getDiscount());
//		System.out.println(carBean.getBrandName());
//		System.out.println(carBean.getPrice());
//		System.out.println(beanBus.getPrice());
		context.close();
	}
}
