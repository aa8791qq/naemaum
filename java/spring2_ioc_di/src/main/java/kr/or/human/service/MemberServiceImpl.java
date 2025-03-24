package kr.or.human.service;

import java.util.List;

import kr.or.human.dao.MemberDAO;
import kr.or.human.dao.MemberDAOImpl;

public class MemberServiceImpl implements MemberService {

	@Override
	public List getList() {

		MemberDAO memberDAO = new MemberDAOImpl();
//		MemberDAO memberDAO = new MemberDAOImpl2();
		List list = memberDAO.selectList();
		
		return list;
	}

}
