package sec01.exam01;

public class Parent /* extends Child (순환참조) */{

	String name = "Parent의 name";
	
	String getName() {
		System.out.println("Parent의 getName실행");
		return this.name;
	}

	// ---- 이후 다 놓침
	
//	Parent(){
//		System.out.println("Parent");
//	}
	
	// 놓침
	Parent(int a){
		System.out.println("Parent");
	}
	
}
