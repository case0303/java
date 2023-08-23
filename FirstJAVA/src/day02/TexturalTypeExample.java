package day02;

public class TexturalTypeExample {

	public static void main(String[] args) {
		char one = 'a';
		char two = '\t'; // 탭 간격을 나타내는 문자
		
		/*
		 * '\n' : 줄바꿈(New Line(\u000A)
		 * '\t' : Tab(8자리)(\u0009)
		 * '\b' : Backspace(\u0008)
		 * '\r' : Return(\u000D)
		 * '\f' : Form Feed(\u000D)
		 * '\\' : Backslash(\u005D)
		 * '\'' : single Quote(\u0027)
		 * '\"' : Double Quote(\u0022)
		 */
		
		
		char three = '\uAc00'; //16진수 4자리  입력 한글 '가'
		String four = "\uD604\uC218";
		String five = "dream";
		System.out.printf("%c, %c, %c, %s, %s", one,two,three,four,five);
		
		
		/*
		 * String 클래스를 이용한 변수 선언
		 * String s1 = "Hello";
		 * String s2 = new String("hello"); // 객체 생성
		 * String s3; // default값은 null
		 * String s4 = ""; // null String, 길이 0
		 * String s5 = " "; // blank String 길이 1
		 * 
		 * 문자열과 다른 타입을 "+"를 되면 무조껀 문자열로 변환
		 * ex) 100+200 > 300 , 100+"200" > 100200
		 * 10+20+"hello" > 30hello
		 * "hello"+10+20 > hello1020
		 * 
		 */
		
		
		//char 문자형은 정수 0 ~65535의 범위 값을 가짐
		//char t1 = 'A'+ 100;
		int t2 = 'A';
		System.out.printf("\nt1에 A의 값 : %d",t2);
		
		
		
		
		
		
	}

}
