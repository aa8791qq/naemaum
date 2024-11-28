package sec02.exam04;

public class p150q5q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// >>>>
		//q5.
		double var1 = 5;
		double var2 = 2;
		double var3 = var1 / var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//q5 (다른접근법)
		int var1_1 = 5;
		int var2_1 = 2;
		double var3_1 = (double)var1_1 / var2_1;
		int var4_1 = (int) (var3_1 * var2_1);
		System.out.println(var1_1);
		System.out.println(var2_1);
		System.out.println(var3_1);
		System.out.println(var4_1);
		
		//q6. Chat gpt 도움을 구함
		int value = 356;
		System.out.println((int)(356 / 100) * 100 );
		
		//q6 (모범답안) ---------------------
		int value1 = 356;
		System.out.println((int)(value1 / 100) * 100 );
		
		//q6 다른접근법
		int value2 = 356;
		System.out.println(value2 - ( value2 % 100 ));
		
		//깜짝퀴즈 //실패(*1000 까지는 했음)
		// v1 / v2
		double v1 = 1000;
		double v2 = 457;
		
		//코딩
		double v3 = (v1 / v2) * 1000;
		int v4 = (int)v3;
		double v5 = (double) v4 / 1000;
		System.out.println( v5 );
	}

}
