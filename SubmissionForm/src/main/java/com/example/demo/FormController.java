package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@Autowired
	CustumerRepo repo;

	@RequestMapping("/")
	public String FormDetail() {
		return "Form";
	}

	@RequestMapping("/Details")
	public String Details(Customer customer) {
		repo.save(customer);
		return "Form";
	}

	@RequestMapping("/getDetails")
	public String getDetail() {
		return "VeiwCustomer";
	}

//	@GetMapping("/Form")
//	public String FormDetail() {
//		return "Form";
//	}
	@PostMapping("/getDetails")
	public ModelAndView getDetails(@RequestParam int cid) {

		ModelAndView mv = new ModelAndView("Retrive");
		Customer cust = repo.findById(cid).orElse(null);
		System.out.println(cust);
		mv.addObject("cust",cust);
		System.out.println(mv);
		return mv;

//public String ViewDetails(@RequestParam("cid") String cid ,
//						  @RequestParam("cname") String cname,
//						  @RequestParam("cmail") String cmail , ModelMap modelMap){
//	modelMap.put("cid", cid);	
//	modelMap.put("cname", cname);	
//	modelMap.put("cmail", cmail);	
//	return "VeiwCustomer";
	}
}
