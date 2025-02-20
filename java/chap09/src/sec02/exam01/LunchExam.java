package sec02.exam01;

public class LunchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lunch lunch = new Lunchimpl();
		lunch.order(null);

		// 놓침
		Lunch lunch2 = new Lunch() {
			int a = 10;

			void test() {

			}

			@Override
			public int order(String menu) {
				// TODO Auto-generated method stub
				return 0;
			}

		};

		lunch2.order(null);
	}
}
