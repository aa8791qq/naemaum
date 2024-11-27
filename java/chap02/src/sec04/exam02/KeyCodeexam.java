package sec04.exam02;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int keycode;
		
//		try {
//			keycode = System.in.read();
//			System.out.println(keycode);
//			
//			keycode = System.in.read();
//			System.out.println(keycode);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		Scanner scan = new Scanner(System.in); //무엇을 입력해도 출력됨.
		String inputData = scan.nextLine();
		System.out.println(inputData);
		
		int input = scan.nextInt(); //에러가 남(글자입력시)
		System.out.println(input);
		
		
		
	}

}
