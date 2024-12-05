package sec01.exam01;

public class VoteExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 3;
		int end = 10;
		
		double drandom = Math.random();
		int irandom = (int)drandom*(end - start + 1);
		
		int rerandom = irandom + start;
		
		//한줄로 <<<<<<< 배열에 중복된 번호??? 뽑기 파트 못들음
		int random = ((int)(Math.random() * (end - start + 1))) + start;
		
		System.out.println(random);
	}

}
