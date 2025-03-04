

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todo")
public class TodoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TodoDAO todoDAO = new TodoDAO();
		List resultList = todoDAO.selectTodoList();
		
		request.setAttribute("resultList", resultList); // 키, 값
		
		String url = "list.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String todo = request.getParameter("todo");
		System.out.println("todo : " + todo); //--> "" null = ?(  )
		
		TodoDTO todoDTO = new TodoDTO();
		todoDTO.setTodo(todo);
		
		TodoDAO todoDAO = new TodoDAO();
		int result = todoDAO.insertTodo(todoDTO);
		System.out.println("result : " + result);// 몇개 추가됬는지 표시
		
		// 다시 추가화면으로 돌아오는...
		String url = "todo";
		response.sendRedirect(url);
	}

}
