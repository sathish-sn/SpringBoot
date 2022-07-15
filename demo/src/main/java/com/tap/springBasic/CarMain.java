package com.tap.springBasic;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class CarMain {

	public static void main(String[] args) {
			
		//ApplicationContext applicationContext = SpringApplication.run(CarMain.class,args);
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("Context.xml");
		Car car = (Car) context.getBean("bmw", Car.class);
		System.out.println(car.GetCarDetails());
		
	
		//System.out.println(car.getEngineDetials());
		//car.close();
	}

}
