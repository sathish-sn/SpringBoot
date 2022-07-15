package ExternalService;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class ExternalSeriveMain {

	public static void main(String[] args) {
		
	    try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExternalSeriveMain.class)){
		//ApplicationContext applicationContext = SpringApplication.run(ExternalSeriveMain.class,args);
		SomeExternalSerive service = applicationContext.getBean(SomeExternalSerive.class);
		System.out.println(service.returnSErviceURL());
		
	    }
		
	}

}
