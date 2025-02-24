package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "c:\\temp\\test.txt";
		
		try(
			InputStream is = new FileInputStream(path);
		){
			
//			int BUFFER_SIZE = 1024*8;
			int BUFFER_SIZE = 10;
			byte[] datas = new byte[BUFFER_SIZE]
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
