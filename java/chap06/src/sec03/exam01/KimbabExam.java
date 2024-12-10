package sec03.exam01;

public class KimbabExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kimbab cheonanStation = new Kimbab(1000); // 시드머니
		System.out.println("--------------");
		cheonanStation.order(1); // 배열 인덱스
		
		cheonanStation.makeRoll("라면");
		
		cheonanStation.addMenu("돈까스", 9000);
		cheonanStation.addMenu("제육덮밥", 8000);
		
		cheonanStation.print(1,10);
		
		Kimbab cheonantStation = new Kimbab(1000); // 시드머니
		System.out.println("--------------");
		
		cheonanStation.printMenu();
		System.out.println("--------------");
		cheonantStation.printMenu();

	}

}
