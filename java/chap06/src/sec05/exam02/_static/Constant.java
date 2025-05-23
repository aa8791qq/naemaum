package sec05.exam02._static;

public class Constant {

	int a = 0;

	static final int LOGIN_SUCCESS = 1; // 로그인 성공
	static final int LOGIN_FAIL = 2; // 로그인 실패
	static final int LOGIN_PW_90 = 3; // 비밀번호 변경주기 추가
	static final int LOGIN_TEMP_PW = 4; // 임시 비밀번호 발급 상태

}

class ConstExam {
	public static void main(String[] args) {
		int result = loginCheck("root", "abcd");
		
		if(result == Constant.LOGIN_SUCCESS) {
			System.out.println("로그인 성공! >> 메인페이지로 이동");
		} else if(result == Constant.LOGIN_FAIL) {
			System.out.println("로그인 실패");
		}
	}
	
	static int loginCheck(String id, String pw) {
		
		final int c = 10; // 가능함
		
		if("admin".equals(id) && "1234".equals(pw)) {
			return Constant.LOGIN_SUCCESS;
		} else {
			return Constant.LOGIN_FAIL;
		}
	}
}