package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController 
{
	@RequestMapping("/")
	public String jspPage(Model model){
		model.addAttribute("name","hello springBoot1234");
		return "hello";
	}
}
