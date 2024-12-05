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

		int sum = 0;
		double avg = 0.0;

		// 작성위치

		// 풀이법
		// 각 배열을 모두 합쳐서 쭉 출력한다.(95, 86, 83, 92, 96, 78, 83, 93, 87, 88)

		// 출력된 값을 다 더해준다.(881)
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum += array[i][j]; // sum으로 합칠 값형태로 만들기
			}
		}
		System.out.println(sum);
		// 출력된 값을 평균내기전에 갯수를 센다.(88.1 or 88)
		// 출력된 값을 다시 배열로 쭉 풀어서 최대값을 구한다. (96)

		System.out.println(sum);
		System.out.println(avg);

	}

}
