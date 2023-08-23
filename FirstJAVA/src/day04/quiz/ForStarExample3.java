package day04.quiz;

import java.util.Scanner;

public class ForStarExample3 {

	public static void main(String[] args) {
		// 다이아몬드 찍기
		/*
					*
				   ***
				  *****
				 *******
				*********
				 *******
				  *****
				   ***
				    *		
		 */
		int dan = 5;
		
		for (int i=0; i < dan; i++) {
			for(int j=0;j<dan-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0;i<dan-1;i++) {
			for(int j=0; j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*(dan-i-1)-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("줄수를 입력하세요.");
		dan = scan.nextInt();
		int sp = dan/2;
		int star = 1;
		boolean flag = true;
		
		for(int i=0; i<dan; i++) {
		
			for(int j=0; j<sp;j++) {
				System.out.print(" ");
			}
			for(int j=0; j < star; j++) {
				System.out.print("*");
				/*
				 //처음과 끝만 * 나머지는 공백 
				 if(j==0 || j==star-1){
				 System.out.print("*");
				 } else {
				  System.out.print(" ");
				 }
				 
				 //안쪽 2칸마다 $출력
				 if(j==0 || j==star-1){
				 System.out.print("*");
				 } else {
				 	if(j%2 == 0) System.out.print("$");
				 	else System.out.print(" ");
				 }
				  
				 
				 */
			}
			System.out.println();
			
			if(i==(dan/2)) flag =false; //반전을 위한 중간값 체크
			if(flag) { //플래그 기법 불린 알고리즘
				sp -= 1; star += 2;
			} else {
				sp += 1; star -= 2;
			}
		}
		scan.close();
		
		
		

	}

}
