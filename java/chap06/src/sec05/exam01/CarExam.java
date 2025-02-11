package sec05.exam01;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("아잉");
		Car car2 = new Car("뿌잉");
		
//		놓침
		
//		실패작
//		System.out.println(car1);
//		System.out.println(car2);
		
//		성공작
		car1.printModel();
		car2.printModel();
		
//		또다른해답
		System.out.println(car1.model);
		
	}

}
