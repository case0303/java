package day12.exception;

public class ThrowsEx2 {
	private static String[] greetings = {"안녕","하이","니하오"};

	public static void doIt(int index) throws ArrayIndexOutOfBoundsException{
		try {
			System.out.println(greetings[index]);
		} catch (Exception e) {
			System.out.println("잘못된 인덱스 입니다.");
			e.printStackTrace(); //잘못된 오류를 보여줌
		}
	}
	public static void main(String[] args) {
		

		int i = (int) (Math.random()*4);
		doIt(i);
		System.out.println("다음 명령문이 실행되었습니다.");

	}

}
