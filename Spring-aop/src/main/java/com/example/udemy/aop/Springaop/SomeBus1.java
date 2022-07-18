package com.example.udemy.aop.Springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeBus1 {

	@Autowired
	private Dao2 dao2;

	public String Cal() {
		System.out.println("dao2");
		return dao2.retrieveData();
	}

}
