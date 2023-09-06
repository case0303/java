package day12.exception;

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 0;
			String[] greetings = {"안녕하세요", "반갑습니다." , "또 오세요"};
			
		while (i<4) {
			
			try {
				//예외 발생 가능한 코드 부분
				System.out.println(greetings[i]); 
			} catch (ArrayIndexOutOfBoundsException e) {//예외에 대해서 정리
				// 예외 발생시 처리 코드 부분
				 System.out.println("예외가 발생했습니다.");
				 System.out.println("예외가 발생한 원인은 : "+e.getMessage());
				 System.out.println("예외 처리를 완료 했습니다.");
			} finally {
				 System.out.println("finally는 항상 실행 됩니다..");
			}
			i++; //반복문의 제어 (증감을 통한)
			
		}//while 문의 끝
		 System.out.println("메인의 마지막입니다.");
	}

}
