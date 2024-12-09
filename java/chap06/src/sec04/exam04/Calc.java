package sec04.exam04;

public class Calc {

	int plus(int x, int y) {
//		int result = x + y;
//		return result;
		return x+y;
	}

	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}

	// 메소드 선언 위치는 전/후 따지지 않아도 된다.
	void execute() {
		double result = avg(7, 10);
		println("평균 : " + result);
	}

	void println(String message) {
		System.out.println("결과는");
		System.out.println(message);
		System.out.println("애교부리기~");
	}

}
