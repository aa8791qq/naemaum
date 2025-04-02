package kr.or.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human.dao.EmpDAO;
import kr.or.human.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List<EmpDTO> getEmpList() {
		List list = empDAO.selectEmpList();
		return list;
	}

	@Override
	public EmpDTO getEmpOne() {
		EmpDTO dto = empDAO.selectOneEmp();
		return dto;
	}

	@Override
	public EmpDTO getEmpno(int empno) {
		EmpDTO dto = empDAO.selectOneEmpno(empno);
		return dto;
	}
	
	@Override
	public EmpDTO getEmpno2(EmpDTO empDTO) {
		EmpDTO dto = empDAO.selectOneEmpno2(empDTO);
		return dto;
	}
	
	@Override // 놓침
	public int modifyEmp(EmpDTO empDTO) {
		int upc = empDAO.updateEmp(empDTO);
		return upc;
	}
	
	@Override // stop //get, post 메소드
	public int insertEmp(EmpDTO empDTO) {
		int dto = empDAO.insertEmp(empDTO);
		return dto;				
	}
	
}
