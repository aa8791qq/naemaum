package quiz;

public class SongExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 필드 복습중
		// song 클래스를 생성
		// 제목과 가수명을 넣고 제목, 가수명, 좋아요 수를 출력
		Song song1 = new Song(); // 클래스명 생성 실수.
		song1.title /* 변수 */ = "home sweet home";
		song1.singer = "G-Dragon";

		System.out.println(song1.title);
		System.out.println(song1.singer);
		System.out.println(song1.clike);

		Song song2 = new Song();
		song2.title = "APT";
		song2.singer = "로제";

		System.out.println(song2.title);
		System.out.println(song2.singer);
		System.out.println(song2.clike);

		// song3은 setTitle()을 이용하기
		Song song3 = new Song();
		song3.setTitle("Whiplash"); // 담을 수 없음
		System.out.println(song3.title);
//		System.out.println(song3.singer);

		song3.plus(3.5, 7.5);
//		double a = song3.plus(1,5);
//		double b = song3.plus(a,7);
	}
	System.out.println();
}