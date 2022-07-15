package com.tap.springBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bmw")
@Primary
public class BMW implements Car{

	
	private Engine  engine;
	@Autowired           
	public BMW( @Qualifier("jetEngine") Engine engine) {
		super();
		this.engine = engine;
	}
	
	@Override
	public String GetCarDetails() {
		return "BMW";
	}

	@Override
	public String getEngineDetials() {
		return engine.getEngineDetials();
	}
	

}
