package sec04.exam01.method;

public class Calc {

	// 전원, false:꺼짐, true:켜짐
	boolean isOn = false; // 공유목적 사용할려면 맨 앞에...

	// 전원을 켜는 isOn를 true로 바꿔주는 메소드 선언
	void powerOn() {
		isOn = true;
		System.out.println("전원켰지롱~");
	}

	void powerOff() {
		isOn = false;
		System.out.println("전원껏지롱~");
	}

	/**
	 * 더하기 기능 두 수를 입력받아서 더한 결과를 돌려준다.
	 * 
	 * 메소드명 : plus 전달인자 : int, int 리턴타입 : int (두 수의 합)
	 * 
	 * @param : int x, int y
	 * @return : int
	 * @author : aing
	 */

	int plus(int x, int y) {
		System.out.println(x);
		System.out.println(y);

		int result = x + y;

		return result; // String 못옴(타입만 같으면됨(범위내 형변환은 달라도됨)
	}

	/**
	 * 나누기기능 두 수를 받아서 나누기한 결과를 돌려준다.
	 * 
	 * 메소드명 : nanuki 전달인자 : double 리턴타입 : double(두 수의 나눈 값)
	 * 
	 * @param : double x, double y
	 * @return : double
	 * @author : aing
	 */

	double nanuki(int x, int y) {
		System.out.println(x);
		System.out.println(y);

		double nresult = x / (double) y;

		if (y == 0) {
			System.out.println("다시 쓰세요");
		}

		return nresult;
	}

	// 배열을 전달할때 얕은복사에 관하여
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}

	// ... rkqusdlswk
	// 다른데서 호출할때 : sum2( , , , ,)
	// 내부에서 사용할때 value는 배열로 취급)
	int sum2(int ... values) { //string s int ... values 형식만 가능
		int sum = 0;
//		int summ2 = 0
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
}
