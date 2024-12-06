package sec04.exam01.method;

public class CalcExam {

	//전달인자 선언이 괄호
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc calc = new Calc();
		
		calc.powerOn(); //실행의 괄호
		System.out.println(calc.isOn);
		
		calc.powerOff();
		System.out.println(calc.isOn);
		
		// 자기자신을 실행(선언)시킬 수 있다.
		
		
		int a = calc.plus(7, 10);
		
		System.out.println(a);
		
		System.out.println("----------------");
		
		int d = 10;
		double e = 4;
		double c = 	(calc.nanuki(d, (double)e));
		
		System.out.println(c);
		
		

	}

}
