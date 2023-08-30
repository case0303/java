package day04.quiz;

import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {
		// 1.소수(PrimeNumber) 구하기
		// 소수는 1과 자기 자신만으로 나누어지는 수를 말함.
		// 조건문과 반복문을 사용하려 100 이하의 소수를 출력해 보세요.
		// (for문 안에 for문)
		System.out.println("======= Prime Number =======");
		int cnt =0;
		
		for (int i =2; i <= 100; i++) {
			cnt = 0; // 배수여부 확인
			
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					cnt++;
				}
				
			}
			if(cnt == 2) {
				System.out.print(i + " ");
			}	
			
		}
		
		// 2.단어 거꾸로 출력하기 (reverse 출력)
		// 자바의 Scanner 객체를 이용하여 콘솔에 데이터를 입력
		// 입력된 데이터를 for문을 사용하여 거꾸로(reverse) 출력하세요.
		// (String.charAt(index)를 사용
		System.out.println("\n=====입력값 거꾸로 출력하기=====");
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		for(int i = str.length(); i>0; i--) { //str.length는 문자열 길이
			System.out.println();
			System.out.print("i의 값"+i);
			System.out.println();
			System.out.print(str.charAt(i-1));
		}
		
		// 3.로또 번호 추출하기
		// 앞서 배운 난수를 활용하여, 중복 되는 번호 없이 1-45 까지의 숫자중 
		// 6개의 숫자를 랜덤 추출하고 콘솔에 출력하세요.
		// (while 문에 for)
		
		System.out.println("======로또 추출======");
		
		int[] lotto = {0,0,0,0,0,0};
		
		int index = 0; //index와 비교하기 위해서
		
		while(true) {
			//랜덤 값 생성
			int rand = (int)(Math.random()*45)+1; //1 - 45 
			int i = 0;
			for(i=0; i<index;i++) {
				if(rand == lotto[i]) { //추첨된 번호가 중복됨
					break;
				}
			}
			if(index == i) { // 추첨된 번호에 있지 않음
				lotto[index++] = rand;
			}
			if(index > 5) break;
		}
		
			//결과 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]+"\t");
		}
		
		
	}

}
