package exam2.copy;

public class Employee {

	int money;
	
	void service() {
		System.out.println("손님접대");
	}
	
	void study(String theme) {
		System.out.println(theme + "공부하기");
	}
	
	void sal(int money) {
		System.out.printf("월급 %d원을 받았다!!\n", money);
		this.money += money;
	}

}
