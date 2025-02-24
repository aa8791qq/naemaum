package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();

		HashMap map1 = new HashMap();
		Map map = new HashMap();
		
		// 추가
		// 순서는 보장하지 않는다.(앝은 복사)
		map.put("k1", 10); // int->object로 형변환이 됨
		map.put("adb", list); // list, class 다 들어갈 수 있음
		
		// 가져오기
		int k1 = (int)map.get("k1"); // 강제형변환(object -> int)
		System.out.println(k1);
		System.out.println(map.get("k2")); // key가 없는 경우(key 값에 null이 있을 수 있음)
		
		// 초기화
		map = new HashMap();
		
		// list에 map 넣기
		map.put("제목", "뱅뱅뱅");
		map.put("가수", "빅뱅");
		list.add(map);

		// 초기화
		map = new HashMap(); // 새로운 맵을 추가 할려면 꼭 써야한다.(안하면 기존값을 덮어써버리고 여러번 출력됨.)
		
		// list에 map 넣기
		map.put("제목", "I AM");
		map.put("가수", "아이브");
		list.add(map);
	
		System.out.println(list);
		
		// 놓침............
		// 제네릭
		// 추가한 자료형을 제한하는 용도로 쓰임(자동으로 형변환되서 형변환을 할 필요없어짐)
		// add comment : 전달인자나 리턴타입의 자료형을 동적으로 변경한다.
		List<String> list1 = new ArrayList<String>(); //왼쪽에 쓰면 자동으로 오른쪽에도 붙어짐
		list1.add("adbs");
//		list1.add(123); // 타입 제한
		String str = list1.get(0); // 값을 꺼낼때 형변환이 없어도 됨.
		
		// 제네릭에 int(원시타입)는 사용할 수 없다. wrapper 클래스 사용
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("STR", 123);
		int a = map2.get("STR");
	}

}
