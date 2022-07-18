package com.example.udemy.aop.Springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class someBusiness {
	@Autowired
	private Dao1 dao1;

	public String Cal() {
		System.out.println();
		return dao1.retrieveData();
	}
}

