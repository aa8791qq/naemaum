package sec05.exam02._static;

public class CalcExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//놓침?
		System.out.println(Calc.pi); // 효율적인 사용방법
		
		Calc c = new Calc();
		c.color = "pink";
		System.out.println(c.pi); // 돌아가는 되는 꼴
		
		Calc c2 = new Calc();
		c2.color = "skyblue";
		System.out.println(c2.pi);
		
		Calc.pi = 2;
		
		System.out.println(c.pi); // 돌아가는 되는 꼴
		System.out.println(c2.pi);

		// 놓침
		Calc.printPi();
		c.printPi2(); // 미리 생성되었으므로 쓸 수 있다.
		Calc.out.println("글씨");
		
//		test(); // 선발대에서는 못쓴다.(static으로 바꾸기)
		CalcExam ce = new CalcExam(); // 클래스를 해당되는 부분에 새로 생성한다.(37번째줄 이어서)
		ce.test();
//		ce.main(new String[] {"abc"});
		
//		CalcExam.main(null); // 가능
	}
	
//	static void test() { //?
	void test() {
		
	}

}
