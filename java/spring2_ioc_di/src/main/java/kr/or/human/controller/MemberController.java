package kr.or.human.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human.service.MemberServiceImpl;
import kr.or.human.service.MemberService;

@Controller
public class MemberController {
	
	MemberController(){
		System.out.println("생성자");
	}

	@RequestMapping("/member")
	void listMember() {
		System.out.println("list 맴버 실행");
		
		MemberService memberService = new MemberServiceImpl();
		List memberList = memberService.getList();
		
		System.out.println(memberList);
	}
	
	
	
	
}
