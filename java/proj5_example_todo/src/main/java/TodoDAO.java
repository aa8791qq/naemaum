import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TodoDAO {

	public int insertTodo(TodoDTO todoDTO) {
		System.out.println("TodoDAO insertTodo 실행");
		int result = -1; // 제대로 돌아오는(작동되는) 지 확인
		
		try {
			// db 접속 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection(); // null 방어코딩해야됨

			// SQL 준비
			// 방법 1 :sql String을 그냥 만들기
//			String query = "insert into todo values ( seq_todo.nextval, '" +todoDTO.getTodo() + "', sysdate, null, 'N' )"; // 여러줄로 쓸때에는 공백삽입을 주의해야함(변경가능)
//			PreparedStatement ps = con.prepareStatement(query);
			
			// 방법2 : ? 활용하기(여러개 사용 가능)
			String query1 = "insert into todo values ( seq_todo.nextval, ?, sysdate, null, 'N' )"; // 여러줄로 쓸때에는 공백삽입을 주의해야함(변경가능)
			PreparedStatement ps1 = con.prepareStatement(query1);
			ps1.setString(1, todoDTO.getTodo()); // 첫번째 물음표에 값을 넣어달라
			
			// SQL 실행 및 결과확보
			// int에는 영향받는 줄 수
			// int executeUpdate : select 외 모든것
			result = ps1.executeUpdate();

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	List selectTodoList() {
		System.out.println("select todolist 실행");
		
		List list = new ArrayList();
		
		try {
			// db 접속 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection(); // null 방어코딩해야됨

			// SQL 준비
			// 방법 1 :sql String을 그냥 만들기
			String query = " select * from todo "; // 여러줄로 쓸때에는 공백삽입을 주의해야함(변경가능)
			PreparedStatement ps = con.prepareStatement(query);
			
			
			// SQL 실행 및 결과확보
			// int에는 영향받는 줄 수
			// int executeUpdate : select 외 모든것
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				TodoDTO dto = new TodoDTO();
				dto.setTodo_id(rs.getInt("todo_id"));
				dto.setTodo(rs.getString("todo"));
				dto.setCreate_date(rs.getDate("create_date"));
				dto.setModify_date(rs.getDate("modify_date"));
				dto.setDone(rs.getString("done"));
				
				list.add(dto);
			}

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
