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
		
		// 두번째 큰 수 구하기 -- 복습!
		int second = arr[0];
		for(int i=0; i < arr.length; i++) {
			if(arr[0] != max && second < arr[i]) {
				second = arr[i];
			}
		}
		System.out.println(second);
		
		// 배열 하나씩 뒤로 밀기
		int[] arr1 = {1,2,3,4,5};
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
		
		//전략
		//앞에서부터 swap하니깐 왼쪽으로 밀리는 결과
		//뒤에서부터 swap하면 오른쪽으로 밀린다.
		int temp  = arr[arr1.length -1]; // [5] {1,2,3,4,5}
		arr[arr1.length -1] = arr[arr1.length -2]; // [5] {1,2,3,4,4}
		// [4] {1,2,3,4,4}
		
		
		// 첫자리에 마지막 것 넣기
		
		// 임시 비밀번호 8자리 만들기
			// 숫자로
		
			// 소문자로
		
			// 숫자2개이상, 대/소문자 조합
		
		// 예약
			// 자리가 10개 있는 소극장 예약 시스템
		
			// 자리 번호는 1~10번까지 번호의 자리
		
			// 만약1 : 예약이 가능하면 "n번자리 예약 되었습니다.
		
			// 만역2 : 예약이 불가능하다면 "이미 예약 되었습니다.
		
			// 양식 : 1. 예약 2. 모든좌석 현황 3. 
		
		// 로또
		
	}

}
