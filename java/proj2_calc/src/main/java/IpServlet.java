
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ipServlet")
public class IpServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("" + request.getRemoteAddr()); // ip주소 가져오기(내부)-- 가져오는 방법중에 하나
		System.out.println("" + request.getMethod()); // 들어온 메소드찾기
		System.out.println("" + request.getRequestURL()); // 전체 url 주소(쿼리제외)
		System.out.println("" + request.getRequestURI()); // 포트 뒤에서 부터(식별자), 쿼리제외
		System.out.println("" + request.getContextPath()); // 프로젝트 구분 주소
		System.out.println("" + request.getServletPath()); // 서블릿주소(쿼리제외)
		System.out.println("" + request.getQueryString()); // 쿼리값

		// ip차단
		String[] blacklist = { "ip주소", "ip주소", "...." };
		String ip = request.getRemoteAddr();
		boolean ban = false;
		for (int i = 0; i < blacklist.length; i++) {
			if (ip.equals(blacklist[i])) {
				ban = true;
			}
		}

	}

}
