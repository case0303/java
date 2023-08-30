package day05.quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// 대문자가 입력된다면 소문자로 출력하고 
		// 소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해보세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		char ch  = scan.nextLine().charAt(0);
		
		if(ch >='A' && ch <='Z') {
			ch = (char)(ch - 'A' + 'a'); // B
		}else if(ch>='a' && ch<='z') {
			ch = (char)(ch - 'a' + 'A');
		}
		System.out.println(ch);
		
//		String.toUpperCase() 문자열을 대문자 문자열 변경
//		String.tolowerCase() 문자열을 소문자 문자열로 변경
		System.out.println("Hello, world!".toUpperCase());
		System.out.println("Hello, world!".toLowerCase());
		
		
		// 커피의 가격은 2000원 , 10개 이상 구매하면 초과분에 대해서
		//커피는 1500원을 받는다.
		//커피의 개수를 입력받고 총 가격이 얼마인지 개선하여 출력하는
		//프로그램을 만들어보세요.
		
		int sum = 0;
		int price = 0;
		System.out.print(">");
		int count = scan.nextInt() ;
		
		
		for(int i = 0; i <count; i++ ) {
			if( i > 9 ) {
				price = 1500;
				
			} else {
				price = 2000;
			}
			sum += price;
		}
		System.out.println("커피의 개수는"+count+"입니다.");
		System.out.println("커피의 총 가격은"+sum+"입니다.");

	}

}
