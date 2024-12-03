package sec01.exam01;

public class BreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
			count++;
		}
//		int numq = 0;
//			for(int numq2 = 1; numq2 >= 6; numq2++) {

//			}

		System.out.println("아잉! " + "총 : " + count);
		System.out.println();
//		다른방법

		int num = 0;
		int num2 = 0;
		while (num != 6) {
			num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num != 6) {
				num2 += 1;
			}
		}

		System.out.println("시스템을 종료합니다. 총:" + num2);

		System.out.println();

		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
			if (i >= 5) { // ==는 건널뛸 가능성이 있음
				break;
			}
		}

		System.out.println();

		for (int i2 = 0; i2 < 5; i2++) {
			System.out.println(i2);
			for (int j = 0; j < 3; j++) {
				// if(j >= 2){
				// break;;
				System.out.println(j);
			}
		}
		System.out.println();

		/// 문제
		boolean isStop = false;
		for (int i3 = 0; i3 < 5; i3++) {
			System.out.println(i3);
			for (int j = 0; j < 3; j++) {
				if (j >= 2) {
					isStop = true;
					break;
				}
				System.out.println(j);
			}
			if (isStop) {
				break;
			}
//			break;
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
