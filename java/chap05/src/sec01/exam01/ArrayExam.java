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
			System.out.println(nums[nums.length - 1 - i]);
		}
		System.out.println();
		// [3,4,7,5,1,4,6]
		// 문제1. 홀수의 개수 구하기
		int[] nums2 = { 3, 4, 7, 5, 1, 4, 6 };

		// 4개 홀수
		// 배열에 있는 숫자 모두출력(처음(0)부터 끝(length-1)까지)
		// 나머지가 0이 아닌것만 출력
		// 갯수를 센다(?) 홀수를 구하면서 카운트
		int c1 = 0;
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] % 2 != 0) {
				c1 += 1;
//				System.out.println(nums2[i]);
			}
		}
		System.out.println("\n" + c1);

		// 문제2. 4보다 큰 수의 개수 구하기

		// 4보다 클때만 갯수를 센다

		int c2 = 0;
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] > 4) {
				c2 += 1;
			}
		}
		System.out.println("\n" + c2);

		// 문제3. 최대값 구하기

		// 숫자를 비교해가며 큰 숫자를 찾고(4,7,4,6) 난뒤 저장한다.
		// 저장한 숫자 (4,7,6) 중에 4는 같은지 아닌지 비교값을 구하고 저장한다.
		// 7하고 6은 큰지 작은지를 비교한다.
		// 그리고나서 4가 같은지 하고 6,7 비교한 값이 맞는지 추출하고
		// 마지막으로 4와 7를 비교한다.
		System.out.println("---");
		// 실패 현황 : 범위밖으로 출력되면서 오류가 뜨거나 오류가 없어도 값이 다르게 나옴, 암호화로 된게 나옴(큰값을 출력하는것)
		for (int i = 0; i < nums2.length; i++) { // int 0을 기준으로 길이만큼 늘어나게 만들고 i를 하나씩 더해요!
			if (nums2[i + 1] < nums2[i]) { // 1번째랑 2번째랑 비교해야 하니 i에다가 1를 더한값을 했어요.
				System.out.println(nums2[i]); // 비교할때마다 큰값을 하나씩 값을 저장하고 출력합니다
				if (i + 1 < nums2.length) { // 괄호를 반대로함(값이 다르게나옴)
											// 썜 풀이 참고 - 근데 범위밖으로 넘어가니깐 처음에는 6을 넣었더니 계속 오류가 나서 최대 배열(끝)을 넣었습니다.
											// 만약에 배열 최대길이보다 i+1이 작으면 진행시킨다.
					break; // if조건에 만족하지 않는다면 멈춘다.
				}
			}
		}

		// 정답
		// 앞에서 하나씩 보다가 0번째의 기준으로(앞을 기준으로) 다음것과 비교해서 큰것을 저장한다.
		// 저장한 내용으로 그 다음것과 비교하는걸 반복한다.

		System.out.println("-----");
//		int max = Integer.MIN_VALUE; //?
		int max = nums2[0];
		for (int i = 0; i < nums2.length; i++) {
			if (max < nums2[i]) {
				max = nums2[i];
			}
		}
		System.out.println(max);

		// 배열복사
		int[] a = { 1, 2, 3, 4 };
		int[] b = new int[a.length];
		b[0] = a[0];

		// 조금 어려운 문제4. 두번째 큰 수 구하기

		// 문제5 : 배열을 하나씩 뒤로 밀기
		// 5-1 : 0으로 채우기
		// 5-2 : 첫자리에 마지막 것 넣기
		// 문제6 : 임시비밀번호 8자리 만들기
		// 6-1 : 숫자로만
		// 6-2 : 소문자로만
		// 6-3 : 숫자2개이상, 대소문자 조합
		// 문제7 : 예약
		// 자리가 1~10
		// 예약이 가능하면 "n번짜리 예약했습니다"
		// 이미 예약했다면 "이미예약 되었습니다"
		// 메뉴 : 1.예약, 2. 모든예약현황보기, 3. 잔여좌석, 4. 종료
		// 문제8. 로또 6개 배열에 저장(중복없이)

		// 다차원 배열
		int[] class1 = new int[20];
		int[] class2 = new int[20];
		int[] class3 = new int[20];
		int[] class4 = new int[20];

		// 천안배열로 관리 ( 한번에 20짜리를 4개씩 )
		int[][] 천안 = new int[4][20];
		System.out.println();
		System.out.println(천안); // 메모리주소
		System.out.println(천안[0]); // 0배열의 메모리주소
		System.out.println(천안[0][0]); // 0배열의 진짜값

		// 서로 다른크기를 가지는 2차원배열
		int[][] test = { { 1, 2, 3 }, { 1, 2, 3, 4 }, { 78 } }; // 생략이유 : 중괄호를 생략가능(선언할때 가능)
		// 두번째 배열의 4를 출력
		System.out.println("1 " + test[1][3]);
		System.out.println("2 " + test.length);
		System.out.println("3 " + test[1].length);
		System.out.println(test[2]);

		int[][] 수원 = new int[4][20];
		int[][] 서울 = new int[4][20];

		int[][][] 휴먼 = new int[3][4][20]; // 3차원배열(내 - int [][][] = [천안][수원][서울]

		// 문제
		// 가상의 달력(12개월, 30일 형식)
		// 모든 날짜 채워 넣기
		// 따로 모든 (또는 특정달) 출력하기
		System.out.println("-------------");
		int[] month = new int[30];
		for (int daliy = 0; daliy < month.length; daliy++) { //////// 숫자를 직접넣었음(길이값을 넣어야됬었음)
			month[daliy] = daliy + 1;
			System.out.print(month[daliy] + ","); /////////// 애먹음
		}

		// 먼저 큰 틀로 1달로 만든다.
		// 숫자를 1부터 30일 넣는다.(반복시켜서 넣는다.)
		// 30이 될때까지 반복을 시킨다
		// 12가 될때까지 반복을 시킨다(전부만들려면)

		//// 이 파트 때매 당첨자를 다양한 방법으로 뽑기방법 못들음
		int[][] month2 = new int[12][30];
		for (int j = 0; j < month2.length; j++) {
			for (int i = 0; i < month2[j].length; i++) {
				month2[j][i] = i + 1; // 이게 빠져서 원하는 값으로 출력안됬음
				System.out.println(j + "+" + i + "+" + month2[j][i]);
			}
		}

		//4개짜리 배열복사(깊은)
		String[] name1 = {"김", "이", "박", "최"};
		// name1와 정확히 동일한 name2를 만드세요
		
		String[] name2 = new String[name1.length];
//		name2[0] = name1[0]; //for문 구동 기초 작업
		
		for(int i=0; i<name1.length; i++) {
			name2[i] = name1[i];
		}
		
//		for (int j = 0; j < month2.length; j++) {
//			for (int i1 = 0; i1 < month2[j].length; i1++) {
//				System.out.println(j + i1);
//			}
//		}

	}

}
