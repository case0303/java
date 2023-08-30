package day04;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// while 문
		// for 문 보다 자유도가 높은 반복문
		// for문은 (시작값; 조건; 증가값)
		// while은 조건만으로 반복처리
		
		/*
		 * (형식)
		 * while (condition){
		 * 조건이 참일때 실행할 문장
		 * }
		 */
		//증가값 위치에 따라 결과에 차이가 생깁니다.
//		int i = 0; //시작값
//		while (i < 10) { // 조건
//			//i++;   증가값 위치에 따라 결과가 달라짐
//			System.out.println(i);
//			i++;
//		}
		//while의 무한 루프
//		while (true) {
//			System.out.println(i += 10000);
//			if(i%20000 == 0)
//				continue;
//			if(i<0)
//				break;
//		}
//		
		// do - while 구문  : 거의 안씀
		// 반복할 때 무조껀 한번 이상 실행해야 하는 경우
		
		int i = 0;
		Scanner scan = new Scanner(System.in);
		
//		while((i= scan.nextInt()) != 0) { //0이 아닐때
//			System.out.println("i는 0이 아닙니다. ");
//		}
//		
		do {
			System.out.print(">");
			i = scan.nextInt();
			System.out.println("i가 0이어도 일단 한번은 실행합니다.");
		
		}while(i!=0);
		
		
		
		
		
	}

}
