package sec06.exam02.pack2;

import sec06.exam02.pack1.Human1;
//import sec06.exam02.pack3.Human1;(클래스 명 앞에 적는 방법으로)
import sec06.exam02.pack1.Human4;

public class Human3 {

	void test() {
		// 다른 패키지의 클래스를 찾을때
		// 1. 내 패키지에 있는가?
		// 2. java.lang 패키지에 있는가?
		// 3. import한 곳에 있는가?
		
		// import하는 두가지 방법
		// 1. 클래스 명 앞에 패키지 정보 적기		
		sec06.exam02.pack1.Human1 h1 = new sec06.exam02.pack1.Human1(); // 공개형이 아니므로 보이지가 않음(해당되는 생성자에 public을 붙여준다.)
		
		// 2. import 키워드 사용(놓?)
		Human1 h1_1 = new Human1();
//		Human1 h2 = new Human2(); // 클래스가 public이 아니라서 다른 패키지에서 사용불가능
		Human4 h4 = new Human4(); // 기본생성자가 public이라서 사용가능

//		System.out.println(h1.a); // 참조불가능
		
	}
}
