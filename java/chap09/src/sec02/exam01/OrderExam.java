package sec02.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();

		m1.name = "다솜";
		m1.age = 27;

		m2.name = "서영";
		m2.age = 25;

		m3.name = "윤희";
		m3.age = 24;

		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);

//		if(m1>m3) {} / 클래스임

		Comparator c = new OrderBy(); // 부모가 있어서 가능한 코딩 // 파괴함수

		// 익명함수화
		Comparator c2 = new Comparator() {
			public int a = 10; // 내부에서는 시용가능
			public void test() {
				// 이름이 없어서 밖에서 못씀
			}
			
			@Override
			public int compare(Object o1, Object o2) {
				MemberDTO dto1 = (MemberDTO) o1;
				MemberDTO dto2 = (MemberDTO) o2;

				int result = dto1.age - dto2.age;

				return result;
			}

		}; // 부모가 있어서 가능한 코딩 // 파괴함수

		Collections.sort(list, c); // 필수

		for (int i = 0; i < list.size(); i++) {
			System.out.println(((MemberDTO) list.get(i)).age); // 형변환
			System.out.println(((MemberDTO) list.get(i)).name); // 형변환 // 추가작업(String 연산 불가)
		}
		
		Collections.sort(list, c2); // 필수
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(((MemberDTO) list.get(i)).age); // 형변환
			System.out.println(((MemberDTO) list.get(i)).name); // 형변환 // 추가작업(String 연산 불가)
		}

	}

}
