package sec01.exam01;

public class Child extends Parent{

	void printName() {
		System.out.println("name : " + name);
		System.out.println("this.name : " + this.name);
		String pName = getName();
		System.out.println("pName : " + pName);
	}
	
}
