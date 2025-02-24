package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "c:\\temp2";
		String fileName = "test.txt";

//		OutputStream os2 = new FileOutputStream(path +"\\"+fileName);
		OutputStream os = null;
		try {
			os = new FileOutputStream(path + System.getProperty("file.separator") + fileName);

			String data = "abc\n한글\n123";
			byte[] datas = data.getBytes();

			// 쓰기
			os.write(datas, 0, datas.length);
			os.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 운영체제에 맞는 설정(값)으로 바꿔줌
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close(); // 오류가 났을 때 클로즈를 강제로 시켜주기 위해서 여기에 쓴다.(finally)
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		// try-with-resources
		try(
				OutputStream os4 = new FileOutputStream(path +"\\"+fileName)
		){
			String data = "abc\n한글\n12333333";
			byte[] datas = data.getBytes();

			// 쓰기
			os4.write(datas, 0, datas.length);
			os4.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
