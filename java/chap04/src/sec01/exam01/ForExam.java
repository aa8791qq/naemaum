package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		//1씩 5번 증가하고 싶어.....
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println(sum);
		
		// n(n+1) / 2 : n까지의 합
		sum = 0;
		sum = sum +1;
		sum = sum +2;
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		System.out.println(sum);
		
		sum = 0;
		int i= 1;
		i++;
		sum = sum + i; //1
		i++;
		sum = sum + i; //2
		
		/*
		 * 반복문을 만드는 원리
		 * 1. 반복되는 것을 찾기
		 * 		ctrl + c, v 했을 때 그대로인것.
		 * 2. 반복되지 않는 것을 찾기
		 * 		규칙(패턴)을 찾는다.
		 * 		변수를 만들어서 더 이상 바뀌지 않게 만든다.
		 * 3. 시작 조건 찾기
		 * 4. 종료 조건 찾기
		 * 
		 * 반복횟수를 아는 경우 : for
		 * 반복횟수를 모를 경우 : while
		 */
	}

}