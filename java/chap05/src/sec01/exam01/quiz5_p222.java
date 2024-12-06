package sec01.exam01;

public class quiz5_p222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제5
		// 합
		// 평균
		// 최대값

		int[][] array = { 
							{ 95, 86 },
							{ 83, 92, 96 },
							{ 78, 83, 93, 87, 88 }
						};

//		int sum = 0;
//		double avg = 0.0;

		// 작성위치

		// 풀이법
		// 각 배열을 모두 합쳐서 쭉 출력한다.(95, 86, 83, 92, 96, 78, 83, 93, 87, 88)

		// 출력된 값을 다 더해준다.(881)
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				sum += array[i][j]; // sum으로 합칠 값형태로 만들기
//			}
//		}
		
		// 정답 ---? sum(합) 부터 내용 못들음
		int[][] array2 =array;
		int[] a1 = array[0];
		int a00 = array[0][0];
		int a01 = array[0][1];
		
		int sum = 0;
//		sum1 = array[0][0]+array[0][1]+array[1][0];
//		sum1= sum +array[0][0];
//		sum1= sum +array[0][1];
		
		for(int i = 0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum = sum + array[i][j];
			}
		}
		System.out.println(sum);
		
		System.out.println("----------------");
		// 출력된 값을 평균내기전에 갯수를 센다.(88.1 or 88)
		int count = 0;
		int sum1 = 0;
		for(int i = 0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum1 = sum1 + array[i][j];
				count++;
			}
		}
		System.out.println((double)sum/count);
		
		System.out.println("----------------");
		
		// 출력된 값을 다시 배열로 쭉 풀어서 최대값을 구한다. (96)
		int max = -1;
		int sum2 = 0;
		for(int i = 0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum2 = sum2 + array[i][j];
				count++;
				
				if(max < array[i][j]);
				max = array[i][j];
			}
			System.out.println(max);
		}
	
System.out.println("----------------");
//		System.out.println(sum1);
//		System.out.println(avg);

	}

}
