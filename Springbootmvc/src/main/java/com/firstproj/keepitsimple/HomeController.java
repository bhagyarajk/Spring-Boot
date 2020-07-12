package com.firstproj.keepitsimple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 
	@RequestMapping("/")
	String welcome() {
		System.out.println("Welcome method called");
		return "index.jsp";
		}
	
}
