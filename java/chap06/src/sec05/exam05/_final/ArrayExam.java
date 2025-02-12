package sec05.exam05._final;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int [5];
//		a[0] = 1;
		
		// array 구현(놓침)
		// 생성하고 나서
		// add()에 값을 넣으면 자동으로 index 값에 추가
			// 단, 크기를 벗어나지 못함(에러문구)
		// get()에 index를 넣으면 그 index의 값을 return함
		
		Array array = new Array(3);
		array.add(10000);
		array.add(1234);
		array.add(1884);
		array.add(13214);
		
		int b = array.get(2);
		System.out.println(b);
		int c = array.get(100);
		if(c == Integer.MIN_VALUE) {
			System.out.println("아차차차");
		}
	}

}
