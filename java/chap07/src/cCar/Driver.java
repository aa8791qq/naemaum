package cCar;

public class Driver {
	
	void run(Car car) {
		System.out.println("런 할거야");
		car.drive();
//		car.autoRun();
		
		// 놓침
		if(car instanceof Landover) {
			System.out.println("이거 랜드오버네요");
		// 부모변수 instanceof 자식클래스
			Landover c = (Landover) car;
			c.autoRun();
		}
	}

}
