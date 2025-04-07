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
		List<EmpDTO> result = sqlsession.selectList("mapper.emp.selectEmp2s");
		System.out.println("rs : " + result);
		return result;
	}
	

}
