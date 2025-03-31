package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.human.dto.EmpDTO;
import kr.or.human.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;

	@RequestMapping(value ="/emp", method = RequestMethod.GET) 
	public String listEmp() {
		System.out.println("들어왔어");
		List<EmpDTO> ls = empService.getEmpList();
		System.out.println("ls.s : " + ls.size());
		return "emp";
	}
	
//	놓침
//	@RequestMapping(value ="/emp1", method = RequestMethod.GET) 
//	public String Emp1() {
//		System.out.println("들어왔어");
//		EmpDTO a = empService.getEmp1();
//		System.out.println("a : " + a);
//		return "emp";
//	}
	
	@RequestMapping(value ="/emp2", method = RequestMethod.GET) 
	public String EmpAsk() {
		System.out.println("들어왔어");
		EmpDTO c = empService.getEmpnoAsk();
		System.out.println("c : " + c);
		return "emp";
	}
	
	@RequestMapping(value ="/emp5", method = RequestMethod.PUT) 
	public String modifyEmp(Model model) {
		System.out.println("들어왔어");
		// 실제 update 장소
		
	}
}
