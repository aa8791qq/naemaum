
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/req")
public class RequestServlet extends HttpServlet {

	// ?
	public RequestServlet() {
		super();
		System.out.println("생성자실행");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/req doget");

		// 놓침(생성자에다가 적으면 안됨)
		// 요청내용의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");

		// 응답 내용 한글 깨짐방지
		response.setContentType("text/html; charset=utf-8");

		// getParameter(전달받은 파라메터의 key를 적어서 해당 값을 얻어오기)
		String num1 = request.getParameter("num1");
		System.out.println("num1 : " + num1);

		// 없으면 null(수동전달 및 출력은 &를 적는다)
		String num2 = request.getParameter("num2");
		System.out.println("num2 : " + num2);

		// querySelectorAll에 대응하는 코드(getParameterValues : 같은 name으로 여러개 온경우 String 배열로
		// 모두 받을 수 있음)
		String[] nums = request.getParameterValues("num1");

		// 일반 for문
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums : " + nums[i]);
		};

		System.out.println("--------------------");

		// 항상된 for문(null 방어)
		if (nums != null) {
			for (String num : nums) {
				System.out.println("num : " + num);
			}
		}
		
		System.out.println("-----------------------");
		System.out.println("pw " + request.getParameter("pw"));
		System.out.println("btn1 " + request.getParameter("btn1"));
		System.out.println("hidden1 " + request.getParameter("hidden1"));
		System.out.println("radio1 " + request.getParameter("radio1"));
		String[] checkbox1 = request.getParameterValues("checkbox1");
		if (checkbox1 != null) {
			for (String num : checkbox1) {
				System.out.println("num : " + num);
			}
		}
		System.out.println("date1 " + request.getParameter("date1"));
		System.out.println("number1 " + request.getParameter("number1"));
		System.out.println("div1 " + request.getParameter("div1"));
		System.out.println("span1 " + request.getParameter("span1"));
		System.out.println("text1 " + request.getParameter("date1"));
		System.out.println("select1 " + request.getParameter("select1"));
		System.out.println("textarea1 " + request.getParameter("textarea1"));
		
		
		response.getWriter().println("<strong>num1의 값은 : </strong>" + num1);
		
		String textarea = request.getParameter("textarea1");
//		textarea.replace("\n", "<br>");
		response.getWriter().println(textarea);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 놓침(생성자에다가 적으면 안됨)
		// 요청내용의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");

		// 응답 내용 한글 깨짐방지
		response.setContentType("text/html; charset=utf-8");
		
		String num1 = request.getParameter("num1"); // post방식에서도 사용가능함
		System.out.println("num1 : " + num1);
		
		String num2 = request.getParameter("num2"); // post방식에서도 사용가능함
		System.out.println("num2 : " + num2);
		
		response.getWriter().println("{\"a\":\"100\"}");

	}

}
