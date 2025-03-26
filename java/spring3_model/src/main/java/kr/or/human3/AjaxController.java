package kr.or.human3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@RequestMapping("ajax.do")
	public String ajax() {
		return "ajax"; //view리졸버로 가는..
	}
	
	@RequestMapping("/ajax1")
	public String ajax1(
//			@RequestParam("id") 
			//req param 생략
			// json으로 보낸건 @requestParam이나 request.getParameter로 받을 수 없다.
			@RequestBody
			MemberDTO dto
//			,
//			@RequestBody
//			String id
			) { 
		System.out.println(dto.getId());
		
		return "ajax";
	}
		
		@RequestMapping("/ajax2")
		@ResponseBody
		public String ajax2(
				@RequestBody
				MemberDTO dto
				) { 
			System.out.println(dto.getId());
			
			return "ajax";
	}
		
		@RequestMapping("/ajax3")
		@ResponseBody
		public MemberDTO ajax3(
				@RequestBody
				MemberDTO dto
				) { 
			System.out.println(dto.getId());
			
			return dto;
		}
		
		@RequestMapping("/ajax4")
		@ResponseBody
		public List ajax4(
				@RequestBody
				MemberDTO dto
				) { 
			System.out.println(dto.getId());
			
			List ls = new ArrayList();
			ls.add(dto);
			ls.add(dto);
			ls.add(dto);
			
			return ls;
		}
	
}
