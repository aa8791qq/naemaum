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
	public List<EmpDTO> getEmpList(){
		List list = empDAO.selectEmplist();
		return list;
	}
	
//	놓침
//	public EmpDTO getEmp1() {
//		EmpDTO list = empDAO.selectEmp1();
//		return list;
//	}
	
}
