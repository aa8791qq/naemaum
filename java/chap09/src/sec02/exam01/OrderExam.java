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
		
		Comparator c = new OrderBy();	// 부모가 있어서 가능한 코딩
		Collections.sort(list, c);

		for(int i = 0; i<list.size(); i++) {
			System.out.println(((MemberDTO)list.get(i)).age); // 형변환
			System.out.println(((MemberDTO)list.get(i)).name); // 형변환
		}
		
	}

}
