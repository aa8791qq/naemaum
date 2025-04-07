package kr.or.human.dto;
import java.sql.Date;

import lombok.Data;

// DTO : Data Transfer Object
// VO : Value Object
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor // 생성자
//@EqualsAndHashCode //?
@Data // 5가지 통합

public class EmpDTO {

	private int empno;		// 사원번호
	private String ename;	// 사원명
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private Integer comm;
	private int deptno;
	
}
