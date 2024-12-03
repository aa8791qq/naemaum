package sec01.exam01;

public class LottoExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 로또 : 1~45의 숫자중 중복되지 않은 수 6개 고르기
		
		double rand = 0.0;
		/*
		 * 0이상 1미만
		 */
		rand = Math.random();
		double temp1 = rand * 45 + 1;
		int temp2 = (int)temp1;
		int lotto1 = temp2 + 1;
		System.out.println(lotto1);
		
		rand = Math.random();
		double temp3 = rand * 45 + 1;
		int temp4 = (int)temp3;
		int lotto2 = temp4 + 1;
		System.out.println(lotto2);
		
		rand = Math.random();
		double temp5 = rand * 45 + 1;
		int temp6 = (int)temp5;
		int lotto3 = temp6 + 1;
		System.out.println(lotto3);
		
	}

}
