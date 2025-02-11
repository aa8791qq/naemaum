package sec05.exam01;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model; // 필드 메소드
//		printModel();
//		this.printModel(); 메소드 안에 메소드를 쓰지 못함
	}
	
//	메소드 명 : printModel
//	전달인자 : 없음
//	리턴타입 : 없음
//	필드의 model을 출력
	
	void printModel(/* 전달인자 */) {
//		int a = 8; /* 잠깐 생겼다 사라짐, 밖에서 접근 불가 */
		System.out.println(this.model);
	}
}
