package kr.or.human.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

// bean 이름을 지정하는 방법
// 이름을 지정하지 않은 경우 클래스명인데 맨앞글자만 소문자인 이름 자동생성
@Repository("memberDAOImpl") // 위치
@Primary

// @Component
public class MemberDAOImpl implements MemberDAO {
	
	MemberDAOImpl(){
		System.out.println("MemberServiceImpl 생성자 실행");
	}
	
	@Override
	public List selectList() {

		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		return list;
	}

}
