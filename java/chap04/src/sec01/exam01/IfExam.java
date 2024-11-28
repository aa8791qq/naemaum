package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 96;
//		변수를 입력해서 나오게 하는 방법
//		Scanner scan = new Scanner(System.in);
//		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다");
		}
	
		// if(!(score >= 90))
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다");
		}
		
		if(score >= 90) {
			System.out.println("\n90점 이상입니다");
			System.out.println("등급 A");
		} else if (score < 90 && score >= 80 ) {
			System.out.println("80~ 90점입니다");
			System.out.println("등급 B");
		} else if (score < 80 && score >= 70 ) {
			System.out.println("70~ 80점입니다");
			System.out.println("등급 C");
		} else if (score < 70 && score >= 60 ) {
			System.out.println("70~79점입니다");
			System.out.println("등급 D");
		} else {
			System.out.println("60점 미만입니다");
			System.out.println("등급 E");
		}

//케이스 2(그리고~, 연관이 있음)
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			
			if(score >= 95) {
				System.out.println("장학금 대상입니다");
			}
		}
		
//케이스 3(독립작동, 연관이 없음)
		if(score >= 90) {
			System.out.println("\n90점 이상입니다");
		}	
		if(score >= 95) {
			System.out.println("장학금 대상입니다");
		}		
		
	}
}
