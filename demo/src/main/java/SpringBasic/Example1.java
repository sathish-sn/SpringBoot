package SpringBasic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Example1 {
	
	public static void main(String[] args) {
//		BinarySearch obj = new BinarySearch(new OuickSort());
//		int res = obj.binarySearch(new int[] { 12, 4, 6 }, 7);
//		System.out.println(res);
		
		ApplicationContext applicationContext = SpringApplication.run(Example1.class,args);
		BinarySearchImpl binary = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binary1 = applicationContext.getBean(BinarySearchImpl.class);
		int res = binary.binarySearch(new int[] { 12, 4, 6 }, 7); 
		System.out.println(res);
		
		
	}

}
