package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Controller
public class AppController {

	@RequestMapping("WebJSP")
	public String controllerJsp() {
		
		System.out.println("First Web  Application");
		return "WebJSP";
	}

}
