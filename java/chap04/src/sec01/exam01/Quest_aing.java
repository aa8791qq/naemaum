package sec01.exam01;

import java.util.Scanner;

public class Quest_aing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ...+...
		 * ..+++..
		 * .+++++.
		 * +++++++
		 */

		// 0단계
		/*
		 * 
		 * +
		 * +
		 * +
		 * +
		 * +
		 * 
		 */

		for (int i3 = 1; i3 <= 5; i3++) {
			System.out.println("+");
		}

		// 1단계
		/*
		 * +++++
		 * 
		 */
		System.out.println();
		
		for (int i3 = 1; i3 <= 5; i3++) {
			System.out.print("+");
		}
		System.out.println();

		// 2단계
		/*
		 * +++++
		 * +++++
		 * +++++
		 * 
		 */
		System.out.println();
		
		for (int i3 = 1; i3 <= 3; i3++) {
			System.out.print("+");
			for (int i4 = 2; i4 <= 5; i4++) {
				System.out.print("+");
			}
			System.out.print("\n");
		}
		System.out.println();

		// 3단계
		/*
		 * 
		 * +.+.+.+.+
		 * 
		 */
		
		for (int i3 = 1; i3 <= 5; i3++) {
			System.out.print("+");
//			for (int i5 = 1; i5 <= 1; i5++) { // 포문 1번만 쓰는 코딩
				System.out.print(".");
//			}
		}
		System.out.println();
		
		// 3.5단계
		/*
		 1
		 22
		 333
		 4444
		 55555
		 */
		
//		for(int j = 1; j <= 5; j++) {
//			for(int i = 1; i <= j ; i++) {
//				System.out.print(i);
//			}
//			System.out.print(j);
//		}
		System.out.println();
		for (int i3 = 1; i3 <= 5; i3++) { // 불필요한 쿼리 제거 및 2번째 포문에 있는 비교변수 수정, for문 이탈 시 나오는 문구 수정
			for (int i4 = 1; i4 <= i3; i4++) {
				System.out.print(i3);
			}
			System.out.println("");
		}
		System.out.println();
		
		// 4단계
		/*
		 +
		 ++
		 +++
		 ++++
		 +++++
		 */
		
		for (int i5 = 1; i5 <= 5; i5++) { // 불필요한 쿼리 제거 및 2번째 포문에 있는 비교변수 수정, for문 이탈 시 나오는 문구 수정
			for (int i4 = 1; i4 <= i5; i4++) {
				System.out.print("+");
			}
			System.out.println("");
		}
		
		// 4.5
		/*
		 11111
		 2222
		 333
		 44
		 5
		 */
		
		// 5단계
		/*
		 +____
		 ++___
		 +++__
		 ++++_
		 +++++
		 */
		System.out.println();
		for (int i6 = 1; i6 <= 5; i6++) {
			for (int i4 = 1; i4 <= i6; i4++) {
				System.out.print("+");
			}
			for (int i4 = 1; i4<= (5 - i6); i4++) {
				System.out.print("_");
			}
			System.out.println("");
		}
		System.out.println("");

		// 6단계
		/*
		 ____+
		 ___++
		 __+++
		 _++++
		 +++++
		 */
		for (int i7 = 1; i7 <= 5; i7++) {
			for (int i4 = 1; i4<= (5 - i7); i4++) {
				System.out.print("_");
			}
			for (int i4 = 1; i4 <= i7; i4++) {
				System.out.print("+");
			}
			System.out.println("");
		}
		System.out.println("");

		// 7단계
		/*
		 ____+
		 ___+++
		 __+++++
		 _+++++++
		 +++++++++
		 */
		for(int j = 1; j <= 5; j++) {
			for(int i = 1; i<=(5-j); i++) {
				System.out.print("_");
			}
			for(int i = 1; i <= (j * 2 ) -1; i++) {
				System.out.print("+");
			}
			System.out.println();
		}
		System.out.println();
		// 8단계
		/*
		 ____+____
		 ___+++___
		 __+++++__
		 _+++++++_
		 +++++++++
		 */
		for(int j = 1; j <= 5; j++) {
			for(int i = 1; i<=(5-j); i++) {
				System.out.print("_");
			}
			for(int i = 1; i <= (j * 2 ) -1; i++) {
				System.out.print("+");
			}
			for(int i = 1; i<=(5-j); i++) {
				System.out.print("_");
			}
			System.out.println();
		}

		// 9단계
		// 입력 받은 만큼 출력
		int k = 15;
		for(int j =1; j <= k; j++) {
			for(int i=1; i<=(k-j); i++ ) {
				System.out.print("_");
			}
			for(int i=1; i<=(j*2)-1; i++) {
				System.out.print("+");
			}
			for(int i=1; i<=(k-j); i++) {
				System.out.print("_");
			}
			System.out.println();
		}
		System.out.println();
		// 예시
		System.out.println("상고의 숫자를 넣어보자");
		Scanner scan = new Scanner(System.in);
		int user20 = scan.nextInt();
		
		for (int tree1 = 1; tree1 < user20; tree1++) {
			for(int tree2 = user20; tree2 >= tree1; tree2--) {
				System.out.print("_");
			}
			for (int tree3 = 1; tree3 <= tree1; tree3++) {
					System.out.print("+");
			}
			for (int tree4 = 2; tree4 <= tree1; tree4++) {
				System.out.print("+");
			}
			for (int tree5 = user20; tree5 >= tree1; tree5--) {
				System.out.print("_");
			}
			System.out.println();
	}
		
		//주사위 두개로 나올 수 있는 모든조합출력
		//중복을 제거한 경우의 수
	}

}
