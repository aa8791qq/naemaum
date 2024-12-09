package sec04.exam03.return1;

public class CarExam {

	// main 메소드
	// java가 실행된다는건 JVM에서 수행한다는 이야기
	// java가 자동실행해주는 유일한 메소드
	// void main(String[])
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		Car car = new Car();
		System.out.println(car.speed);
		
		car.setSpeed(300);
		System.out.println(car.speed);

		
	}

}
