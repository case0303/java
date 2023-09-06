package day12.exception;

public class ThrowsEx {
	private static String[] greetings = {"안녕","하이","니하오"};

	public static void doIt(int index) throws ArrayIndexOutOfBoundsException{
		System.out.println(greetings[index]);
	}
	
	public static void main(String[] args) {
		

		int i = (int) (Math.random()*4);
		try {
			doIt(i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("main에서 i가 잘못 선택 되었습니다. 다음 명령문으로 내려갑니다.");
		
			
		}
		System.out.println("다음 명령문이 실행되었습니다.");

	}

}
