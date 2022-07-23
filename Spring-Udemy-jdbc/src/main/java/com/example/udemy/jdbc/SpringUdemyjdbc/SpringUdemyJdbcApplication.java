package com.example.udemy.jdbc.SpringUdemyjdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringUdemyJdbcApplication implements CommandLineRunner {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonDatail detail;

	public static void main(String[] args) {
		SpringApplication.run(SpringUdemyJdbcApplication.class, args);
		// Person.display();

	}

	@Override
	public void run(String... args) throws Exception {

		//log.info("Users are ->{}", detail.findAll());
		//log.info("User with id = 10008->{}",detail.findById(10008));
	//	log.info("Deleting = 10008->{}",detail.deleteById(10008));
		log.info("Iserting 1009->{}", detail.insertData(new Person(110,"Sunny","bangalore","14-09-1997")));

//		System.out.println("\n Person details [id=" + Person.getId() + ", name=" + Person.getName() + ", location="
//				+ Person.getLocation() + ", birth_date=" + Person.getBirth_date() + "]");

	}

}
