package sec02.exam01;

public class Car {
	
	int gas = 5;
	
	//선언과 동시에 초기화
	String model = "현대자동차";
	
	//초기화 하지 않은 경우 (0, false, null로 초기화됨)
	int speed;
	
	//필드 영역에는 실행하면 에러(메소드에 할 수 있음)
	// speed 변수의값을 변경하는 행동(60으로)
//	speed = 60; // 명시적표시를 해야 편리함
	
	void setSpeed(int s) {
		speed = s;
				
	}

}
