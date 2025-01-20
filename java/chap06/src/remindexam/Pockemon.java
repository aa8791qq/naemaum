package remindexam;

// 포켓몬정보
public class Pockemon {

	Pockemonleauge infoadd = new Pockemonleauge();
//	public String[] getPokemonNames() { // 포켓몬 이름 배열 반환
//		return new String[] { "피카츄", "베렛네", "마자용", "냐옹" };
//	}
//
//	public String[] getPokemonTypes() { // 포켓몬 타입 배열 반환
//	        return new String[] { "전기", "물", "화염", "사람말" };
//	}
//	
//	void pockeinfoadd2() {
//	 String[] names = getPokemonNames();
//     String[] types = getPokemonTypes();
//	}
	
	void Pockemonimport() {
		pocketinfoadd();
	}

	void pocketinfoadd() {
		String[] names = pockeNames(); // 배열을 문자로 출력한다.
		String[] types = pockeTypes(); // 배열을 문자로 출력한다.
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " - " + types[i]);
		}
	}
	
	public String[] pockeNames() { // 포켓몬 이름 배열 반환
		return new String[] { "피카츄", "베렛네", "마자용", "냐옹", "뮤" };
	}

	public String[] pockeTypes() { // 포켓몬 타입 배열 반환
		return new String[] { "전기", "물", "화염", "사람말", "모든형태" };
	}
}
