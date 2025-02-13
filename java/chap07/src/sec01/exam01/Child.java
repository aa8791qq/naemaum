package sec01.exam01;

public class Child extends Parent{

	// 놓침
//	Child(){
//		this(2); //생성자 실행, 맨위에적을것.
//	}
//	Child(int a){
//	}
	
	// 상속을 받았을 때의 기본생성자 // 놓침
	Child(){
//		this(2); // super()와 this()는 모두 첫줄에 적어야 하므로 같이 사용할 수 없다.
//		super(); // 부모의 생성자, 생략가능(자동생성)
		super(1); // 부모의 생성자도 전달인자를 맞춰줘야 한다(생략불가)
		System.out.println("Child");
	}
	
	Child(int a){
		super(1);
	}
	
	void printName() {
		System.out.println("name : " + name);
		System.out.println("this.name : " + this.name);
		String pName = getName();
		System.out.println("pName : " + pName);
	}
	
	// 놓침
	// 쉐도우(전달인자가 필드를 가리는 현상) 주의
	void setName(String name) {
		this.name = name; // this를 안쓰면 지역변수(중괄호가 끝나면 최적화작업) // this를 쓰면 필드임 		////를 덮어쓰게됨
	}
	
	// 놓침
	int age;
	// 부모의 필드를 가리는 현상(overshadow)
	String name = "child의 name"; // 덮어쓰기됨
	
	String parentName() {
		String name = null; // 지역변수
		String cname = this.name; // 내 필드
		String pname = super.name; // 부모 필드
		
		return super.name; // 부모값을 불러옴
	}
	
	Child(String name){
		super(name);
//		super.name = name; // 실무에는 private로 막혀있음
	}
}
