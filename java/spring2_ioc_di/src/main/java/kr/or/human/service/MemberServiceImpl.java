package kr.or.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	MemberServiceImpl(){
		System.out.println("MemberServiceImpl 생성자 실행");
	}

	@Autowired
	MemberDAO memberDAO;
//	IOC		// DI
	
	@Override
	public List getList() {

//		MemberDAO memberDAO = new MemberDAOImpl();
//		MemberDAO memberDAO = new MemberDAOImpl2();
		List list = memberDAO.selectList();
		
		return list; // null 오류
	}

}
