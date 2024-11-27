package sec01.exam02;

public class VarTypeCVExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2 + (8 - 7); //() = 우선순위
		long b = (long)a; // 글씨에서 숫자로는 바꿀 수 없음. () = 형변환연산자
		long c = a; // a가 long 타입에 해당하는 허용범위 내이므로 int(연산자) 생략가능
				
		long d = 3000000000L;
//		int e = d; // d가 int 타입에 해당하는 허용범위 외이므로 long 연산자 생략불가능
		int e = (int)d; //long을 int로 변환하는 경우 8byte 중에서 상위 4byte만 남기기 때문에(예측불가능) 생략이 불가능하다.
		System.out.println("e : " + e);
		
		long f = 10; // long f = 10L
		/*
		 * 
		 * int ii = 10;
		 * long f = (long)ii;
		 * long f = ii;
		 */
		
		int g = 3;
		long h = 4L;
		long i = (long)g + h;
		long i2 = g + h;
		
		double j =3.3;
		double k = (double)g + j;
		double k2 = g + j;
		System.out.println("(double)g : "+ (double)g);
		
		System.out.println("(int(j) : " + (int)j);
		
		/*
		 * 1. 내 나이를 저장한다 : int
		 * 2. 내가 운전면허가 있다,없다 : boolean
		 * 3. 우리집의 스마트폰 갯수 : int
		 * 4. 내 이름 : string
		 * 5. 온도(소수점까지) : double
		 * 6. 1.29999999999와 1.3이 같은가? : bollean
		 * 7. 1평이 3.3m2일때 5평의 값은? : double
		 */
		
		//주최자가 회식비를 얼마나 걷어야 하는지 출력하시요(total:회식비/만원, count : 참석인원, 소수점이하는 다 버리기)
		double total = 4.3;
		int count = 4;
		
		//손해볼 수 있는 코드(원본 훼손 우려)
		a = (int)total / count;
		System.out.println(a);
		
		//정답 코드(모범)
		double I = (total / (double)count);
		int M = (int)I;
		System.out.println(M);
		
		double d_result = total / (double)count;
		int i_result = (int)d_result;
		System.out.println(i_result);
		
//		int i_result2 = (int)total / count
		
		//주최자가 내야하는 비용
		double e2 = (total / count); // 총 비용을 추출합니다.
		int g2 = (int)(total / count); // 총값을 int를 바꾸고 총 명수로 나눈다.(총비용 정수)
/*double*/float h2 = /* 생략가능 */(float) ((e2 - g2) * count); //총 비용에서 총 비용(정수)로 빼고 총 명수를 곱한다.(나머지)
/*double*/float f2 = /* 생략가능 */(float) h2 + g2; // 나머지값이랑 총비용 정수값을 더한다.
		System.out.println("총 금액은 " + h2 + "만원입니다.\n슬퍼하지 마세요. 더치페이로 다시 돌려드릴게요.");
		
		System.out.println("총 금액은 " + e2 + "만원입니다.\n슬퍼하지 마세요. 더치페이로 다시 돌려드릴게요.");
		
		
	}

}
