package quiz;

public class Song {

	//노래 만들기 테이블 양식
	String title;	// 제목
	String singer;	// 가수명
	int clike;		// 좋아요수
	
	/**
	 * 제목을 전달 받아서
	 * title를 변경하는 메소드 만들기
	 * 
	 * 메소드명 : setTitle
	 * @param
	 * @return void
	 * 
	 */
	// 메소드 선언 양식
	// 리턴타입 메스드명 (전달인자들[생략가능]) { }
	
	void setTitle(String t) { //모르겠으면 void를 적고 고민
		title = t; // string t 변수로 타이틀을 받겠다.
//		return; // 값이 있으면 타입을 지정해준다.
	}
	
	// 생성자
	Song(){
		System.out.println("Song 생성자 실행");
		String a /* 변수의미에 불가능하다. */ = "무제";
		setTitle(a);
	}
	
//	void setTitle(String title) {
//		this.title = title;
//		return;
	
	// double 두개를 더하기를 결과를 돌려주는 메소드(plus)를 만드시요
	double plus(double a, double b) {
		double r = a + b;
		System.out.println
		("이 두 수를 자바가 더해보았거든요? \n그 답은 "+ r + "이였네~~ \n나온 숫자 만큼 애교부려주세요~~");
		return r; // 책을 참고 했습니다.
	}
	
	
	
	
	
}
