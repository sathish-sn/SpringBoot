package com.example.udemy.aop.Springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner { //
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	 someBusiness bus1;
	
	@Autowired
	 SomeBus1 bus2;
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		log.info(bus1.Cal());
		log.info(bus2.Cal());
		
	}

}
