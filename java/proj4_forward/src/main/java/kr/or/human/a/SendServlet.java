package kr.or.human.a;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class SendServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("send doGet 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : " + text);
		
		// 응답으로 가야할 곳을 알려준다. 클라이언트가 해당주소로 이동해준다.
		response.sendRedirect("another?text="+ text);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("send doPost 실행");
		
	}

}
