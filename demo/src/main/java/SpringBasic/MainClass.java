package SpringBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	
	
		      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ApplicationContext applicationContext = SpringApplication.run(MainClass.class,args);
		
		   //   HelloWorld obj = (HelloWorld) applicationContext.getBean("helloworld");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		     // obj.setMessage("hi this is class HelloWorld ");
		      obj.getMessage();
		   }
		
	}


