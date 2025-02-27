package kr.or.human.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.human.DAO.EmpDAO;

public class EmpService {

	public List getEmpList(){
		System.out.println("아잉");
		
		EmpDAO empDAO = new EmpDAO(); //?
		List list = empDAO.selectEmpList();

		System.out.println(list.size());
		return list;
	}
}
