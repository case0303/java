package day20.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		
		//배열을 이용한 스트림 생성하기
		
		// 문자열 배열 객체 생성
		String[] arr = new String[] {"a","b","c","d","e","f"};
		
		// 배열 전에 스트림 객체 변환
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		//인덱스 지정해서 변환
		// 두번째 사용된 인덱스는 포함 x
		Stream<String> stream2 = Arrays.stream(arr,2,5);
		stream2.forEach(s -> System.out.print(s+" "));
		
		
	}
	

}
