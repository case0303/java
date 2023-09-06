package day13.api.javalang;

public class StringBuilderEx {

	public static void main(String[] args) {
		// 스트링 빌더의 주요 메서드 확인
		String str = "hello, world! 1234567890";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("스트링빌더에 있는 문자열 : "+sb);
		
		//1.append : 문자열 뒤에 문자열 추가
		sb.append(10);
		System.out.println("append(10)의 결과 :"+sb);
		sb.append(true);
		System.out.println("append(true)의 결과 :"+sb);
		
		
		//2.insert : 특정 위치에 문자열 추가
		sb.insert(7, "insert합니다.");
		System.out.println("insert 결과 :"+sb);
		
		//3.delete : 문자열을 삭제
		sb.delete(sb.indexOf("insert"),sb.indexOf("insert")+"insert합니다.".length());//시작 인덱스, 끝 인덱스
		System.out.println("delete결과 :"+sb);
		
		//4.deleteCharAt() : 특정 인덱스에 문자하나를 삭제합니다.
		sb.deleteCharAt(12); // ! 삭제(12번)
		System.out.println("deleteCharAt 결과 :"+sb);
		
		//5.setCharAt() : 문자열의 주어진 인덱스의 문자를 다른 문자로 대체합니다
		sb.setCharAt(12, '!'); 
		System.out.println("setCharAt(12, '!'); 결과 :"+sb);
		
		//6.replace() : 문자열의 일부분을 다른 문자열로 대체합니다.
		sb.replace(12, 14, "! 1");
		System.out.println("replace 결과 :"+sb);
		//7.reverse() : 문자열을 거꾸로 뒤집습니다.
		sb.reverse();
		System.out.println("reverse 결과 :"+sb);
	}

}
