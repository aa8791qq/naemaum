package exam1;

public class Picherphone extends Phone{
	
	Picherphone(String number) {
		super(number);
	}
	
	void sendmessege(String number, String text) {
		System.out.println(this.number + "에서 ");
		System.out.println(number + "로 " + text + "라는 메시지를 보냅니다.");
	}
}
