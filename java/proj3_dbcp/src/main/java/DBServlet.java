

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/DB")
public class DBServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("db에 들어왔니?");
		
		try {
			
			// db 접속 시작
			// context.xml에서 Resource 중에 jdbc/oracle을 가져와야 함.
			// JNDI 방식으로 가져옴
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


}
