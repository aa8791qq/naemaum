package exam2.copy;

public class Baristar extends Employee{
	
	String makeCoffie(String menu) {
		System.out.println(menu + " 만드는 중");
		return menu;
	}
	
	void wash() {
		System.out.println("설거지");
	}
	
	void printMoney() {
		System.out.println("바리스타 잔액" + this.money);
	}
}
