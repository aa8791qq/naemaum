package cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/set")
public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 만료일이 있는 쿠키
		// 브라우저 자체에 SQLite(DB)또는 파일로 저장
		Cookie c1 = new Cookie("key", "value");
//		c1.setMaxAge(60*60*24); // 초단위(1일)
		c1.setMaxAge(5); // 초단위
		response.addCookie(c1);
		
		// 만료일이 없는 쿠키
		Cookie c2 = new Cookie("key", "value2");
	}
}
