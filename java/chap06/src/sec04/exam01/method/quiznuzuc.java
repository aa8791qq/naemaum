package sec04.exam01.method;

public class quiznuzuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 4, 7, 5, 1, 4, 6 };

//		int max = Integer.MIN_VALUE; //?
		// 최대값
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		System.out.println("----------------");
		// 두번째 큰 수 구하기 -- 복습!
		int second = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != max && second < arr[i]) {
				second = arr[i];
			}
		}
		System.out.println(second);
		System.out.println("----------------");

		// 배열 하나씩 뒤로 밀기 -----> 복습
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// 0으로 채우기(중간에 변수(배열마다) 저장해서 하는 방법)
		// 전략
		// 맨 앞에것을 두번째에 놓을 건데 두번째가 지워지니까 두번째를 앞에것에다가 적고 임시 변수를 세번째로 보낸다.(위 내용을 끝까지 반복)
//		arr[1] = arr1[0]; //arr1[1]이 지워진다.

//		arr1[0] = 0 // 원래 값이 지워진다.
//		int temp = arr1[0];
//		arr1[0] = 0; // [1] {0,2.3.4.5}
//		
//		int temp2 = arr1[1]; //[1][2] {0,2.3.4.5}
//		arr1[1] = temp; //[1][2] {0,1.3.4.5}
//		
//		temp = arr1[2]; // [3][2] {0,2,3,4,5}
//		arr1[2] = temp2; // [1][2] {0,1,2,4,5}
		// 복잡하고 변수를 여러개 지정해야 되서(임시변수 두개) 복잡하다.

		// 전략
		// 맨 뒤에다 ㅇ바로 앞의 값을 놓으면 어떨까?
		// { 1,2,3,4,5) >>> {{1,2,3,4,4}
		// {1,2,3,4,4} >>> {1.2.3.3.4}
//		int temp  = arr[arr1.length -1]; // [5] {1,2,3,4,5}
//		arr[arr1.length -1] = arr[arr1.length -2]; // [5] {1,2,3,4,4}
//		// [4] {1,2,3,4,4}
//		// 뒤에서 두번째 부터는 임시변수 필요없이 땡기면 됨
//		arr[arr1.length -2] = arr[arr1.length -3]; // {1,2,3,3,4}
//		arr[arr1.length -3] = arr[arr1.length -3+1]; // {1,2,3,3,4}
//		for(int m=0; m<arr1.length; m++) {
		for (int m = 0; m <= arr1.length; m++) {
			for (int i = arr1.length - 1; i >= 0; i--) {
				if (i == 0) {
					arr1[i] = 0;
				} else {
					arr1[i] = arr1[i - 1];
				}
			}
			// 출력
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[j]);
			}
			System.out.println();
		}
		System.out.println("----------------");
		// 첫자리에 마지막 것 넣기
		// 전략
		// 처음 값에 0대신 넣게 되면?

//		 임시 비밀번호 8자리 만들기!!!!!
		String[] arr2 = new String[8];
		// 숫자로
		for (int l = 0; l < arr2.length; l++) {
			arr2[l] = "" + (int) (Math.random() * 10);
			// 출력
			System.out.print(arr2[l]);
		}
		System.out.println();
		System.out.println("----------------");

//		 숫자2개이상, 대/소문자 조합
//		 전략1 : 일단 숫자2개 먼저 뽑고나서 정해진 개수의 대/소문자
//		 전략2 : 숫자/대/소문자를 random으로 정하기, 숫자를 몇개 뽑았는지 세어 놓았다가 마지막에서 두번째에서 숫자의 필수자리수
//		 소문자로
//		 char에 소문자와 숫자의 관계(아스키 코드)
		// 숫자
//		for (int k = 0; k < arr2.length; k++) {
//			int start = 97;
//			int end = 122;
//			int random = ((int) (Math.random() * (end - start + 1))) + 1;
//			char temp = (char) random;
//			// 출력
//			System.out.print(arr2[k]);
//		}
//		System.out.println();
//		System.out.println("----------------");

		// 숫자

		// 소문자
//			for(int m=0; m<arr2.length; i++) {
//				int start = 97;
//				int end = 122;
//				int random =( (int)(Math.random()*(end- start +1 )))+ start;
//				char temp = (char)random;
		// 대문자

		// 출력
//			System.out.println(arr2[i]);	
//	}
		// 예약
		// 자리가 10개 있는 소극장 예약 시스템

		// 자리 번호는 1~10번까지 번호의 자리

		// 만약1 : 예약이 가능하면 "n번자리 예약 되었습니다.

		// 만역2 : 예약이 불가능하다면 "이미 예약 되었습니다.

		// 양식 : 1. 예약 2. 모든좌석 현황 3.

		// 로또(중복없이 로또 6개 배열에 저장)
//	int[] lotto = new int[6];

//	lotto1 = (int)(Math.random()*45)+1;
//	lotto2 = (int)(Math.random()*45)+1;

//	do {
//		lotto[1] = (int)(Math.random()*45)+1;
//	} while(lotto[0] != lotto[1]);
//	do {
//		lotto[1] = (int)(Math.random()*45)+1;
//	} while(lotto[0] != lotto[1] && lotto[1] != lotto[2]);

		// 2번 index 진행중
//	int index =2;
//	boolean flag =false;
//	for(int i=0; i<index; i++) {
//		if(int i=0; i<index; i++) {
//			if(lotto[i] == lotto[index])
//		}
//		}

		// 완성
		int[] lotto = new int[6];
		boolean flag = false;
		for (int j = 0; j < lotto.length; j++) {
			do {
				lotto[j] = (int) (Math.random() * (45)) + 1;
				flag = false;
				for (int i = 0; i < j; i++) {
					if (lotto[i] == lotto[j]) {
						flag = true;
						System.out.println("중복발생");
						break;
					}
				}
			} while (flag);
		} ///????????????????????
		System.out.println("로또번호 남기원");

		for (int i = 0; i < lotto.length; i++) {
			if (i != 0) {
				System.out.print("," + lotto[i]);
			} else {
				System.out.print("," + lotto[i]);
			}

		}
	}
}