package com.keepitsimple.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	@RequestMapping("/")
	String homepage() {
		System.out.println("the home page method called");
		return "index";
	}
	
	@RequestMapping("/studentinfo")
	String studentInfo(@ModelAttribute ("student") Student student) {
		System.out.println("studentinfo called");
		return "studentinfo";
	}

}
