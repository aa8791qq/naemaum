package kr.or.human.dao;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpDAO {

	List<EmpDTO> selectEmplist();
	
//	놓침
	public EmpDTO selectEmp1();
	
	public EmpDTO selectEmpnoAsk();
	
}
