package sec01.exam01;

import java.util.Scanner;

public class Bankexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int balance = 0;

		do {
			System.out.println("---------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("예금액 : ");
				int input = scan.nextInt();
				if (input > 0) {
					balance += input;
					System.out.println("입금액 : "+ in1put);
				} else {
					System.out.println("예금액을 확인해줄랭?");
					System.out.println(balance);
				}
			} else if (sel == 2) {
				System.out.println("출금액 : ");
				int output = scan.nextInt();
				if (output < 0) {
					System.out.println("출금액을 확인해주세요");
				} else {
					System.out.println("출금액 : " + output);
					balance -= output;

					System.out.println("출금후잔고 : " + balance);
				}
			} else if (sel == 3) {
				System.out.println("잔고 : " + balance);
			} else if (sel == 4) {
				break;
			}
		} while (true);
	}
//		System.out.println("출금액을 확인해주세요");

//}
}