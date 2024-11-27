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
		
		//조금 어려운 문제
		// 올리브영에서 전품목 15% 세일중!!(1개씩)
		//1. 꿀홍차 5000원을 샀을때 얼마낼까요?
		int Goolm = 5000;
		//double result = honey - (honey * 0.15); //모범답안
		//double result = honey * (1 - 0.15)
		double sale = 0.15;
		System.out.println(Goolm * (1 - sale));
		//2. 꿀홍차 5000원과 립스틱 30000원을 사면?
		int Goolm2 = 5000;
		int lipsm2 = 30000;
		System.out.println(Goolm2 * (1 - sale) + ", " + lipsm2 * (1 - sale));
		//double result = (honey + lip) * (1 - 0.15)
		
		//풀어야 하는 문제
		// 7234원이 있습니다. 각 잔돈으로 최대 몇개까지 줄 수 있나욥?(5000원->1원짜리 순)
		int hm2 = 7234;
		int nm5000 = hm2 / 5000;
		int nm1000 = (hm2 - 5000) / 1000;
		int nm500 = (hm2 - 7000) / 500;
		int nm100 = (hm2 - 7000) / 100;
		int nm50 = (hm2 - 7200) / 50;
		int nm10 = (hm2 - 7200) / 10;
		int nm1t = (hm2 - 7230) / 1;
		System.out.println
			(hm2 + "원 중에서 5000원짜리는 " + nm5000 + "개, 1000원짜리는 " + nm1000 + "개, 500원짜리는 "
			+ nm500 + "개, 100원짜리는 " + nm100 + "개, 50원짜리는 " + nm50 + "개, 10원짜리는 " + nm10
			+ "개, 1원짜리는 " + nm1t + "개입니다.");


	}

}
