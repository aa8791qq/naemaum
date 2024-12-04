package sec01.exam01;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score2; // java
		int score[]; //c laung
		
		// 변수앞에 무조건 타입이라고 읽는 경우
		// score변수 "int로 구성된 배열이다"
		
		// 배열은 참조타입이라서 null 값을 만들 수 있다.
		score = null;
		
		//////////////////////
		int score_0 = 90;
		int score_1 = 85;
		int score_2 = 92;
		
		int[] intArray = new int[3];
		intArray[0] = 90; //변수명 = 변수값
		intArray[1] = 85;
//		intArray[2] = 92;
		
		System.out.println(intArray[0]);
		// 기본값은 0, false, null로 초기화된다.
		System.out.println(intArray[2]);
		// 범위에 벗어남(현재 : 0~2까지만 가능)
//		System.out.println(intArray[3]);
		
		//선언 2번째 방법
		//넣을 값을 몯 정확히 알고 있는 경우
		int[] intArray2 = new int[] {90, (int)Math.random(), 70};
		
		int[] intArray2_1 = null;
		intArray2_1 = new int[] {90, (int)Math.random(), 70};
		intArray2_1 = new int[] {90, 7, (int)Math.random(), 70};
		System.out.println(intArray2_1.length);
		
		//선언 3번째방법(new int[] 생략)
		//선언과 동시에 초기화 하는 경우에만 생략가능
		int[] intArray3 = {90, (int)Math.random(), 70};
//		intArray3 = {90, (int)Math.random(), 70};

		System.out.println(intArray3.length);
		System.out.println(intArray3);
	}

}
