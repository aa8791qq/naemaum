package exam1;

import java.util.Scanner;

public class Dec12exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner working = new Scanner(System.in); // 키보드 입력값을 받아서 다음단계로 남어가게 만든다.
		boolean a = true; // 종료버튼 누르면 빠져나가게 하기 위한 변수
		while (a) { // 무한루프(손님 대기를 위해 계속돌린다.)
			System.out.println("주문을 몇개 하시겠습니까?");
			int os = working.nextInt(); // 주문건수
			
			if (os >= 1) { /// 1개이상이면 입력을 받는다.
			} else { //아니면 종료
				System.out.println("다시 이용해주세요");
			}

			System.out.println("다음 메뉴를 정해볼까요?"); // 입력 문장을 출력합니다.
			System.out.println(" 1. coffie 3000원 | 2. juice 5000원부터 | 3. 종료"); // 메뉴 선택가능 한것을 출력한다.
			int menuS = working.nextInt(); // 입력을 받아서 menuS에 저장합니다요~

			int priceC = 0; // 커피가격 저장 변수
			int priceJ = 0; // 주스가격 저장 변수
			int sec1 = 0;
			int sec2 = 0;
			
			if (menuS == 3) { // 종료 옵션
				System.out.println("종료! 다음에 이용 부탁드립니다.");
				return; // 반복 종료
			}

			switch (menuS) {
			case 1: // 커피를 주문합니다.
				System.out.println("커피를 선택하셨습니다");
				System.out.println(" 1. Ice | 2. Hot | 3. 종료"); // 메뉴 선택가능 한것을 출력한다.
				int menuSb1 = working.nextInt(); // 1번을 입력하면 그 다음에서 ice, hot를 menuSb에 저장합니다요~

				switch (menuSb1) {
				case 1:
					System.out.println("아이스를 선택했어요. 잠시만 기달려주세요 \n 가격은 3000원입니다.");
					priceC = 3000;
					break;

				case 2:
					System.out.println("핫을 선택했어요. 잠시만 기달려주세요 \n 가격은 3000원입니다.");
					priceC = 3000;
					break;

				default: // 범위에 없으면 다시 입력 시키기
					System.out.println("다시 입력쿠해주세요!");
					break;
				}

				if (sec1 == 3) { // 종료 옵션
					System.out.println("종료! 다음에 이용 부탁드립니다.");
					break;
				} // 반복 종료
				sec1 = menuSb1;
				break;

			case 2: // 주스를 주문합니다.
				System.out.println("주스를 선택하셨습니다");
				System.out.println(
					"1. 오렌지(300원 추가) | 2. 망고(500원 추가) | 3. 키위(400원추가) | 4. 사과(300원 추가) | 5. 포도(300원 추가)| 6. 종료");
				priceJ = 5000;
				int menuSb2 = working.nextInt(); // 2번을 입력하면 그 다음에서 주스 재료를 골라요~
				switch (menuSb2) {
				case 1:
					priceJ += 300;
					System.out.println("오렌지주스를 선택했어요! 잠시만 기달려주세요 \n 가격은 " + priceJ + "입니다.");
					break;

				case 2:
					priceJ += 500;
					System.out.println("망고주스를 선택했어요! 잠시만 기달려주세요 \n 가격은 " + priceJ + "입니다.");
					break;

				case 3:
					priceJ += 400;
					System.out.println("키위주스를 선택했어요! 잠시만 기달려주세요 \n 가격은 " + priceJ + "입니다.");

					break;
				case 4:
					priceJ += 300;
					System.out.println("사과주스를 선택했어요! 잠시만 기달려주세요 \n 가격은 " + priceJ + "입니다.");
					break;

				case 5:
					priceJ += 300;
					System.out.println("포도주스를 선택했어요! 잠시만 기달려주세요 \n 가격은 " + priceJ + "입니다.");
					break;

				default: // 범위에 없으면 다시 입력 시키기
					System.out.println("다시 입력쿠해주세요!");
					break;
				}

				if (sec2 == 6) { // 종료 옵션
					System.out.println("종료! 다음에 이용 부탁드립니다.");
					break;
				} // 반복 종료
				break;

			default: // 범위에 없으면 다시 입력 시키기
				System.out.println("다시 입력쿠해주세요!");
				break;
			}
			for(os = working.nextInt(); os > 0; os++) {
				os += 1;				
			}
			System.out.println("현재 " + os +"개 주문 중입니다.");
			
			// 영수증(만약에 선택을 1번으로 했더라면....)
			if (menuS == 1) {
				System.out.println("----------------------");
				System.out.println("주문 하신 메뉴는");
			}

			// 만약에 세부선택을 1번으로 했더라면....
			if (sec1 == 1) {
				System.out.println(menuS + " = 커피," + sec1 + " = 아이스" + "로 주문했습니다.");
				System.out.println("가격은 총 " + priceC + "입니다.");
				System.out.println("----------------------");
				// 만약에 세부선택을 2번으로 했더라면....
			} else if (sec1 == 2) {
				System.out.println(menuS + " = 커피," + sec1 + " = 핫" + "로 주문했습니다.");
				System.out.println("가격은 총 " + priceC + "입니다.");
				System.out.println("----------------------");
			}

			// 만약에 선택을 2번으로 했더라면....
			if (menuS == 2) {
				System.out.println("----------------------");
				System.out.println("주문 하신 메뉴는");
			}
			// 만약에 세부선택을 1번으로 했더라면....
			if (sec2 == 1) {
				System.out.println(menuS + " = 주스," + sec2 + " = 오렌지주스" + "로 주문했습니다.");
				System.out.println("가격은 총 " + priceJ + "입니다.");
				System.out.println("----------------------");
				// 만약에 세부선택을 3번으로 했더라면....
			} else if (sec2 == 2) {
				System.out.println(menuS + " = 주스," + sec2 + " = 망고주스" + "로 주문했습니다.");
				System.out.println("가격은 총 " + priceJ + "입니다.");
				System.out.println("----------------------");
				// 만약에 세부선택을 3번으로 했더라면....
			} else if (sec2 == 3) {
				System.out.println(menuS + " = 주스," + sec2 + " = 키위주스" + "로 주문했습니다.");
				System.out.println("가격은 총 " + priceJ + "입니다.");
				System.out.println("----------------------");
				// 만약에 세부선택을 4번으로 했더라면....
			} else if (sec2 == 4) {
				System.out.println(menuS + " = 주스," + sec2 + " = 사과주스" + "로 주문했습니다.");
				System.out.println("가격은 총 " + priceJ + "입니다.");
				System.out.println("----------------------");
				// 만약에 세부선택을 5번으로 했더라면....
			} else if (sec2 == 5) {
				System.out.println(menuS + " = 주스," + sec2 + " = 포도주스" + "로 주문했습니다.");
				System.out.println("가격은 총 " + priceJ + "입니다.");
				System.out.println("----------------------");
			}
			if(menuS > 4) {
				System.out.println(menuS + "와 " + menuS + "를 주문했습니다.");
			}
		}
		
		System.out.println("감사합니다! 또 이용해주세요.");
	}
}
