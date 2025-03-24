package kr.or.human.dao;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl2 implements MemberDAO {

	@Override // 소스에서만 존재
	public List selectList() {

		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		return list;
	}

}
