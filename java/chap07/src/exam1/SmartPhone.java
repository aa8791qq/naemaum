package exam1;

public class SmartPhone extends Picherphone{
	
	SmartPhone(String keyword){
		super(keyword);
	}
	
	void searchinternet(String keyword){
		System.out.println(keyword + "을 검색합니다.");
	}
}
