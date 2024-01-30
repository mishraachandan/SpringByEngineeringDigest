package com.engineeringdigest.vehicle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.engineeringdigest.vehicle")
@PropertySource("car.properties")
public class Config {
	
	@Bean
	public Vehicle carBean() {
		Car car = new Car(discount());
		return car;
	}
	
	@Bean("car")
	public Car car() {
		Car car = new Car(discount());
		return car;
	}
	
	@Bean
	public DiscountImpl discount() {
		DiscountImpl discount = new DiscountImpl();
		return discount;
	}
	
	
}
