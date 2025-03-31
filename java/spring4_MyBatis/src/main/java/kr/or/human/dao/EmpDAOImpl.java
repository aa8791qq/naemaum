package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	@Autowired
	SqlSession sqlsession;

	@Override
	public List<EmpDTO> selectEmplist() {
		List<EmpDTO> result = sqlsession.selectList("mapper.emp.selectEmp");
		System.out.println("rs : " + result);
		return result;
	}
	
//	놓침
	@Override
	public EmpDTO selectEmp1() {
		EmpDTO result = sqlsession.selectOne("mapper.emp.selectEmp1");
		System.out.println("rs : " + result);
		return result;
	}
	
	@Override
	public EmpDTO selectEmpnoAsk() {
		EmpDTO result = sqlsession.selectOne("mapper.emp.selectEmpnoAsk", 7369);
		System.out.println("rs : " + result);
		return result;
	}

}
