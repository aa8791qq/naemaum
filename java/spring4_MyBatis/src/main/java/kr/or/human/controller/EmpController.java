package kr.or.human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {

	@RequestMapping(value ="/emp", method=RequestMethod.GET) 
	public String listEmp() {
		System.out.println("들어왔어");
		
		return "emp";
	}
	
}
