package day03.array;

public class PrimtiveArrayExample {

	public static void main(String[] args) {
		char[] s; //Primitive형 배열 선언
		// char[5] s; //오류 - 선언 시 크기 명시 못함
		s = new char[5]; // Primitive형 배열 생성 "\u0000"
		s[0] = 'A'; // [숫자] -> 숫자는 인덱스로 0부터 시작
		s[1] = 'B';
		s[2] = 'C';
		s[3] = 'D';
		s[4] = 'F';
		// char[] s = {'A', 'B', 'C', 'D', 'F'}; // 압축형
		
		for (int i=0; i <s.length; i++) {//s.length의 길이
			System.out.println(s[i] + "\t");
		}		

	}

}
