package sec01.exam01;

public class Child extends Parent{

	// 놓침
//	Child(){
//		this(2); //생성자 실행, 맨위에적을것.
//	}
//	Child(int a){
//	}
	
	// 상속을 받았을 때의 기본생성자
	Child(){
		super(); // 부모의 생성자, 생략가능
		System.out.println("Child");
	}
	
	void printName() {
		System.out.println("name : " + name);
		System.out.println("this.name : " + this.name);
		String pName = getName();
		System.out.println("pName : " + pName);
	}
	
}
