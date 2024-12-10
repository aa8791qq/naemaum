package sec03.exam01;

public class Car {

	// 생성자  ---> 약간 못들음..
	// 기본생성자
	
	String brand = "아반떼";
	String color = null;
	int cc = 0;
//	color= "횐색"
//	System.out.println
	
	// 클래스를 new로 생성할때
	// 1. 필드가 먼저 선언된다.
	// 2. 생성자가 실행된다.
//	public Car() {	// public 생략가능
					// 하나라도 생성자를 코딩하면 기본 생성자는 만들어지지 않는다.
//	} // 오버로딩
	
	Car(int c) {
		cc = c;
		color= "횐색"; // 선언과 동시에 초기화를 1번 할 수 있다.(재할당 불가능)
			System.out.println("Car(int) 생성");
		test();
	}
	
	Car(String b){
		brand = b;
		System.out.println(brand);				
	}
	
	Car(){
		this("아빈떼", "흰색", 1300);
		System.out.println("아무것도 없지롱~");
		}
	
	Car(String b, String c, int cc2){
//		다른 생성자 호출하는 방법
//		Car() 호출
//		무조건 첫번째 줄에서 호출해야 한다.
//		this();
		
		brand = b;
		color = c ;
		cc = cc2;
		System.out.println(brand + "," + color + "," + cc);
		
//		Car() 호출
//		this();
	}
	
	void test() {
		System.out.println("test() 실행");
//		Car(); 메소드
	}
	
}
