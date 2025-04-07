package kr.or.human.dao;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import kr.or.human.dto.EmpDTO;

@RunWith(SpringJUnit4ClassRunner.class) // 컨테이너 생성
@WebAppConfiguration // 다이나믹 웹 설정
@ContextConfiguration( // 사용할 bean들과 scan할 패키지 로딩
  locations = {
          "file:src\\main\\webapp\\WEB-INF\\spring\\mybatis.xml",
          "file:src\\main\\webapp\\WEB-INF\\spring\\appServlet\\servlet-context.xml"
  })

public class EmpDAOImplTest {

	@Autowired
	SqlSession sqlsession;
	
	@Test
	public void testSelectEmplist() {
//		fail("Not yet implemented");
		
		List<EmpDTO> result = sqlsession.selectList("mapper.emp.selectEmp");
		System.out.println("rs.size : " + result.size());
		
		assertTrue(result.size() == 2800);
		
		// assertEquals(obj1, obj2) // 첫번째와 두번째 equals 해줌
		// assertNotNull(obj) // null인가?
	}

}
