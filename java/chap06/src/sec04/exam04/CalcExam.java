package sec04.exam04;

public class CalcExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc myCalc = new Calc();
		myCalc.execute();
		
		//메소드의 리터을 사용여부와 관련없음(사용자 마음)
		myCalc.plus(1, 2); //다음줄이 되면 결과값은 사라진다.
		myCalc.plus(10.5, 20.3);
		
		int a = 10;
		double b = 20.3;
		myCalc.plus(a, b);
		
		// 다시선 시작점----------------->설명다시~
		System.out.println("문자");
		System.out.println(1);
		System.out.println(1.5);
	}

}
