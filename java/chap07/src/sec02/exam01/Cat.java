package sec02.exam01;

public class Cat extends Animal{
	
	@Override
	void sound() {
		System.out.print("미야옹~~~~~~~~");
		System.out.println("캬~~~~~~~~");
	}
	
	@Override
	void eat() {
		System.out.println("츄루룹");
	}
	
	void push() {
		System.out.println("꾹꾹이 합니다.");
	}

}
