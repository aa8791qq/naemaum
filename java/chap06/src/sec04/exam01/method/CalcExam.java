package sec04.exam01.method;

public class CalcExam {

	// 전달인자 선언이 괄호
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc = new Calc();

		calc.powerOn(); // 실행의 괄호
		System.out.println(calc.isOn);

		calc.powerOff();
		System.out.println(calc.isOn);

		// 자기자신을 실행(선언)시킬 수 있다.

		int a = calc.plus(7, 10);

		System.out.println(a);

		System.out.println("----------------");

		int d = 10;
		int e = 4;
		double c = (calc.nanuki(d, e));

		System.out.println(c);

		Calc[] f = new Calc[10];
		f[0] = new Calc();

//		Calc[] h = new Calc[2];
//		h[0] = new Calc() {

		Calc[] h = { new Calc(), new Calc() };

		boolean f0 = f[0].isOn; // 괄호 왜 없는지..

		System.out.println("----------------");

		int[] g = { 1, 2, 3, 4, 5 };
		int f1 = calc.sum1(g);
		System.out.println(f1);
		
		int f2 = calc.sum2(g);
		int f3 = calc.sum2(1,2,3,4,5);
		System.out.println(f2);
		System.out.println(f3);
	}

}
