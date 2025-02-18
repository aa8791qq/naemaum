package exam2.copy;

public class CafeExam {
	
	public static void main(String[] args) {
		
		// 복습
		Baristar b = new Baristar();
		Baker c = new Baker();
		
		Welfare w = new Welfare();
		w.pay((Employee) b, 100);
		w.pay((Employee) c, 123);
		
		b.printMoney();
		c.printMoney();
		
		b.study("커피");
		w.learn(b, "coffie"); // 오버라이딩 공부
	}

	
}
