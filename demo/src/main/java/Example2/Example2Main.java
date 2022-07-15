package Example2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Example2Main {
	private static Logger LOGGER = LoggerFactory.getLogger(Example2Main.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(Example2Main.class,args);
		Example2 personD = applicationContext.getBean(Example2.class);
		Example2 personD1 = applicationContext.getBean(Example2.class);
		
		LOGGER.info("{}" , personD);
		LOGGER.info("{}" , personD.getJdbcConnection());
		//BinarySearchImpl binary1 = applicationContext.getBean(BinarySearchImpl.class);
		
		LOGGER.info("{}" , personD1);
		LOGGER.info("{}" , personD1.getJdbcConnection());
		
		
	}
	
	@PostConstruct
	public void postConstruct(){
		LOGGER.info("Post Costructor");
	}
	@PreDestroy
	public void preDestroy(){
		LOGGER.info("predestroy");
	}
	
}
