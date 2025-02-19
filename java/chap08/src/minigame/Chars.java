package minigame;

public abstract class Chars { //abstract 메소드 0
	
	String gamejob;
	int value;
	
//	String char1 = "전사";
//	String char2 = "마법사";
//	String char3 = "사제";
//	String char4 = "성전사";

	void attack(String gamejob, int value) {
		System.out.println(gamejob+ "이 " + value + "만큼 공격을 가했습니다.");
	}
	
	void care(String gamejob, int value) {
		System.out.println(gamejob+ "이 " + value + "만큼 치료를 했습니다.");
	}
	
	void defence(String gamejob, int value) {
		System.out.println(gamejob+ "이 " + value + "만큼 방어를 했습니다.");
	}
}
