package com.example.udemy.aop.Springaop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration

public class BeforeAspect {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Before("Execution(*com.example.udemy.aop.Springaop..*.*(..))")
	public void before(Joinpoint jointpoint) {
		log.info("intercepted method calls->{}",jointpoint);
		
	}
	

}
