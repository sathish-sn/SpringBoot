package CdiExample;

import java.lang.System.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class OneMain {
	//private static Logger LOGGER = (Logger) LogFactory.getLog(OneMain.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(OneMain.class,args);
		CdiBussiness personD = applicationContext.getBean(CdiBussiness.class);
		CdiBussiness personD1 = applicationContext.getBean(CdiBussiness.class);
		//personD.setSomeCdiDao("sathish");
		System.out.println(personD);
//		LOGGER.info("{}" , personD);
//		LOGGER.info("{}" , personD.getJdbcConnection());
//		//BinarySearchImpl binary1 = applicationContext.getBean(BinarySearchImpl.class);
//		
//		LOGGER.info("{}" , personD1);
//		LOGGER.info("{}" , personD1.getJdbcConnection());
//		
		
	}
	
//	@PostConstruct
//	public void postConstruct(){
//		LOGGER.info("Post Costructor");
//	}
//	@PreDestroy
//	public void preDestroy(){
//		LOGGER.info("predestroy");
//	

}
