package sec03.exam02;

public abstract class Animal { // abstract가 없으면 안됨
	
	Animal(){} // 기본생성자
	
	Animal(String name){
		// 일정타입으로 변수를 전달받는 생성자 삽입가능
	}

	String kind;
	
	void breathe() {
		System.out.println("숨숴 숨숴");
	}
	
	// 추상메소드
	// 나는 구현하지 않음
	// 대신에 나는 상속받은 자식이 꼭 구현해야 한다.
	// 실행블럭({}) : 오류 , private 공존불가
	abstract void sound();
}
