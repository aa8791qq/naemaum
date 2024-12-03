package sec01.exam01;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
			
		// while 설명 다시
			
		
		}
		System.out.println("메뉴를 골라보자");
		System.out.println("1 : 커피, 2 : 홍차, 0: 종료");
		Scanner scan =new Scanner(System.in);
		int menu = scan.nextInt();
		
		if(menu == 1) {
			System.out.println("커피드리죠");
		} else if(menu == 2) {
			System.out.println("홍차드리죠");
		} else if(menu == 0) {
			System.out.println("다음에 또 오세요~ 아잉");
		} else {
			System.out.println("다시입력해주세요");
		}
		
		System.out.println("메뉴를 골라보자");
		System.out.println("1 : 커피, 2 : 홍차, 0: 종료");
		Scanner scan1 =new Scanner(System.in);
		int menu1 = scan.nextInt();
		
		if(menu1 != 0) {
			if(menu == 1) {
				System.out.println("커피드리죠");
			} else if(menu1 == 2) {
				System.out.println("홍차드리죠");
			} else if(menu1 == 0) {
				System.out.println("다음에 또 오세요~ 아잉");
			} else {
				System.out.println("다시입력해주세요");
			}
		} else 

}
