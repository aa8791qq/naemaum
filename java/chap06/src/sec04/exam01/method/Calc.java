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
	
}
