package kr.or.human.memberDTO;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MemberDTO {

	String id;
	String pw;
	String mbr_nm;
	String ytn_yn;
	Date reg_dttm;
	Date mod_dttm;
	String mbr_senm;
	
}


