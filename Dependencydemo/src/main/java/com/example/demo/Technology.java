package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Technology {
	
	private int techId;
	private String techName;
	
	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}
	
	public String getTechName() {
		return techName;
	}
	
	public void setTechName(String techName) {
		this.techName = techName;
	}
	
	public void techDisplay() {
		System.out.println("Technology Method");
	}

}
