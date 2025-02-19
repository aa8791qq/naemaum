package sec03.exam02;

public abstract class Windows {

	abstract void start(); // 실행정의
	
	void boot() {
		System.out.println("CMOS 셋업");
		System.out.println("윈도우 실행");
		start(); // 정의된 내용이 실행됨
		System.out.println("윈도우 실행 성공, 커서는 로딩으로");
	}
	
}
