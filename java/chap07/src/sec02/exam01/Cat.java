package sec02.exam01;

public class Cat extends Animal{
	
//	int age; // animal을 가리는것에 불과(오버쉐도우현상)
	int age = 9;
	
	@Override
	void sound() {
		System.out.println("미야옹~~~~~~~~");
		System.out.println("캬~~~~~~~~");

		// 놓침
		int age = 10;
//		this.age
//		super.age
	}
	
	@Override
	void eat() {
		System.out.println("츄루룹");
	}
	
	void push() {
		System.out.println("꾹꾹이 합니다.");
	}

	void setAge(int age){
		super.age = age;
	}
}
