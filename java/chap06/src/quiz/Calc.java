package quiz;

public class Calc {

	// + - * / %
	// 각각 메소드 만들기

	/**
	 * compute
	 * 
	 * @param
	 * @return
	 */

	double n1; // n1룰 추출한다.
	double n2; // n2를 추출한다.

	double sresult; // n1, n2 값을 합한다.
	double mresult; // n1, n2 값을 차감한다.
	double kresult; // n1, n2 값을 곱한다.
	double n1result; // n1, n2 값을 나눈다.
	double n2result; // n1, n2 값의 나머지를 구한다.

	// 덧셈을 실행하는 코드
	void Calc1(double result) {
		System.out.println("덧셈을 실행합니다.");
		double sresult = n1 + n2;
		result=this.sresult;
		System.out.println("결과 : " + (n1 + n2));
	}

	// 뺄셈을 실행하는 코드
	void Calc2(double result) {
		System.out.println("뺄셈을 실행합니다.");
		double mresult = (n1 - n2);
		result = this.mresult;
		System.out.println("결과 : " + (n1 - n2));
	}

	// 곱셈을 실행하는 코드
	void Calc3(double result) {
		System.out.println("곱셈을 실행합니다.");
		double kresult = n1 * n2;
		result = this.kresult;
		System.out.println("결과 : " + (n1 * n2));
	}

	// 나눗셈을 실행하는 코드
	void Calc4(double result) {
		System.out.println("나눗셈을 실행합니다.");
		double n1result = n1 / n2;
		result =this.n1result ;
		System.out.println("결과 : " + (n1 / n2));
	}

	// 나머지를 구하는 코드
	void Calc5(double result) {
		System.out.println("나머지를 구합니다.");
		double n2result = n1 % n2;
		result = this.n2result;
		System.out.println("결과 : " + (n1 % n2));
	}

	// calc.compute로 어떻게 바꾸나....
	void printMenu() {
		double result = this.compute(n1, n2);
	}

}
