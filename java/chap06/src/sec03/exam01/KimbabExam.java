package sec03.exam01;

public class KimbabExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kimbab cheonanStation = new Kimbab(1); // 배열 갯수
		cheonanStation.order(1); // 배열 인덱스
		
		cheonanStation.makeRoll("라면");
		
		cheonanStation.print(1,10);

	}

}
