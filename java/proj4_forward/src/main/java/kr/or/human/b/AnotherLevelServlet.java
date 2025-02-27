package kr.or.human.b;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/another")
public class AnotherLevelServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("another doGet 실행");

		String text = request.getParameter("text");
		System.out.println("text : " + text);
		
		response.getWriter().println("okay bye~");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("another doPost 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : " + text);
		
		response.sendRedirect("another?text="+ text); // 파라미터포함 주소
	}

}
