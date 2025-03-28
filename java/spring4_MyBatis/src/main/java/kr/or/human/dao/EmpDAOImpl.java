package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import kr.or.human.dto.EmpDTO;

//@Service
public class EmpDAOImpl implements EmpDAO {
	
	@Autowired
	SqlSession sqlsession;

	@Override
	public List<EmpDTO> selectEmplist() {
		List<EmpDTO> result = sqlsession.selectList("mapper.emp.selectEmp");
		System.out.println("rs : " + result);
		return result;
	}

}
