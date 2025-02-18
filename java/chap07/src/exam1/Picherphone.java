package exam1;

public class Picherphone extends Phone{
	
	Picherphone(String number) {
		super(number);
	}
	
	void sendmessege(String number) {
		System.out.println(this.number + "에서 ");
		System.out.println(number + "로 문자를 보냅니다.");
	}
}
