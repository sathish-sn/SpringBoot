package com.example.udemy.aop.Springaop;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
	
	
	public String retrieveData() {
		System.out.println("dao2");
		return "doa2";
	}


}
