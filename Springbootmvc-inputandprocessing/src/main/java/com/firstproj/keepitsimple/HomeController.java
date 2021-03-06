package com.firstproj.keepitsimple;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String Home() {
		return "index.jsp";
	}

	/*
	 * first method
	 *  @RequestMapping("/add") 
	 * public String userInputHandlerWithSession(HttpServletRequest request) {
	 * System.out.println("calling the add method"); 
	 * int firstNumber = Integer.parseInt(request.getParameter("number1")); 
	 * int secondNumber = Integer.parseInt(request.getParameter("number2")); 
	 * int sum = firstNumber + secondNumber; // here we are creating the session object and adding the
	 * result into session object so that later the jsp can fetch using exp lang
	 * HttpSession session = request.getSession(); session.setAttribute("sum", sum);
	 * 
	 * return "addnumber.jsp"; }
	 */

	/*
	 * second method
	 * 
	 * @RequestMapping("/add") public String
	 * userInputHandlerWithAnnotation(@RequestParam("number1") int
	 * firstNumber, @RequestParam("number2") int secondNumber, HttpSession session)
	 * { System.out.println("calling the add method");
	 * 
	 * int sum = firstNumber + secondNumber; // here we are creating the session
	 * object and adding the result into session object so that later the jsp can
	 * fetch using exp lang
	 * 
	 * session.setAttribute("sum", sum); return "addnumber.jsp"; }
	 * 
	 * }
	 */
	@RequestMapping("/add")
	public ModelAndView userInputHandlerWithAnnotationWithModelandView(@RequestParam("number1") int firstNumber,
			@RequestParam("number2") int secondNumber) {
		System.out.println("calling the add method");
		int sum = firstNumber + secondNumber;
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("addnumber.jsp");
		modelview.addObject("sum");
		return modelview;

	}
}
