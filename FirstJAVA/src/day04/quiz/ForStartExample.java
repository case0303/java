package day04.quiz;

public class ForStartExample {

	public static void main(String[] args) {
		/*
		 	*		*****		*	*****
		 	**		****	   **	 ****
		 	***		***		  ***	  ***
		 	****	**		 ****	   **
		 	*****	*		*****	    *
		 */
		
//		int dan = 5;
//		for(int i = 0; i < 5; i++ ) {
//			
//			for(int j=0; j<=i; j++) {
//				System.out.print("ㅗ");
//			}
//			System.out.println("");
//		}
//		
//		
//		System.out.println("");
//		
//		
//		for(int i = 5; i > 0; i-- ) {
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print("ㅗ");
//			}
//			System.out.println("");
//		}

		
		
		
		int dan = 5;
//		for(int i = 0; i < dan; i++) {
//			for(int j=0; j<i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");//줄바꿈
//		}
//		
//		System.out.println(" ");//줄바꿈
//		// 내 풀이
//		dan = 1;
//		
//		for(int i = 6; i > dan; i--) {
//			for(int j=0; j<i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");//줄바꿈
//		}
//		//학원 풀이
//		
//		System.out.println(" ");//줄바꿈
//		
//		dan = 5;
//		for(int i = 0; i< dan; i++) {  		//0 1 2 3 4    	i
//			for(int j = 0; j < dan-i; j++) {// 5 4 3 2 1    dan - i
//				System.out.print("*");
//			}
//			// for (int j = dan; j > 0; j--) //5 4 3 2 1
//			System.out.println(" ");//줄바꿈
//		}
//		
//		// 3번째 풀이
//		
		for(int i = 0; i < dan; i++) {
		    // 공백 삽입
		    for(int j = 0; j < dan - i - 1; j++) { // and- i -1 => 4 3 2 1
		        System.out.print(" ");
		    }
		    for(int j = 0; j < i + 1; j++) { // i+1 => 1 2 3 4 5
		        System.out.print("*");
		    }
		    System.out.println(); // 줄바꿈
		}
//		//4번 풀이
//		System.out.println(); // 줄바꿈
//		for(int i = 0; i < dan; i++) { // i 값 0 1 2 3 4
//		    // 공백 삽입
//		  
//		    for(int j = 1; j < i + 1; j++) { // 1 2 3
//		        System.out.print(" ");
//		    }
//		    for(int j = 0; j < dan - i; j++) { // and- i -1 => 4 3 2 1
//		        System.out.print("*");
//		    }
//		    System.out.println(); // 줄바꿈
//		}
//		//4번 해석 틀린거 찾기
//		for(int i = 0; i < dan; i++) { //0 1 2 3 4 
//			for(int j=0; j < i; j++) { // i= 0
//				System.out.print(" ");
//			}
//			for(int j=0; j<i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");//줄바꿈
//		}
		
		

	}

}
