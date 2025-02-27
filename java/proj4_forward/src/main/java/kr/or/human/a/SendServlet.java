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
		// 즉, 응답을 받았으니깐 접속을 끊고 새로운 주소로 다시 접속하는 걸 자동으로 해줌
		response.sendRedirect("another?text="+ text); // 파라미터포함 주소
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("send doPost 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : " + text);
		
		response.sendRedirect("another?text="+ text); // 파라미터포함 주소
	}

}
