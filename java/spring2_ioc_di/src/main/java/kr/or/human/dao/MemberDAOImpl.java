package kr.or.human.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository // 위치
// @Component
public class MemberDAOImpl implements MemberDAO {
	
	@Override
	public List selectList() {

		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		return list;
	}

}
