package quiz;
// 리그생성, 목록생성
public class PocketmonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pockemon play = new Pockemon();
		Pockemonleauge play2 = new Pockemonleauge();
		Pockemonleauge play3 = new Pockemonleauge();
		Pockemonleauge play4 = new Pockemonleauge();
		play.Pockemonimport(); // 포켓몬 정보 추가 및 출력
		play3.leagNm(); // 리그이름 정하기
		play4.playlist(); // 플레이원 정보 불러오기
		play2.play(); // 포켓몬 리그 진행
	}

}
