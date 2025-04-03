package kr.or.human.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.human.dto.EmpDTO;

@Mapper
public interface EmpMapperDAO {

//	사라지는 롬복에 의해서....
	
	//
	List<EmpDTO> selectEmp();
	
}
