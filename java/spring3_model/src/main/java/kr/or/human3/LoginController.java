package kr.or.human3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
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
		//  --> login (servlet-context 설정값을 불러옴)
		
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
	
	@RequestMapping("/login2")
	public ModelAndView login2(
			//String id = req.getParameter("id");
			@RequestParam("id")
			String id	
	) {
		System.out.println("아이디 : " + id);
		ModelAndView mav = new ModelAndView("result");
		return mav;
	}
	
	
}
