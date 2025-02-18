package exam2.copy;

public class Baker extends Employee {
	
	void printMoney() {
		System.out.println("제빵사 잔액" +this.money);
	}

	@Override
	void study(String theme) {
		
	}
	
	// 오버로딩인데 baker에만 있다.
//	String study(String b, int c) {
//		System.out.println();
//		return null;
//	}
}
