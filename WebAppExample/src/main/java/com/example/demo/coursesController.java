package com.example.demo;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class coursesController {
	
	// to get the data from client without using HttpServletRequest -> use String
	// cname,httpsession
	// to accept any input/ get rid of changing variable name again and agian use
	// RequestParam("cname")
//	public String courses(@RequestParam("cname") String courseName, HttpSession session) {
//
//		// HttpSession session = req.getSession();
//		// String cname = req.getParameter("cname");
//		session.setAttribute("cname", courseName);
//		System.out.println(courseName);
//
//		ArrayList list = new ArrayList();
//		list.add(courseName);
//		System.out.println(list);
//		if (courseName.equals("exit")) {
//			System.out.println(list);
//
//			System.out.println("Thank you");
//			System.exit(0);
//		}
//		return "course.jsp";
//	}
	
	//ModelAndView Example
	@RequestMapping("/courses")
	public ModelAndView courses(@RequestParam("cname") String courseName ) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname",courseName);
		mv.setViewName("course.jsp");
		return mv;
		
	}

}
