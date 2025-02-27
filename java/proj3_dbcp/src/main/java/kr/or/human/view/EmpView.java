package kr.or.human.view;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import kr.or.human.DTO.EmpDTO;

public class EmpView {

	public void viewEmp(List list, HttpServletResponse response) { //?
		for(int i = 0; i<list.size(); i++) {
			EmpDTO map0 = (EmpDTO)list.get(i);
			try {
				response.getWriter().println("<table border='1'>" // html 코드에서는 ''(홀따옴표)로 해야함.
						+ "<tr>"
						+ "<td>"
						+ map0.getEmpno()
						+ "</td>"
						+ "<td>"
						+ map0.getEname()
						+ "</td>"
						+ "<td>"
						+ map0.getHiredate()
						+ "</td>"
						+ "</tr>"
						+ "</table>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
