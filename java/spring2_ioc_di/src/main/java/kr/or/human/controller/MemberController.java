package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human.service.MemberService;
import kr.or.human.service.MemberServiceImpl;

@Controller
public class MemberController {
	MemberController(){
		System.out.println("생성자");
	}

	// 우선순위
	// 1. 완전히 동일한 클래스
	// 2. 자동 형 변환이 가능한 클래스
	
	// IOC
		// Inversion of Control
		// 제어의 역전
		// 타입에 맞는 클래스를 찾아서 대신 생성 해줌(정확히 동일한 클래스, 자동 형변환 되는 클래스)
		// 없으면 없다고 오류가 나옴
		// 중복이 있으면 중복오류가 나옴
		
		// DI
		// Dependency Injection
		// 의존성 주입
		// IoC로 생성한 클래스를 변수에 넣어준다.
		
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/member")
	String listMember() { //?
		System.out.println("list 맴버 실행");
		
//		MemberService memberService = new MemberServiceImpl();
		List memberList = memberService.getList();
		
		System.out.println(memberList);
		
		return "home";
	}
	
	
	
	
}
