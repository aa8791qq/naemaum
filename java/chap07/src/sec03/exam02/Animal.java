package sec03.exam02;

public abstract class Animal {

	String kind;
	
	void breathe() {
		System.out.println("숨숴 숨숴");
	}
	
	// 추상메소드
	// 나는 구현하지 않음
	// 대신에 나는 상속받은 자식이 꼭 구현해야 한다.
	abstract void sound(); // 실행블럭({}) : 오류
}
