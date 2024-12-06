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

	}

}
