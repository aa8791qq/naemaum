package sec05.exam02._static;

public class Calc {

	String color; // static 생략가능
	static double pi = 3.14;
	
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
