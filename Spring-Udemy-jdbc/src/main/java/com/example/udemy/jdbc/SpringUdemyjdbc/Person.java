package com.example.udemy.jdbc.SpringUdemyjdbc;

import java.io.PrintStream;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

//@Entity
public class Person {
	//@Id
	private  int id ;
	private  String name;
	private  String location;
	private  String birth_date;
	
	
	
	public Person() {
		
	}
	
	public Person(int id, String name, String location, String birth_date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birth_date = birth_date;
	}
	public  int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public  String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	 
	@Override
	public String toString() {
		return String.format("\n Person [Id=%s, Name=%s, Location=%s, Birth_date=%s]", getId(),
				getName(), getLocation(), getBirth_date());
	}

	
//	public static void display() {
//		//System.out.println(Person.getName());
//		printStream.println("Person details [id=" + Person.getId() + ", name=" + getName() + ", location=" + getLocation() + ", birth_date=" + getBirth_date() + "]");
//	}
	

}
