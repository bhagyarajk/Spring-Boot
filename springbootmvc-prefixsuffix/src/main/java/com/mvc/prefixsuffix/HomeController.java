package com.mvc.prefixsuffix;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	String Home() {
		return "index";
	}

	/*
	 * @RequestMapping("/add") ModelAndView add (@RequestParam("number1") int
	 * firstNumber, @RequestParam("number2") int secondNumber) {
	 * 
	 * int sum = firstNumber + secondNumber; ModelAndView modelView = new
	 * ModelAndView("addnumber"); // modelView.setViewName("addnumber");
	 * modelView.addObject("sum", sum); System.out.println("the sum is " + sum);
	 * return modelView;
	 * 
	 * 
	 * }
	 * 
	 * @RequestMapping("/add") String addWithModel (@RequestParam("number1") int
	 * firstNumber, @RequestParam("number2") int secondNumber, Model model) {
	 * 
	 * int sum = firstNumber + secondNumber;
	 * 
	 * model.addAttribute(sum); System.out.println("the sum is " + sum); return
	 * "sum"; 
	 * }
	 * 
	 */

	@RequestMapping("/add")
	String addWithModelMap(@RequestParam("number1") int firstNumber, @RequestParam("number2") int secondNumber,
			ModelMap modelMap) {

		int sum = firstNumber + secondNumber;

		modelMap.addAttribute("sum", sum);
		System.out.println("the sum is " + sum);
		return "addnumber";
	}

}
