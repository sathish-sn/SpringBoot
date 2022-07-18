package com.example.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Controller
public class AppController {

	@RequestMapping("controllerJsp")
	public String controllerJsp(HttpServletRequest req) {
		
		System.out.println("First Web  Application");
		String cname = req.getParameter("cname");
		HttpSession session = req.getSession();
		session.setAttribute("cname", cname);
		return "webjsp.jsp";
	}

}
