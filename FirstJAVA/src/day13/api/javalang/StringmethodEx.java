package day13.api.javalang;

import java.util.Iterator;

public class StringmethodEx {

	public static void main(String[] args) {
		// String 메서드 사용 예제
		String str = "hello world! 123456789";
		System.out.println(str);
		
		// 1.subsrting : 문자열을 원하는 만큼 자르는 메서드
		System.out.println(str.substring(0));
		System.out.println(str.substring(1));
		System.out.println(str.substring(2));
		System.out.println(str.substring(3));
		System.out.println(str.substring(4));
		
		//시작부터 끝 전까지
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(4));
		// world!만 출력
		System.out.println(str.substring(6, 12));
		
		// 2.split : 문자열을 원하는 기준으로 자른다 - > 배열로 반환
		
		str = "apple/banana/kiwi/lemon/orange/o";
		String[] fruit = str.split("/");
		
		for(int i = 0; i<fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		// 3. indexOf : 원하는 문자의 인덱스를 반환(못찾는경우 값 -1)
		int orange_index = str.indexOf("orange");
		System.out.println("오렌지위치 : "+orange_index);
		System.out.println("첫번째 o의 위치 : "+str.indexOf('o'));
		System.out.println("두번째 o의 위치 : "+str.indexOf('o',str.indexOf('o')+1));
		
		// 4. charAt : 원하는 위치의 문자를 가져옴
		
		char ch = str.charAt(str.indexOf("orange"));
		String orange = str.substring(
		        str.indexOf("orange"),
		        str.indexOf("orange") + "orange".length());
		System.out.println(ch);
		System.out.println(orange);

		//5. contain : 해당 문자가 문자열에 포함되어 있는지 체크합니다.
		if(str.contains("apple")) {
			System.out.println("사과도 과일이군요");
		}else {
			System.out.println("사과는 과일이 아니군요.");
		}
		
		//6. length() - 문자열 길이
		//7. equals() - 문자열 비교
		
		//8. replace() - 원하는 문자를 치환
		
		str = "abc@naver.com";
		
		str = str.replace("naver", "microsoft");
		str = "abc@naver.com";
		str = str.replaceFirst("naver", "microsoft");
		//두번째 문자열을 바꾸길 원하면 indexOf를 사용
		System.out.println(str);
		
		
		
		//8.lastIndexOf : 해당 문자열의 뒤에서부터 찾아서 위치를 반환
		
		str = "abcd    dcba";
		System.out.println("indexOf(d) : "+str.indexOf("d"));
		System.out.println("indexOf(d) : "+str.lastIndexOf("d"));

		
		//9. toUpperCase, toLowerCase : 대/소문자 변환
		
		String email = "abc1234@NaVeR.CoM";
		str = "naver.com";
		
		email = email.toLowerCase();
		System.out.println(email.contains(str));
		
		//10.trim : 문자열 바깥 쪽 공백 제거
		
		String id_1 = "    abc     123   ";
		String id_2 = "  abc     123     ";

		System.out.println("before1 : "+id_1);
		System.out.println("before1 : "+id_2);
		
		System.out.println("eqauls : "+id_1.equals(id_2));
		
		id_1 = id_1.trim();
		id_2 = id_2.trim();
		//양쪽에 공백을 지워서 서로가 같게 된다.
		System.out.println("after1 : "+id_1);
		System.out.println("after2 : "+id_2);
		// 즉 문자열 비교시 true가 나오게 된다.
		System.out.println("eqauls : "+id_1.equals(id_2));

		
		//11.format : 서식 문자열을 이용하여 문자열을 만들어서 반환
		str = String.format("%d,%d,%d",13,45,94);
		System.out.println(str);
		
		//12.endsWith : 지정된 문자로 끝나는지 검사(확장자 등을 체크할때 사용)
		str = "오늘할일.html";
		
		if(str.endsWith(".txt")) {
		 System.out.println("확장자가 올바른 텍스트 텍스트 파일입니다.");
		}else if(str.endsWith(".html") || str.endsWith(".htm")) {
			System.out.println("웹 페이지입니다.");
		}else {
			System.out.println("텍스트 파일이 아닙니다.");
		}

	}

}
