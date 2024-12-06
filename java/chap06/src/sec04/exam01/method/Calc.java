package sec04.exam01.method;

public class Calc {

	// 전원, false:꺼짐, true:켜짐
	boolean isOn = false; //공유목적 사용할려면 맨 앞에...
	
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
	 * 더하기 기능
	 * 두 수를 입력받아서 더한 결과를 돌려준다.
	 * 
	 * 메소드명 : plus
	 * 전달인자 : int, int
	 * 리턴타입 : int (두 수의 합)
	 * 
	 * @param : int x, int y
	 * @return : int
	 * @author : aing
	 */
	
	int plus(int x, int y) {
		System.out.println(x);
		System.out.println(y);
		
		int result = x + y;
		
		return result; //String 못옴(타입만 같으면됨(범위내 형변환은 달라도됨)
	}
	
	/**
	 * 나누기기능
	 * 두 수를 받아서 나누기한 결과를 돌려준다.
	 * 
	 * 메소드명 : nanuki
	 * 전달인자 : double
	 * 리턴타입 : double(두 수의 나눈 값)
	 * 
	 * @param : double x, double y
	 * @return : double
	 * @author : aing
	 */
	
	double nanuki(int x, int y) {
		System.out.println(x);
		System.out.println(y);
		
		double nresult = x / y;
		
		return nresult;
	}
}
