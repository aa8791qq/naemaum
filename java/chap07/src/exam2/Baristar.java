package exam2;

public class Baristar extends Employee{
	
	Baristar(int recivesal, String study) {
		super(recivesal, study);
		// TODO Auto-generated constructor stub
	}

	String coffie; //커피 만들기
	String chore; // 장부작성, 설거지

	void custom(String coffie){
		System.out.println(this.coffie + "을 만들고 있습니다.");
	}
	
	@Override
	void st(String study) {
		System.out.println(this.study + "을 공부하고 있습니다.");
	}
	
	void sul(String chore) {
		System.out.println(this.chore + "을 하고 있습니다.");
	}
}
