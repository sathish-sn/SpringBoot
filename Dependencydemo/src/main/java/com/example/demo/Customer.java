package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	
	private int  custId;
	private String name;
	private String course;
	@Autowired
private Technology techDetails;

	
	public Technology getTechDetails() {
		return techDetails;
	}

	
	public void setTechDetails(Technology techDetails) {
		this.techDetails = techDetails;
	}

	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void display() {
		System.out.println("Customer object returned successfully");
		techDetails.techDisplay();
	}
}
