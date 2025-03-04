package cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 쿠키가 없으면 null
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			for(int i = 0; i<cookies.length; i++) {
				Cookie c =cookies[i];
				String name = c.getName();
				String value = c.getValue();
				System.out.println("name : " + name + ", value : " + value);
			}
		} else {
			System.out.println("큐키가 없는데예");
		}
		
		
	}

}
