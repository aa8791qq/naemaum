package kr.or.human.service;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpService {

	public List<EmpDTO> getEmpList();
	
//	놓침
//	public EmpDTO getEmp1();
	
	public EmpDTO getEmpnoAsk();
	public EmpDTO getEmpnoAsk2();
}
