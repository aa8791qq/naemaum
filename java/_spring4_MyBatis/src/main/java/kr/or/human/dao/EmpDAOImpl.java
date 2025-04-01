package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<EmpDTO> selectEmpList() {
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("result : "+ result);
		return result;
	}
	
	@Override
	public EmpDTO selectOneEmp() {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectOneEmp");
		System.out.println("dto: "+ dto);
		return dto;
	}
	
	@Override
	public EmpDTO selectOneEmpno(int empno) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno", empno);
		System.out.println("dto: "+ dto);
		return dto;
	}
	@Override
	public EmpDTO selectOneEmpno2(EmpDTO empDTO) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno2", empDTO);
		System.out.println("EmpDAOImpl selectOneEmpno2: "+ dto);
		return dto;
	}

	@Override
	public EmpDTO updateEmp(EmpDTO empDTO) {
		sqlSession.update("", empDTO);
		return dto;
	}

}
