package day12.exception;

import java.io.IOException;

//Checked Exception의 경우에는 반드시 예외처리해야합니다.
// 올바르게 설계 되어ㅗ 있더라도 사용자가 잘못된 값을 입력하면 예외가 발생할 수 있음.
// ex) IOException , FileNotFoundException , SQLException


public class CheckedEx {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("값을 입력 받는 프로그램!!");
		
		byte[] data = new byte[100];//한번에 100byte씩 읽겠다는 의미
		
		try {
			System.in.read(data);
		} catch (IOException ie) {
			ie.printStackTrace();
			}
		
		
		
		System.out.print("입력한 문자열은 : ");
		System.out.println(new String(data).trim());
		
	}





}

