package exam1;

public class Phone {

	String number;
	String keyword;
	
	Phone(String number){
		// 기본생성자
		this.number = number; // exam 생성자에서 받은 값
	}
	
	void calling(String number) { // p.calling 값
		System.out.println(this.number + "에서 ");
		System.out.println(number + "로 전화를 겁니당");
	}
	
	void callback(String number) {
		System.out.println("따르릉");
		System.out.println(number + "의 전화를 받았습니다.");
	}
}
