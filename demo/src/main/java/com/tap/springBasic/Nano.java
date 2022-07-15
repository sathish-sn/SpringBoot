package com.tap.springBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("nano")
public class Nano implements Car {

	
	private Engine  engine;
	
	@Override
	public String GetCarDetails() {
		
		return "Nano";
	}

	@Override
	public String getEngineDetials() {
		
		return engine.getEngineDetials();
	}
	@Autowired
	public Nano( @Qualifier("rocketEngine") Engine Engine) {
		super();
		this.engine = engine;
	}
	

}
