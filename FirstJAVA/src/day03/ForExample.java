package day03;

public class ForExample {

	public static void main(String[] args) {
		/* 반복문(Loop) : for , while, do ~ while
		 * for문 : 회차가 정해진 경우에 사용
		 * 
		 * 	for(초기값;conditon;증가값){
		 * 		조건(condition)이 참인 경우 반복할 문장;
		 * }
		 * 
		 */
		
		//기본형
		//초기값은 for문에 사용할 변수의 초기 값을 의미함
		for (int i = 0; i < 10; i++) {
			System.out.println("i의 값 : "+i);
		}
		// 초기값과 증가값의 위치는 변경이 가능하다.(단, 보기 좋지는 않음)
		int i = 0 ;
		for(;i < 10;) {
			//반복구문 내에서 증감
			System.out.println("i의 값"+ i); // i++으로도 가능
			i++; //증감
		}
		// 예제 1) for문을 사용하여 1부터 10까지 숫자들의 합을 구하라.
		int sum = 0;
		for(i = 1; i <= 10; i++ ) {
			sum += i;
			
		}
			System.out.println("합은 :"+sum);
		int quiz = 0;
		for(i=1; i<=100; i += 2) {
			System.out.println(i);
			quiz += i;
		}
		System.out.println("합은 :"+quiz);
		
		int sum1 = 0;
		for(i=1; i<=100; i++) {
			if(i%2 == 1) {
				sum1 += i;
			}
		}
		System.out.println("합은 :"+sum1);
		
	}

}
