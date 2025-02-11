package sec05.exam02._static;

public class Calc {

	String color; // static 생략가능
//	static double pi = 3.14;
	static double pi; // 0으로 초기화
//	this() 먼저 나와있어야 함
	
	static {
		pi = 3.141592; //?
//		color 못씀
	}
	
	Calc(){
		pi=3.141592; //메모리에 올라가있어서 new 실행되는 순간 이값으로 적용됨.
	}
	
	// 놓침
	Calc(double pi){
//		this.pi = pi; //메모리에 올라가있어서 new 실행되는 순간 이값으로 적용됨.
		Calc.pi = pi;
	}
	
	static Print out = new Print();
	
	// 놓침
	static void printPi() {
//		System.out.println("pi:"+ this.pi); // 인스턴스
		System.out.println("pi:"+ pi);
	}
	
//	static void printColor() {
////		System.out.println("color:" + this.color);
////		System.out.println("color:" + color); // 생성을 안해서 못씀
//	}
	
	void printPi2() {
//		System.out.println("pi:"+ this.pi); // 인스턴스
		System.out.println("pi2:"+ pi);
	}
}
