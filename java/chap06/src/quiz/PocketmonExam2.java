package quiz;
// 리그생성, 목록생성
public class PocketmonExam2 {

	public static void main(String[] args) {
		// Pockmon2.java 파일을 활용함
		Pockemon2 p1 = new Pockemon2();
		p1.name = "피카츄";
		p1.type = "전기";
		
		Pockemon2 p2 = new Pockemon2();
		p2.name = "파이리";
		p2.type = "불";

		Pockemon2 p3 = new Pockemon2();
		p3.name = "뮤";
		p3.type = "변신";
		
		Pockemonleauge2 pl = new Pockemonleauge2("관동");
		pl.add(p1); // 전달인자를 일치시키지 않으면 실행이 안된다.
		pl.add(p2);
		pl.add(p3);
		
		pl.print(); // 참가정보를 출력한다.
		
		// a에다가 pl값, 포켓몬2 배열로 가져와 받는다.(pl)
		Pockemon2[] a = pl.getArray();
	}

}
