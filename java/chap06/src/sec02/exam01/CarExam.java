package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();
		String m = myCar.model;
		System.out.println(m);
		
		System.out.println("----------------");
		
		Car myCar2 = new Car();
		myCar2.model = "페라리";
		System.out.println(myCar.model);
		System.out.println(myCar2.model);
		
		System.out.println("------------------");
		System.out.println(myCar.speed);
		
		System.out.println("------------------");
		System.out.println(myCar);
		
	}

}
