package com.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Bike bike = ac.getBean("bike",Bike.class);
		bike.startEngine();
	
	
		Car car = ac.getBean("car",Car.class);
		car.startEngine();
	}
}
