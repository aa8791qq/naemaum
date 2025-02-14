package sec02.exam01;

public class ParentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자식-> 부모
		Parent3_1 p3_1 = new Parent3_1();

		Parent2_1 p2_1 = (Parent2_1) p3_1;
		p2_1 = p3_1; // 형변환 생략가능

		Parent1 p1 = p2_1;

		p1 = p3_1;

		Parent1 p1_1 = new Parent3_1();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// 부모->자식
		Parent1 p1_2 = new Parent2_2();
		
//		p1_1 = p1_2; //같은 것 //?????
		
		Parent2_1 pp21 = (Parent2_1)p1_1;
		//런타임 에러 : 실행 후 알 수 있음
		Parent2_1 pp22 = (Parent2_1)p1_2;
	}

}
