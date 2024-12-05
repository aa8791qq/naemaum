package sec01.exam01;

import java.util.ArrayList;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1호점
		String[] menu1 = new String[3];
		menu1[0] = "망고요구르트";
		menu1[1] = "복숭아아이스티";
		menu1[2] = "안유진친필사인이 담긴 주스";

		// 2호점(1호점과 같은메뉴판매하기)
		/*
		 * 앝은복사 shallow copy, thin copy, call by reference stack 영역의 값(주소)만 복사 변경할 경우
		 * 원본이 바뀐다..
		 */

		String[] menu2 = menu1; // 실체는 하나!
		// 얕은 복사로 연결되어 있어서(주소값만 공유)
		// 복사본을 바꿔도 원본이 바뀐다.
		menu2[2] = "바나나라떼";
		System.out.println(menu1[2]);

		/*
		 * 깊은 복사 deep copy, deep clone, call by value 전혀 다른 힙영역에 똑같은 내용에 채워넣음 원본과 복사본은
		 * 별개의 객체임.
		 */

		String[] menu3 = new String[menu1.length];
		for (int i = 0; i < menu1.length; i++) {
			menu3[i] = menu1[i];
		}
		menu3[2] = "장원영친필사인이 담긴 주스";
		System.out.println(menu1[2]);
		System.out.println(menu3[2]);

		System.out.println("-----------");
		// 3호점에서만 사라다빵을 추가로 팔고싶을때
		// menu3보다 크기가 1개 많은 배열을 만들고
		// 앞부분은 깊은 복사 해놓고
		// 마지막에 사라다빵을 수동으로 추가해보자
		menu3 = new String[menu1.length + 1];
		for (int i = 0; i < menu1.length; i++) {
			menu3[i] = menu1[i];
		}
		menu3[menu3.length - 1] = "사라다빵";

		for (int i = 0; i < menu3.length; i++) {
			System.out.println(menu3[i]);
		}

		// ArrayList 사용법
		ArrayList list = new ArrayList();
		// 추가하는법
		list.add(1);
		list.add("아잉");
		list.add(false);

		// 사용하는법
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 사이즈 아는법
		System.out.println(list.size());

		System.out.println(list);

		// 구 for문
//		for(int = 0; i<menu3.length; i++){
//			String menu = menu3[i];
//			System.out.println(menu);
//		}
		
		// 항상된 for문 >> 일부못들음
		for (String menu : menu3) {
			System.out.println(menu);
		}

	}

}
