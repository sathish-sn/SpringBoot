package SpringBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class HelloWorld {
	//@Autowired
	private String message;

	
	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
