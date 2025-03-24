package kr.or.human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	MemberController(){
		System.out.println("생성자");
	}

	@RequestMapping("/member")
	void listMember() {
		System.out.println("list 맴버 실행");
	}
	
	
}
