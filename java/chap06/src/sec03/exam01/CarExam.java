package sec03.exam01;

public class CarExam { // 복습

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car(1300); //새로 생성하자마자 실행할 수 있는 것!
		Car c2 = new Car("소나타 dn8"); //새로 생성하자마자 실행할 수 있는 것!
		Car c3 = new Car();
//		c3.brand = "스파크";
		c3.setBrand(null);
		
	}

}
