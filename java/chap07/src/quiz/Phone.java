package quiz;

public class Phone {

	boolean power; // 전원관리

	void call(String number) {
		System.out.println(number + " 로 전화거는 중..."); // 전화기능
	}

	void onOff() {
//		if(this.power) {
//			this.power = false;
//		} else {
//			this.power = true;
//		}

		this.power = !this.power;
	}

	void bell() {
		System.out.println("따르릉");
	}

}
