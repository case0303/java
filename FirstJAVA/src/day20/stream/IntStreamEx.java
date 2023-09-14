package day20.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx {

	public static void main(String[] args) {
		//IntStream의 range(), rengeClosed() 메서드 사용
		
		int[] arr = { 1, 2,3,4,5,6,7,8,9,10};
		System.out.println("Arrays.stream() IntStream 생성하기");
		IntStream IS = Arrays.stream(arr);
		IS.forEach(s -> System.out.print(s +"\t"));
		System.out.println();
		
		System.out.println("IntStream.of() IntStream 생성하기");
		IntStream IS2 = IntStream.of(arr);
		IS2.forEach(s -> System.out.print(s +"\t"));
		System.out.println();
		
		// 두번째 매개변수 인덱스 포함 안함 .
		System.out.println("IntStream.range(1,6) IntStream 생성하기");
		IntStream IS3 = IntStream.range(1, 6);
		IS3.forEach(s -> System.out.print(s +"\t"));
		System.out.println();
		
		//두번째 매개변수 인덱스값포함
		System.out.println("IntStream.rangeClosed(1,5) IntStream 생성하기");
		IntStream IS4 = IntStream.rangeClosed(1, 5);
		IS4.forEach(s -> System.out.print(s +"\t"));
		System.out.println();
	
	}

}
