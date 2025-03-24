package kr.or.human.dao;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public List selectList() {

		List list = new ArrayList();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		return list;
	}

}
