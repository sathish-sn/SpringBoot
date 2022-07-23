package com.example.youtube.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendExampleApplication {
	//private final org.slf4j.Logger log = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(BackendExampleApplication.class, args);
		
	}

	@Bean
	public ModelMapper modelmapper() {
		return new  ModelMapper();
	}
	
	
}
