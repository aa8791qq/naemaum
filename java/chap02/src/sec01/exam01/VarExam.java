package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 한줄주석
		/* 범위주석(여러줄가능)
		 */

		// 이클립스 단축키
		/*
		 * 한줄 지우기	: Ctrl + D
		 * 한줄 복사	: Ctrl + Alt +위 또는 아래 방향키 
		 * 한줄 이동	: Alt + 위 또는 아래 방향키
		 * 코드 정렬	: Ctrl + Shift + F
		 * 주석 단축키	: Ctrl + /
		 */
		
		System.out.println("hello World 한글");
		
		// 변수선언
		int value = 20;
		// int(변수이름)을 value로 선언한다. 문제점
		// int(변수이름)을 value로 선언하면서 20으로 초기값을 넣는다. 해결법1
		// int(변수이름)을 value로 선언하고 다음 줄에 20으로 초기값을 넣는다. 해결법2
		// 주의 : 중괄호안에는 변수이름을 중복선언하지 못한다.
		
		// 변수 value 값을 읽고 10을 더하는 연산 수행
		// 연산수행 결과값을 변수 result의 초기값으로 지정
		// 등호를 기준으로 오른쪽부터 진행된다.
		int result = value + 10; // result 값을 value에다가 10을 더해준다.
		
		// 변수 result 값을 읽고 출력
		System.out.println(result);
		System.out.println(result);
		
		// 변수를 중간에 500으로 변경해봄 (int으로 중복선언 금지)
		result = 500;
		// result 값을 바꿔도 저장되어 있기 때문에 value 값은 바뀌지 않는다.
		System.out.println(result); // 500으로 출력됨
		
		// 실행결과
		// 1차실행은 value 값을 지정하지 않았으므로 에러뜸
		// 2차실행은 value 값을 20으로 지정하여 해결했음(결과 출력 완료)
	}

}
