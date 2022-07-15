package com.tap.springBasic;

import org.springframework.stereotype.Component;

@Component("jetEngine")
public class  JetEngine implements Engine {

	@Override
	public String getEngineDetials() {
		// TODO Auto-generated method stub
		return "Jet Engine";
	}
	
	

}
