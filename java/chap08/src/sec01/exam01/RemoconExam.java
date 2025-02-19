package sec01.exam01;

public class RemoconExam {

	public static void main(String[] args) {

		// 놓침
		TV tv = new TV () ;
		powerOn(tv);
	}

	static void powerOn(RemoteControl rc) {
		rc.turnOn();
	}
	
	// 예제
}
