package kr.or.human;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("webtoonDAO")
public class WebtoonDAO {

	public List webtoonImport(){
		List ls = new ArrayList();
		System.out.println("Import 실행");
		
		return ls;
	}
	
}
