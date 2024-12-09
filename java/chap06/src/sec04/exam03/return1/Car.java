package sec04.exam03.return1;

public class Car {
	
	int gas = 5;
	//필드 (= 맴버변수)
	// 클래스를 생성하는 순간과 함께 생성됨
	// 클래스 소멸 시까지 생존(가비지 컬랙터 동작시 까지)
	// 그 동안 메모리를 차지하면서 계속 저장된 값이 유지
	// 가능하면 지역변수로 먼저 해결하는게 좋음
	// 클래스 자체에 값을 저장하거나 메소드끼리 공유하는 목적으로 사용하거나
	
	int speed;
	// 값을 선언하지 않은 경우 null, 0, false로 초기화 됩니다.
	
	void setSpeed(int s) {
		speed = s;
	}
}
