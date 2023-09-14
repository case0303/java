package day16.stream;

import java.io.File;
import java.io.FileReader;

public class FileReadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/Java/FirstJAVA/w.txt");
		
		FileReader in = null;
		try {
			in = new FileReader(f);
			while(true) {
				int date = in.read();
				System.out.print((char)date);
				if(date == -1) {
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {in.close();} catch (Exception e2) {e2.printStackTrace();}
		}
	}

}
