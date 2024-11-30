package sec01.exam01;

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

//		1~ 20 까지 짝수만 출력하시오
//		for(int in1 = 1; in1 <= 20; in1 += 1) {
//		int e = 20;
		for (int ij1 = 0; ij1 <= 20; ij1 += 2) {
			System.out.println(ij1);
		}

//		1~ 20 까지 3의 배수만 출력하시오
		for (int ic1 = 3; ic1 < 20; ic1 += 3) {
			System.out.println(ic1);
		}

//		1~5 까지 모두 출력하면서 홀짝구분(1:홀수)
		for (int ih1 = 1; ih1 <= 5; ih1 += 1) {
			if (ih1 % 2 != 0) {
				System.out.println(ih1 + " : 홀수");
			} else {
				System.out.println(ih1 + " : 짝수");
			}
		}

//		1~20까지 홀수의 합 // ( 증감연산자를 빠뜨리고 변수를 잘못 넣었음)
		int hao2 = 0;
		for (int hhap = 1; hhap <= 20; hhap += 2) {
			hao2 += hhap; // 변수지정 잘못해서 수정함
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

//		1~10까지 옆으로 3개씩 출력( 1 2 3 / 4 5 6)
		

//		구구단 2단 (2 * 1 = 2) // 책참고 ( 불필요한 for문을 넣었음)
		int m = 2;
		for (int n = 1; n <= 9; n++) {
			System.out.println(m + "x" + n + "=" + (m * n));
		}
	}

}
