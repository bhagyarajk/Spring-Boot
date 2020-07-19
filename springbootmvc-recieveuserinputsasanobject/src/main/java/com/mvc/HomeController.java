package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	String homePage() {
		System.out.println("homepage called");
		return "index.jsp";
	}
	
	/* here we are following the conventional method of getting the user inputs as the parameters and later performing the operations on the 
	 * student object so this is not the moto of this project in this project we want to expect the user inputs as the already processed object
	 * 
	@RequestMapping("/studentinfo")
	String studentInfo(@RequestParam("student_id") int id, @RequestParam("student_name") String name, Model model) {

		Student student = new Student();
		student.setId(id);
		student.setName(name);

		// ModelAndView modelView = new ModelAndView("studentinfo.jsp");
		model.addAttribute("student", student);
		System.out.println(student);
		System.out.println("student info called");
		return "studentinfo.jsp";

	}
	*/
	/* you can observe the previous method there we used the setId method but if you now check I have intentionally changed the variables names as
	 student_id , student_name --> there is a reason behind this one the reason is in the bellow code the annotation @ModelAttribute is resposible for 
	 recieving the parameters and initializing the objects but the spring is not that smartd it will try to find out the set method where the name is as 
	 same as the user input parameters ie. in our case you can check index.jsp file there you can observe the names of the inputs are student_id, student_name
	 so keeping it simple always maintain the same variable naming everywhere irrespective of front or backend file or java file for same variable same name every where
	 */
	
	@RequestMapping("/studentinfo")
	String studentInfoWithModelAttribute(@ModelAttribute ("student") Student student) {


		
		return "studentinfo.jsp";

	}
	
/*  if you want anything to execute before request mapping methods then you will write it in the method with @ModelAttribute becoz of this 
	no matter how many methods that will call studentinfo.jsp before them method generalizedData will execute so value for something is available everywhere.
	*/
	@ModelAttribute
	String generalizedData(Model model) {
		model.addAttribute("something", "something....");
		return "studentinfo.jsp";
		
		
	}
	
	
}
	
	
	


