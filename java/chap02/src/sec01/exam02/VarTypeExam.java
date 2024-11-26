package sec01.exam02;

public class VarTypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127; // =는 오른쪽에서 왼쪽으로 간다라고 생각하면 됨.
//		b = 128; 타입범위밖이다.
		
/*		허용범위 초과로 에러나옴
 		byte b1 = 100;
		byte b2 = 80;
		b = b1 + b2;
*/
		long l1 = 10; // 기본값 int타입
		long l2 = 20L; // L=Long 타입
//		long l3 = 10000000000; // 허용범위이탈
		long l4 = 10000000000L; // 허용범위내
		
		char c1 = 'A'; //''안에는 1글자밖에 못옴, ""는 문자가 와야하므로 char도 못씀(String활용)
		System.out.println("c1 : " + c1);
		
		char c2 = 67; // 67 = 아스키코드 C에 해당하는 숫자
		System.out.println("c2 : " + c2);
		
		System.out.println("c2-c1 : " + (c2-c1));
		
		char c3 = 'a';
		System.out.println("c3-c1 : " + (c3-c1));
		// c1, c3 = 대소문자 아스키코드값 차이 연산값 출력(차이값 : 32)
		
		String s1 = "남기원";
		System.out.println("s1 : " + s1);
		
		String s2 = "\"남기원\""; // ""출력방법 //
		System.out.println("s2 : " + s2);
		
		String s3 = "번호\t이름"; //tap
		String s4 = "번호2\t이름";
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);

		String s5 = "\n홍길동\n김자바"; //enter
		System.out.println("s5 는 " + s5);


	}

}
