package cCar;

public class DriverExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coupe c = new Coupe();
		
		Driver d = new Driver();
		d.run(c);
		
		Landover l = new Landover();
		d.run(l); // 부모님한테 상속을 받았으니
		
		Car c1 = new Car();
		Landover land = (Landover) c1;
		
		Hcar h = new Hcar(); // 형변환이 안됨
		d.run(h);
	}

}
