package sec01.exam01;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score2; // java
		int score[]; // c laung

		// 변수앞에 무조건 타입이라고 읽는 경우
		// score변수 "int로 구성된 배열이다"

		// 배열은 참조타입이라서 null 값을 만들 수 있다.
		score = null;

		//////////////////////
		int score_0 = 90;
		int score_1 = 85;
		int score_2 = 92;

		int[] intArray = new int[3];
		intArray[0] = 90; // 변수명 = 변수값
		intArray[1] = 85;
//		intArray[2] = 92;

		System.out.println(intArray[0]);
		// 기본값은 0, false, null로 초기화된다.
		System.out.println(intArray[2]);
		// 범위에 벗어남(현재 : 0~2까지만 가능)
//		System.out.println(intArray[3]);

		// 선언 2번째 방법
		// 넣을 값을 몯 정확히 알고 있는 경우
		int[] intArray2 = new int[] { 90, (int) Math.random(), 70 };

		int[] intArray2_1 = null;
		intArray2_1 = new int[] { 90, (int) Math.random(), 70 };
		intArray2_1 = new int[] { 90, 7, (int) Math.random(), 70 };
		System.out.println(intArray2_1.length);

		// 선언 3번째방법(new int[] 생략)
		// 선언과 동시에 초기화 하는 경우에만 생략가능
		int[] intArray3 = { 90, (int) Math.random(), 70 };
//		intArray3 = {90, (int)Math.random(), 70};

		System.out.println(intArray3.length);
//		intArray2_1 = 5;

		System.out.println(intArray3);

		String[] sArr = new String[14];

		sArr[0] = "이름1";
		sArr[1] = "이름2";
		sArr[2] = "이름3";

//		for ( int k = 1; k <= 14; k++) {
//			System.out.println(k);

		int k = 1;

		k++;
		sArr[k] = "이름" + (k + 1);

		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = "이름" + (i + 1);
		}

		// sArr의 모든 내용을 출력
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}

		System.out.println();
		// 깜짝퀴즈
		// 1~10까지 배열에 넣고
//		int[] number2 = new int[10];
//		for( int x = 1; x <= 10; x++) {
//			System.out.println(x);
//		}

		// 정답
		int[] nums = new int[10];
		for (int x = 0; x < nums.length; x++) {
			nums[x] = x + 1;
			System.out.println(nums[x]);
		}
		System.out.println();

		// 배열의 총합 출력/평균출력
		// 합계
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		System.out.println(sum);

		System.out.println();

		System.out.println((double) sum / nums.length);
		
		System.out.println();
		// 간단퀴즈
		// 1~10까지 순서대로 저장된 배열을
		// 10부터 1까지 거꾸로 출력
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
		System.out.println();
		// 다른방법
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[nums.length-1 - i]);
		}
		System.out.println();
		// [3,4,7,5,1,4,6]
		//문제1. 홀수의 개수 구하기
		int[] nums2 = {3, 4, 7, 5, 1, 4, 6};
		
		//4개 홀수
		// 배열에 있는 숫자 모두출력(처음(0)부터 끝(length-1)까지)
		// 나머지가 0이 아닌것만 출력
		// 갯수를 센다(?) 홀수를 구하면서 카운트
		
		for(int i = 0; i > nums2.length; i++) {
			
		}
		System.out.println(nums2);
		
		//문제2. 4보다 큰 수의 개수 구하기
		//문제3. 최대값 구하기
		
		//조금 어려운 문제4. 두번째 큰 수 구하기
	}

}
