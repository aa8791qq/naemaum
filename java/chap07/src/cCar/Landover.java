package cCar;

public class Landover extends Car{

	@Override
	protected void drive() {
		System.out.println("1차를 운전합니다.");
	}
	
	void autoRun() {
		System.out.println("자율주행을 시작합니다.");
	}
	
}
