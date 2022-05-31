package com.abhishek.srivastava.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhishek.srivastava.springboot.dao.SaveCustomerdao;
import com.abhishek.srivastava.springboot.model.customer;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class RequestHandler {

	@Autowired
	SaveCustomerdao saveCustomer;
	
	@RequestMapping("/")
	public String homePage()
	{
		return "index.jsp";
	}
	
	@PostMapping("addCustomer")
	public String addCustomer()
	{
		return "addCustomer.jsp";
	}
	
	@PostMapping("save")
	public String Save(@ModelAttribute("customer") customer customer, Model m)
 	{  String details;
	   boolean result =  saveCustomer.UpdateDetails(customer);
	   if(result)
	   {   details = "details saved Successfully!!";
		  m.addAttribute("result", details);
	   }
	   else
	   {
		   details = "details saved Successfully!!";
		    }
	   m.addAttribute("result", details);
		return "save.jsp";
	}
	
}
