package sec05.exam05._final;

public class Person {

	final String nation = "Korea";
	final String ssn;
	
//	(놓침!)
	final static double pi = 3.14; // 불변, 새로 생성가능함
	
	Person(){ // 자동호출
		this.ssn = "300256-5952145";
	}
	
//	 호출방법이 없어서 안됨(위에 적혀있지 않음, 사용자가 호출)
//	void test() {
//		this.ssn = "300256-5952111"; // 값을 못바꿈(final로 값을 선언을 했기 때문에)
//	}
	
}
