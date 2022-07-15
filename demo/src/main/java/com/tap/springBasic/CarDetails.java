package com.tap.springBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarDetails {
	@Autowired
	private RocketEngine  rocketEngine;

	public CarDetails() {
		super();
		this.rocketEngine = rocketEngine;
	}

	
	

}
