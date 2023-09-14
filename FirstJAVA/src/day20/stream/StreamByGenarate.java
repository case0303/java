package day20.stream;

import java.util.stream.Stream;

public class StreamByGenarate {

	public static void main(String[] args) {
		// generate() 메서드를 이용한 스트림 객체 생성
		
		// 리미트 설정 10개 ... 리미트 설정하지 않으면 무한 반복 스트림 크기 제한이 없기 때문에
		Stream<String> stream = Stream.generate(() -> "애국가").limit(10);
		
		
		//내부반복자로 출력
		stream.forEach(s -> System.out.println(s+" "));

	}

}
