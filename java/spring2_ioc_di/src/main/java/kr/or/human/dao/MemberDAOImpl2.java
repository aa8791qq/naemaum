package kr.or.human.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository // 위치
// @Component
public class MemberDAOImpl2 implements MemberDAO {
	
	MemberDAOImpl2(){
		System.out.println("MemberServiceImpl2 생성자 실행");
	}
	
	@Override
	public List selectList() {

		List list = new ArrayList();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		return list;
	}

}
