package day04.quiz;

public class ForStarExample2 {

	public static void main(String[] args) {
		// 피라미드 찍기
		/*
		     *		*********
		    ***      *******
		   *****      *****
		  *******      ***
		 *********      *
		 */
		int dan = 5;
		
		for(int i = 0; i < dan; i++) { // i 값 0 1 2 3 4
		    // 공백 삽입
		  
			for(int j = 0; j < dan - i - 1; j++) { // and- i -1 => 4 3 2 1
		        System.out.print(" ");
		    }
		    for(int j = 0; j < i*2+1; j++) { // i+1 => 1 2 3 4 5
		        System.out.print("*");
		    }
		    System.out.println(" ");
		}
		
		for (int i = dan - 1; i >= 0; i--) { // i 값 4 3 2 1 0
		    // 공백 삽입
		    for (int j = 0; j < dan - i - 1; j++) { // dan - i - 1 => 0 1 2 3 4
		        System.out.print(" "); // j 값에 따라 공백 출력
		    }
		    for (int j = 0; j < i * 2 + 1; j++) { // i * 2 + 1 => 9 7 5 3 1
		        System.out.print("*"); // j 값에 따라 * 출력
		    }
		    System.out.println(" ");
		}
		
		
		// 풀이
		
		dan = 5;
		// 피라미드
		for(int i= 0; i < dan; i++) {
			for(int j=0; j<dan-i-1;j++) {
				 System.out.print(" ");
			}
			for(int j=0; j < i*2+1; j++) {
				System.out.print("*");
			}
			 System.out.println(" ");
		}
		// 역피라미드
		for(int i = 0 ; i < dan; i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*dan-(2*i)-1;j++) { //9
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		

	}

}
