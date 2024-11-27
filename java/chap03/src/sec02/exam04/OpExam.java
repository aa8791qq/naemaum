package sec02.exam04;

public class OpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a = false;
		System.out.println(a);
		
		a = !a;
		System.out.println(a);
		
		double b = 7.0;
		System.out.println(b / 3);
//		System.out.println(b / 0); //무한대
//		System.out.println(3 / 0); //나누기 by 0
		
		int c = 500;
		int d = 9;
		System.out.println("몫 : " + (c / d) + ", 나머지 : " + (c % d));
		
		//만원있고 사천오백원짜리 커피 마시고 싶다. 몇 잔까지 가능?
		int tm = 10000;
		int cp = 4500;
		System.out.println("강사님은 " + tm / cp + "잔을 먹을 수도 있고, 남는 돈은 " + tm % cp + "원이 남습니다.");
		
		//정답
		int tm2 = 10000;
		int cp2 = 4500;
		int ch2 = tm2 / cp;
		int nm2 = tm2 % cp;
		System.out.println("강사님은 " + ch2 + "잔을 먹을 수도 있고, 남는 돈은 " + nm2 + "원이 남습니다.");


	}

}
