package com.example.udemy.aop.Springaop;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	
	public String retrieveData() 
	{
		System.out.println("dao1");
		return "doa1";
	}

}
