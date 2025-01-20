package quiz;

import java.util.ArrayList;

// 실제리그 진행
public class Pockemonleauge2 {
	String name; // 먼저 변수 저장공간 생성 // 포켓몬리그이름
	ArrayList list = new ArrayList(); // 리스트 패키지 실행
	Pockemon2[] arrPockemon2 = new Pockemon2[10]; // 배열선언
	
	// 생성자 생성
	Pockemonleauge2(String name){ // 전달인자가 없음 // 타입은 String
		System.out.println(name);
		this.name = name; // 같은 필드접근법 // 저장하기 위해(핗요한 곳에다가 쓸쑤 없음)
	}
	
	void add(Pockemon2 p) { //리턴타입 : pockemon2 전달인자 보유함)
		// this는 무조건 필드를 뜻함.(필드와 메소드를 가져옴), 동일하지 않으면 필드[()], 동일하면 지역변수를 가져옴
		this.list.add(p);
	}
	
	void print() {
		System.out.println("------------");
		System.out.println("리그 이름은 : " + this.name /*13번째줄*/ + "입니다.");
		System.out.println("참가포켓몬 : ");
		for(int i = 0; i<list.size(); i++) { // arraylist는 length를 쓸 수 없다(길이가 없다)
			// 꺼낼때 형변환을 해줘야함(get은 자유로움)
			// get 사용 양식 : 메소드명 변수명 = (타입) list.get(n)
			Pockemon2 p/*16번쩨줄 p랑 다름)*/ = (Pockemon2) /* */list.get(i);
			System.out.println(p); // 주소값
			System.out.println(p.name); // 포켓몬이름
			System.out.println(p.type); // 포켓몬파일
		}
	}
	
	Pockemon2[] getArray() { // arrayList을 만들어줘야함
		return arrPockemon2; // 리턴타입을 배열로 돌려준다.
	}
}
