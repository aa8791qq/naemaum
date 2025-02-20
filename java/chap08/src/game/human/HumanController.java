package game.human;

public class HumanController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id = "adin";
		String pw = "1234";
		
		HumanDTO dto = new HumanDTO();
		dto.setId(id);
		dto.setPw(pw);
				
		// 놓침
		HumanService service = new HumanServiceImpl();
		dto = service.getMember(dto);
		
		if(dto != null) {
			System.out.println("로그인성공");
			System.out.println("안녕하세요!" + dto.getName() + "님");
			System.out.println("메인페이지 이동");
		} else { // << 
			System.out.println("로그인실패");
			System.out.println("아이디와 비밀번호 확인해주세요");
		}

	}

}
