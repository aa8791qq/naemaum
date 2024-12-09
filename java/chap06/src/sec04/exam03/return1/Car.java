package sec04.exam03.return1;

public class Car {

	int gas = 5;
	// 필드 (= 맴버변수)
	// 클래스를 생성하는 순간과 함께 생성됨
	// 클래스 소멸 시까지 생존(가비지 컬랙터 동작시 까지)
	// 그 동안 메모리를 차지하면서 계속 저장된 값이 유지
	// 가능하면 지역변수로 먼저 해결하는게 좋음
	// 클래스 자체에 값을 저장하거나 메소드끼리 공유하는 목적으로 사용하거나

	int speed;
	// 값을 선언하지 않은 경우 null, 0, false로 초기화 됩니다.

	void setSpeed(int s) {
		speed = s;
		System.out.println("속도를 " + speed +"로 바꿉니다.");
	}

	// 메소드는 무조건 return을 해야만 한다.(void인 경우 생략 가능)
	void setGas(int g) {
		gas = g;
//	return
	}

	// gas의 값이 0이면 false를 그렇지 않으면 true를 돌려주는 함수
	boolean isLeftgas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // return하는 순간 메소드 종료.
		}
		System.out.println("gas가 있습니다");
		return true;

//		else옆에 if가 올 수 없다.(else가 있는 if의 분기는 무조건 하나의 return을 보장한다.
//		boolean isLeftgas() { 
//			if(gas == 0) {
//				System.out.println("gas가 없습니다.");
//				return false; // return하는 순간 메소드 종료.
//			} else {
//				System.out.println("gas가 있습니다");
//				return true;
//			}
	}

	boolean isLeftgas2() {
		boolean result = false;

		if (gas == 0) {
			System.out.println("gas가 없습니다.");
//			result = false; // return하는 순간 메소드 종료.
		} else {
			System.out.println("gas가 있습니다");
			result = true;
		}

		return result;
	}

	boolean isLeftGas3() {
		return gas != 0;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("주행중.. 잔량 : " + gas);
				setSpeed(gas);
				gas--;
			} else {
				System.out.println("주행종료... 잔량 : " + gas);
				return; // break 대신 사용됨.
			}
		}
//		System.out.println("정차 알고리즘 실행");
	}
}