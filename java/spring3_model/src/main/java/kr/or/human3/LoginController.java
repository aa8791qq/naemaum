package kr.or.human3;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	// 로그인 페이지 표시 목적
	@RequestMapping("/login.do")
	public ModelAndView loginForm() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		// /webapp/web-inf/view/login.jsp
		// --> login (servlet-context 설정값을 불러옴)

		return mav;
	}

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req) {// 꼭 req에 담을 필요가 없음
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("result");

		ModelAndView mav = new ModelAndView("result");
		// 전달인자를 넣으면 필요한 정보를 다 넣어줌(모든정보)
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		System.out.println(req.getParameter("id"));
		System.out.println(req.getParameter("pw"));

		req.setAttribute("id1", id);
		req.setAttribute("pw1", pw);

		mav.addObject("id2", id);
		mav.addObject("pw2", pw);

		MemberDTO mDTO = new MemberDTO();

		mDTO.setId(id);
		mav.addObject("dto", mDTO);

		return mav;
	}

	@RequestMapping("/login2") // 전달인자를 다봄
	public ModelAndView login2(
			// String id = req.getParameter("id");
			// @RequestParam("id")
			// 필수값(없다면 400 Bad Request) ==> 기본값 : required = true
			@RequestParam(value = "id", required = false) String id,

			// parameter의 key와 변수명이 같다면 @RequestParam 생략가능
			// @RequestParam 생략하면 @RequestParam(value="id", required = false) 생략가능
//			@RequestParam(value="pw", required = false)
			String pw,
//			, String a ==> null, int b ==> null이 아니여서 500오류

			@RequestParam Map map) {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
		System.out.println("map id : " + map.get("id"));
		ModelAndView mav = new ModelAndView("result");
		return mav;
	}

	@RequestMapping("/login3")
	public ModelAndView login3(
		// DTO에 알아서 넣어줌(파라메터에서 꺼내서)
		@ModelAttribute MemberDTO dto1,

		// dto를 자동으로 채우고 모델에 넣어주기 까지 채워줌
		// model에 mav.addObject("dto22", dto2) 생략가능
		@ModelAttribute("dto22") MemberDTO dto2,

		// DTO 타입의 앞글자만 소문자로 변경한 key로 모델에 넣어준다.
		// @ModelAttribute("memberDTO")
		MemberDTO dto3) {
			System.out.println("dto1 : " + dto1);
	
			ModelAndView mav = new ModelAndView("result");
	
			mav.addObject("dto11", dto1);
	
			return mav;

	}
}
