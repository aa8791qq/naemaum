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
		
//문제1.
		// z1이 x1과 y1사이에 있는가?
		int x1 = 15;
		int y1 = 20;
		int z1 = 17;
		
//		boolean R1 = z1 >= x1;
//		boolean R2 = z1 <= y1;

		if( z1 >= x1 && z1 <= y1) {
		/* if( ! (z1 >= x1 && z1 <= y1) )
	* --> if( (z1 < x1) || (z1 > y1) ) */
			System.out.println(z1 +"사이");
		} else {
			System.out.println(z1 + "사이아님");
		}
		
		int x2 = 3;
		if ( (x2 % 2) == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
// 문제2.
		/*
		 * 영하인지 영상인지(0도도 영하) " 영하/영상 "
		 * 만약 영하라면 " 영하 1도입니다. ", 영상이라면  " 영상 2도입니다. "
		 * 어제보다 온도가 높은지 낮은지. "어제보다 온도가 높/낮습니다"
		 * "어제보다 2도 높습니다"
		 */
		int t = -1; //온도
		int yt = -3 // 어제온도
				
// 문제3.
		/*
		 * 어떤 수가 있을 때 " 입력한 수는 100보다 크/작으며 양(0포함)/음수이고 홀/짝수입니다"
		 */
				
//문제 4
		/*
		 * a, b 두 수가 있을떼 둘 중에 큰값 출력
		 */
				
//문제 5
		/* 
		 * 숫자가 1~3은 일, 이, 삼 .. 그 외에는 "그외"
		 */
//문제 6
		/*
		 * 월에 따라서 4계절을 출력하시오(봄-> 3~5, 여름 -> 6~8, 가을-> 9~11, 겨울 -> 12~2)
		 */

	}
}
