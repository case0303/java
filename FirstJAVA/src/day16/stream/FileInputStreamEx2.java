package day16.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		
		// 입력 스트림 객체 생성
		InputStream fis = null;
		
		try {
			
			//입력 스트림 객체 선언
			fis = new FileInputStream("/Users/eongdeong-ihaejeogdan/Desktop/Develop/Java/FirstJAVA/test.txt");
			
			//입력한 데이터를 저장할 변수 선언
			byte[] buffer = new byte[256];
			int readCount = fis.read(buffer);//처음 블록 읽기
			while(readCount != -1) { //-1이 아니면 데이터가 있다.
				String data = new String(buffer);
				System.out.println(data);
				readCount = fis.read(buffer);
			}
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
