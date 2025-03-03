package sec01.exam03.override;

public class Computer extends Calc {

	@Override // override 실행 여부 확인(부모에 해당 메소드가 동일하게 존재하는지) // 주석처리해도 같은값!
	int plus(int a, int b) {
//		int result = a+b;
//		int result = plus(a, b); // 순환함수문제
		int result = super.plus(a, b); // 순환함수 해결법
		System.out.println("문의하신 정답은 ");
		System.out.println(a+b +"입니다");
		return a+b;
	}
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer의 areaCircle 실행");
		return Math.PI * r * r;
	}
	
}
