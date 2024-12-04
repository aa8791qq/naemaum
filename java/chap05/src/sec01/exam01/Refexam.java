package sec01.exam01;

public class Refexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10 ;
		int b = a ;
		System.out.println(a + ", " + b);
		b = 12;
		System.out.println(a + ", " + b);
		
		String c = "아이브";
		// = 을 기준으로 오른쪽이 먼저 실행된다.
		// "아이브"를 힙 영역의 비어있는 곳(번지)에 할당
		// 스택 영역의 변수c에 그 번지가 기록됨.
		System.out.println("c : "+ c);
		
		System.out.println(a == b);
		// == 무조건 stack의 값을 비교한다.
		
		// 무조건 힙영역의 새로운 번지에 할당하는 방법
		String d = new String("아이브");
		System.out.println(d);
		System.out.println(c == d);
		// == 무조건 stack의 값을 비교한다.
		System.out.println(c.equals(d));
		// string 값의 비교는 equals()를 사용한다.
		
		//같은 주소에 참조하게 만들어줌
		String e = "아이브";
		System.out.println(c == e);
		
		// a = null; 기본타입은 null을 넣을 수 없다.
		
		//null은 참조하는 주소가 없는 상태
		String f = "휴먼";
		System.out.println("f == null :" + (f == null));
		System.out.println("f != null :" + (f != null));
		
		f = null; // f= ""와 다르다(번지 새로부여)
		System.out.println("f == null :" + (f == null));
		System.out.println("f != null :" + (f != null));
	}

}
