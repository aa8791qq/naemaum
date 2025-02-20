package sec02.exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExam {
// 놓침
	public static void main(String[] args) {

		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			test2();
		} catch (NumberFormatException nfe) {
			if ("123".equals(nfe.getMessage())) {
				System.out.println("애교");// 의도한 오류로 메세지 전달가능
			}
		} catch (HumanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void test() throws ClassNotFoundException, IOException {
		Class.forName("sfjskfjsdkfjlsksldfjsldfjsdjfk");
	}

	static void test2() throws HumanException {

		System.out.println(1);
		int a = 10;
		if (a < 100) {
			throw new HumanException("123");
		} else {
			throw new NumberFormatException("456");
		}
	}

//	FileInputStream fis = null;

//	fis = new FileInputStream("c:\\text.txt");

	// try-with-resource (간편)
	// close() 자동실행
	try(
	FileInputStream fis2 = new FileInputStream("c:\\text.txt");
	// Closeable 인터페이스가 있는 클래스만 넣을 수 있음
	){
		System.out.println(fis2);
	} catch(Exception e) {
		e.printStackTrace();
	}
}

}