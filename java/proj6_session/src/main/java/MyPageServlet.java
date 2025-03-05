

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session/mypage")
public class MyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Boolean isLogon = (Boolean)session.getAttribute("isLogon");
		if(isLogon == null || !isLogon) {
			response.sendRedirect(request.getContextPath() + "/session/cookie.jsp");
		}
		
		response.getWriter().println("로그인해주세요");
	}

}
