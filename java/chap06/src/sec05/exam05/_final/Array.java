package sec05.exam05._final;

public class Array {

	// 배열 만드는 법
//	int[] a = new int[3];
//	Array() {
//		System.out.println(a.length);
//		
//		// a.length = 5; // final int 변수(불가)
//	}

	// 시작(구현)
	final int length; // 선언
	int[] arr;
	int cursor = 0;
	
	// 전체 프라이빗
	Array (int length){
		this.length = length; // 초기화
		arr = new int[length];
	}
	// 전체 프라이빗
	
	void add(int x) {
//		a[0] = 100;
		System.out.println("cursor : " + cursor + ", x : "+ x);
		if(cursor < this.length) {
			arr[cursor] = x;
			cursor++;
		} else {
		System.out.println("범위를 초과했습니다.");
		}
	}
	
	int get(int index) {
		if(index < this.length) {
			return arr[index];
		} else {
			System.out.println("범위를 초과했습니다.");
			return Integer.MIN_VALUE;
		}
	}
	
}
