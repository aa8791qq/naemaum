package sec03.exam02;

public class Dog extends Animal{

//	Dog(String name) {
//		super(name);
//	}

	Dog(){
		super(null);
	}
	
	@Override
	void sound() {
		System.out.println("멍멍멍멍");
	}
	
	

}
