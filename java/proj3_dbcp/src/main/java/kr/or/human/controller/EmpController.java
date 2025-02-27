package kr.or.human.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.human.DAO.EmpDAO;
import kr.or.human.view.EmpView;
@WebServlet("/emp")
public class EmpController extends HttpServlet {

	// 놓침 저장
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpDAO empDAO = new EmpDAO();
		List list = empDAO.selectEmpList();
		
		EmpView empView = new EmpView();
		empView.viewEmp(list, response);
		
	}

}
