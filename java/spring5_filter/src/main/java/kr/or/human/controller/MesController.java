package kr.or.human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MesController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginCheck")
	public String loginCheck() {
		
		//성공시 main 실패시 login 이동
		
		return "login";
	}
	
	@RequestMapping("/main")
	public String main() {
		//로그인 한 사람만 보기
		//안한 사람은 login 이동
		
		return "main";
	}
	
}
