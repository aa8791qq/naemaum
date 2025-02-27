package kr.or.human.a;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("forward doGet");

		response.getWriter().println("okay bye~"); // 출력안됨(forward라서)

		String text = request.getParameter("text");
		System.out.println("text : " + text);

		request.getRequestDispatcher("another").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("forward doPost");

		response.getWriter().println("okay bye2~"); // 출력안됨(forward라서)

		String text = request.getParameter("text");
		System.out.println("text : " + text);

		request.getRequestDispatcher("another").forward(request, response);
		;
	}

}
