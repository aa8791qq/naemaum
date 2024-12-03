package sec01.exam01;

public class Quest_aing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ...+...
		 * ..+++..
		 * .+++++.
		 * +++++++
		 */

		// 0단계
		/*
		 * 
		 * + + + + +
		 * 
		 */

		for (int i3 = 1; i3 <= 5; i3++) {
			System.out.println("+");
		}

		// 1단계
		/*
		 * +++++
		 * 
		 */
		System.out.println();
		
		for (int i3 = 1; i3 <= 5; i3++) {
			System.out.print("+");
		}
		System.out.println();

		// 2단계
		/*
		 * +++++
		 * +++++
		 * +++++
		 * 
		 */
		System.out.println();
		
		for (int i3 = 1; i3 <= 3; i3++) {
			System.out.print("+");
			for (int i4 = 2; i4 <= 5; i4++) {
				System.out.print("+");
			}
			System.out.print("\n");
		}
		System.out.println();
		// 3단계
		/*
		 * 
		 * + + + + +
		 * 
		 */
		
		for (int i3 = 1; i3 <= 5; i3++) {
			System.out.print("+");
			for (int i5 = 1; i5 <= 1; i5++) {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		// 3.5단계
		/*
		 1
		 22
		 333
		 4444
		 55555
		 */
		System.out.println();
		
		System.out.println();
		// 4단계
		/*
		 +
		 ++
		 +++
		 ++++
		 +++++
		 */
		System.out.println();
		
		for (int i3 = 1; i3 <= 5; i3++) { // 불필요한 쿼리 제거 및 2번째 포문에 있는 비교변수 수정, for문 이탈 시 나오는 문구 수정
			for (int i4 = 1; i4 <= i3; i4++) {
				System.out.print("+");
			}
			System.out.println("");
		}
		System.out.println();
		
		// 5단계
		/*
		 +____
		 ++___
		 +++__
		 ++++_
		 +++++
		 */
		System.out.println();
		
		for (int i3 = 1; i3 <= 5; i3++) {
			for (int i4 = 1; i4 <= i3; i4++) {
				System.out.print("+");
			}
			System.out.println("_");
		}
		System.out.println("");

		// 6단계
		/*
		 ____+
		 ___++
		 __+++
		 _++++
		 +++++
		 */

		// 7단계
		/*
		 ____+
		 ___+++
		 __+++++
		 _+++++++
		 +++++++++
		 */

		// 8단계
		/*
		 ____+____
		 ___+++___
		 __+++++__
		 _+++++++_
		 +++++++++
		 */

		// 9단계
		// 입력 받은 만큼 출력
	}

}
