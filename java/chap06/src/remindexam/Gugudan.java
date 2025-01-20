package remindexam;

public class Gugudan {

	void test() {
		System.out.println("오랫만이여~");
	}
	
	// 전달 받은 숫자에 해당하는 구구단 출력
	// 1~9 까지 반복하면서 출력
	
	void printDan(int x) {
		for (int i=1; i<=9; i++) {
			System.out.println(x + " * " + i + " = " + x*i);
		}
		System.out.println("-------------");
	}
	
	
	void printMultiDan(int x, int y) {
		for(int i = x; i<= y ; i++){
			// 한 단씩 출기
			printDan(i); // 범위값 i==??? 재활용??
		}
		System.out.println("-------------");
	}
	
	
//	void printMultiDan2(int x)
	void printMultiDan(int x){// 같은 인자갯수로 써도됨(전달인자가 달라서)
		for(int i = x; i <= 9; i++){
//			printDan(i);
//			printMultiDan(x, 9); // 위의 함수를 재 활용
			printMultiDan(i); // 위의 함수를 재 활
		}
	}
	
}