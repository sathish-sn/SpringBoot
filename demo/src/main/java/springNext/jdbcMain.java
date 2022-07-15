package springNext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class jdbcMain {
	private static Logger LOGGER = LoggerFactory.getLogger(jdbcMain.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(jdbcMain.class,args);
		JdbcConstructor personD = applicationContext.getBean(JdbcConstructor.class);
		//JdbcConstructor personD1 = applicationContext.getBean(JdbcConstructor.class);
		
//		LOGGER.info("{}" , personD);
//		LOGGER.info("{}" , personD.getJdbcConnection());
		
//		LOGGER.info("{}" , personD1);
//		LOGGER.info("{}" , personD1.getJdbcConnection());
//		
		
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

