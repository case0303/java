package day12.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class AutoResourceManagerEx {

	public static void main(String[] args) {
		
		try(FileInputStream in = new FileInputStream("a.txt")){
			//지역변수이므로 벗어나면 자동으로 데이터를 정리함
			System.out.println("read data : "+in.read());
		} catch (NullPointerException | IOException ex) {
			//System.out.println(in); //in은 변수 참조 못함
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}
		
		
		FileInputStream in2 = null;
		try {
			in2 = new FileInputStream("a.txt");
			System.out.println("read data : "+ in2.read());
		} catch (NullPointerException ex) {
			 	System.out.println("예외처리합니다.");
			 	System.out.println(ex.toString());
		} catch (IOException ex) {
			System.out.println(in2);
			System.out.println("예외처리합니다.");
			System.out.println(ex.toString());
		} finally {
			try {
				in2.close();
			} catch (IOException e) {
				
			}
		}

	}

}
