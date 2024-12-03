package sec01.exam01;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		// 1씩 5번 증가하고 싶어.....
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println(sum);

		// n(n+1) / 2 : n까지의 합
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println(sum);

		sum = 0;
		int i = 1;
		i++;
		sum = sum + i; // 1
		i++;
		sum = sum + i; // 2

		/*
		 * 반복문을 만드는 원리 1. 반복되는 것을 찾기 ctrl + c, v 했을 때 그대로인것. 2. 반복되지 않는 것을 찾기 규칙(패턴)을
		 * 찾는다. 변수를 만들어서 더 이상 바뀌지 않게 만든다. 3. 시작 조건 찾기 4. 종료 조건 찾기
		 * 
		 * 반복횟수를 아는 경우 : for 반복횟수를 모를 경우 : while
		 */

		int sum2 = 0;
		for (int e = 1; e <= 100000; e++) {
			sum2 = sum2 + e;
		}
		System.out.println(sum2);

		int sum3 = 0;
		for (int e = 1; e <= 100; e++) {
//			System.out.println(e);
			sum3 = sum3 + e;
//			System.out.println(sum3);
		}
		System.out.println(sum3);

		// 1부터 10까지 실행
		int number = 1;
		for (int e = 1; e <= 10; e++) {
			System.out.println(e);
		}

		// 100까지 합
		int sum100for = 0;
		for (int i2 = 1; i2 <= 100; i2 += 1) {
			sum100for += i2;
		}
		System.out.println(sum100for);

		// q
		// 10~1 출력하세요
//		int number2 = 10;
//		for(int e = 10; e >= 1 && e <= 10;) {
//			number2 -= e;
//			System.out.println(number2);

//		int number2 = 10; //불필요한 코드
		for (int e = 10; e >= 1; e -= 1) {
			System.out.println(e);
		}

		System.out.println("-----문제라인-------");

//		1~ 20 까지 짝수만 출력하시오 //변수를 0에서 2로 바꿈(오답)
//		for(int in1 = 1; in1 <= 20; in1 += 1) {
//		int e = 20;
		for (int ij1 = 2; ij1 <= 20; ij1 += 2) {
			System.out.println(ij1);
		}

		// 다른 답안
		for (int ij2 = 1; ij2 <= 20; ij2++) {
			if (ij2 % 2 == 0) {
				System.out.println(ij2);
			}
		}

//		1~ 20 까지 3의 배수만 출력하시오
		for (int ic1 = 3; ic1 <= 20; ic1 += 3) {
			System.out.println(ic1);
		}

		// 다른답안
		for (int ij2 = 3; ij2 <= 20; ij2++) {
			if (ij2 % 3 == 0) {
				System.out.println(ij2);
			}
		}

//		1~5 까지 모두 출력하면서 홀짝구분(1:홀수)
		for (int ih1 = 1; ih1 <= 5; ih1 += 1) {
			if (ih1 % 2 != 0) {
				System.out.println(ih1 + " : 홀수");
			} else {
				System.out.println(ih1 + " : 짝수");
			}
		}

		// 다른방법
		for (int ih1 = 1; ih1 <= 5; ih1 += 1) {
			if (ih1 % 2 != 0) {
				System.out.println(ih1 + " : 홀수");
			} else {
				System.out.println(ih1 + " : 짝수");
			}

			String ea = "홀수";
			if (ih1 % 2 == 0) {
				ea = "짝수";
			}
			System.out.println(ih1 + " : " + "홀수");

			String ae = (ih1 % 2 == 0) ? "짝수" : "홀수";
			System.out.println(ih1 + " : " + ae);
		}

//		1~20까지 홀수의 합 // (증감연산자를 빠뜨리고 변수를 잘못 넣었음, 함수도 잘못 넣음(if))
		int hao2 = 0; // 변수1 -> 0으로 수정( 같은 수 중복 출력)
		for (int hhap = 1; hhap <= 20; hhap += 2) {
			hao2 += hhap; // 변수지정 잘못해서 수정함(sum 함수를 넣었음)
		}
		System.out.println(hao2);

		// 다른방법
		int hao3 = 0;
		for (int hhap = 1; hhap <= 20; hhap++) {
			if (hhap % 2 == 1) {
				hao3 += hhap; // 변수지정 잘못해서 수정함
			}
		}
		System.out.println(hao2);

////		1~20까지 홀수의 갯수 //------------------- 홀수가 먼지까지 출력함
//		for (int ih1 = 1; ih1 <= 20; ih1 += 2) {
//			if (ih1 % 2 != 0) {
////				System.out.println(ih1);
//			}
//			System.out.println(ih1 / 2);
//			if (ih1 == 20) {
//				break;
//			}
//		}

		// 답안
		int summ5 = 0;
		for (int q4 = 1; q4 <= 20; q4++) {
			if (q4 % 2 == 1) {
				summ5 += 1; // 이 코드를 생각 못했음
			}
		}
		System.out.println(summ5);

//		1~10까지 옆으로 3개씩 출력( 1 2 3 / 4 5 6)
		for (int q = 1; q <= 10; q++) {
			System.out.print(q + " ");
			if (q % 3 == 0) {
				System.out.println();
			}
		}

		System.out.println();

		// 다른 방법
		for (int q = 1; q <= 10; q++) {
			if (q % 3 != 0) {
				System.out.print(q + " ");
			} else {
				System.out.println(q);
			}
		}

		System.out.println();

//		구구단 2단 (2 * 1 = 2) // 책참고 ( 불필요한 for문을 넣었음)
		int m = 2; // ( 불필요한 for문 삭제)
		for (int n = 1; n <= 9; n++) {
			System.out.println(m + "x" + n + "=" + (m * n));
		}

//		1~n (n은 입력받은 수)까지의 합 또는 짝수의 합
//		Scanner scan2 = new Scanner(System.in);
//		System.out.println("숫자??"); // 출력이 안되거나 오류또는 원치않은 값이 나옴
//		int n = scan2.nextInt();
//
//		int nsum = 0;
//		for (int q = 1; q <= n; q++) {
//			nsum += q;
//		}
//		System.out.println(nsum);

		// 구구단
		for (int o = 2; o <= 9; o++) {
			for (int p = 1; p <= 9; p++) {
				System.out.println(o + "x" + p + "=" + (o * p));
			}
		}

		// 한줄에 1단씩 출력 (2*1=2 3*1=3 4*1=4)
		System.out.println();
		for (int li2 = 2; li2 <= 9; li2++) {
			for (int liv2 = 1; liv2 <= 9; liv2++) {
				if (liv2 % 9 != 0) { // ==에서 !=으로 바꿈, 3에서 9로 바꿈, 각종 불필요한 구문 삭제
					System.out.print(li2 + "x" + liv2 + "=" + (li2 * liv2) + " ");
				} else {
					System.out.println(li2 + "x" + liv2 + "=" + (li2 * liv2));
				}
			}
		}

		// 다른방법
		System.out.println();
		for (int i8 = 2; i8 <= 9; i8++) {
			for (int i4 = 1; i4 <= 9; i4++) {
				System.out.print(i8 + "x" + i4 + "=" + (i8 * i4) + " ");
			}
			System.out.println();
		}

		// 두~세 단씩 옆으로 출력 ( 2x1=2 3x1=3 ) ----> 구구단 출력까지는 함
//		for (int li2 = 1; li2 <= 9; li2++) {
//			for (int liv2 = 2; liv2 <= 9; liv2++) {
//				if (liv2 % 9 != 0) { // ==에서 !=으로 바꿈, 3에서 9로 바꿈, 각종 불필요한 구문 삭제
//					System.out.print(liv2 + "x" + li2 + "=" + (li2 * liv2) + " ");
//				} else {
//					System.out.println(liv2 + "x" + li2 + "=" + (li2 * liv2));
//				}
//			}
//		}

		// 정답
		System.out.println("---------규칙소스-----------------");
		int m2 = 2;
		int m3 = m + 1;
		for (int k2 = 1; k2 <= 9; k2++) {
			System.out.println(m2 + "x" + k2 + "=" + (m2 * k2) + " " + m3 + "x" + k2 + "=" + (m3 * k2) + " ");
		}
		System.out.println();

		System.out.println("--------------------------");
		for (int p = 2; p <= 9; p += 2) {
			for (int k2 = 1; k2 <= 9; k2++) {
				System.out
						.println(p + "x" + k2 + "=" + (p * k2) + " " + (p + 1) + "x" + k2 + "=" + ((p + 1) * k2) + " ");
			}
			System.out.println();
		}
	}

}
