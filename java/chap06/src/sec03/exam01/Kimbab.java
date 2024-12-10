package sec03.exam01;

import java.util.ArrayList;

public class Kimbab {

/**
 * 김밥천국 관리 클래스
 * 2024.12.10 생성
 * by 다이브
 */
	String name;	// 지점명
	String address;	// 주소
	
//	String[] menu;	// 김밥천국 메뉴들
//	int[] price;	// 메뉴와 순서를 마춰 관리하는 가격

	ArrayList menu;		// 김밥천국 메뉴들
	ArrayList price;	// 메뉴와 순서를 마춰 관리하는 가격
	
	int seedMoney; 	// 권리금
	
	Kimbab(int seedMoney){
		System.out.println("생성자 실행");
		this.seedMoney = seedMoney;
		
		this.menu = new ArrayList();
		this.price = new ArrayList();
		
		this.menu.add("야채");
//		for(int i = 0; i < this.menu.size(); i++)
//		System.out.println(this.menu.get(0)); 순서대로 관리
		this.price.add(3500);
		
		this.menu.add("라면");
		this.price.add(4000);
	}
	
	/**
	 * 김밥싸기
	 * 
	 * @parameter String main, String sub
	 * 
	 * @return String 완성품이름
	 */
	String makeRoll(String main) {
		System.out.println( main +"(으)로 김밥을 만들다가 애교부립니다");
		
		String result = "애교를 겉들인 " + main + "을 만들었습니다.";
		return result;
	}
	
	//?
	
	/**
	 * 영수증 주문
	 * 
	 * @parameter int index 메뉴번호, int count 개수
	 * @return void
	 */
	void print(int index, int count) {
		String menuName = (String)this.menu.get(index);
		int menuPrice = (int)this.price.get(index);
		
		System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:-:");
		System.out.println("메뉴명 : "+ menuName);
		System.out.println("주문수 : "+ count);
		System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:-:");
		System.out.println("총금액 : "+ (menuPrice * count));
		System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:-:");
	}
	
	/**
	 * 주문하기
	 * 
	 * @param int index 메뉴번호
	 * @return void
	 */
	
	void order(int index) {
		String menuName = (String)this.menu.get(index);
		
		String result = makeRoll(menuName);
		System.out.println("주문하신 " + result + " 나왔습니다");
	}
	
	/**
	 * 메뉴추가
	 * 
	 * @param String 메뉴명, int 가격
	 * @return void
	 */
	void addMenu(String menuName, int menuPrice) {
		this.menu.add(menuName);
		this.price.add(menuPrice);
		
		System.out.println("메뉴 " + menuName + "(" + menuPrice +")(을)를 추가하였씁니다.");
	}
	
	/**
	 * 전체메뉴와 가격확인
	 * @param
	 * @return void
	 */
	void printMenu() {
		for(int i=0; i<this.menu.size(); i++) {
			System.out.println(this.menu.get(i) + " : " + this.price.get(i));
		}
	}
}
