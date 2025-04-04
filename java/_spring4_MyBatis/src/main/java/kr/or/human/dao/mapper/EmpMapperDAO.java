//	사라지는 롬복에 의해서....
package kr.or.human.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.human.dto.EmpDTO;

@Mapper
public interface EmpMapperDAO {
	//xml의 id와 DAO의 메소드 명을 갖게한다.

	
	List<EmpDTO> selectEmp();
	
}
