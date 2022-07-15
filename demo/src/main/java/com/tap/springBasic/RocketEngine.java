package com.tap.springBasic;

import org.springframework.stereotype.Component;

@Component("rocketEngine")
public class RocketEngine implements Engine {

	@Override
	public String getEngineDetials() {
		// TODO Auto-generated method stub
		return "Rocket Engine ";
	}

}
