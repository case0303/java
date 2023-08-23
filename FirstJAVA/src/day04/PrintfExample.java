package day04;

public class PrintfExample {

	public static void main(String[] args) {
		// print(), printf(), println()
		
		//System.out.print() : 전달 받은 데이터를 console에 출력
		//System.out.println() : 전달 받은 데이터를 console에 출력
		//마지막에 '\n'(줄바꿈)이 추가됨
		//System.out.printf() : 출력 형식(format)을 먼저 지정한 뒤
		//형식에 포함된 서식 문자의 값을 대입하여 원하는 문자열을
		//편리하게 출력 할 수 있게 함
		
		/*
		 * - 서식 문자 종류
		 * %d : 10진수 정수
		 * %o : 8진수 정수
		 * %x : 16진수 정수
		 * %s : 문자열
		 * %f : 실수
		 * %c : 문자
		 */
		
		//정수 출력
		int a = 5, b = 7;
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		
		System.out.printf("%10d\n", a); // %-d사이의 숫자는 출력 공간 확보
		System.out.printf("%20d\n", a);
		System.out.printf("%020d\n", a); // 숫자 앞 0은 빈곳을 0으로 채움
		System.out.printf("%-10d??\n", a); // 10칸 확보 후 출력, 왼쪽 정렬 (- 기호)
		System.out.printf("%+10d\n",-7); // 숫자 앞 "+"는 부호 출력
		System.out.printf("%+-10d\n",-7); // 숫자 앞 "+"는 부호 출력
		
		// 실수 충력
		double d = 1234.56789;
		System.out.printf("%f\n",d);
		System.out.printf("%.3f\n",d);//.숫자는 소숫점 숫자만큼 출력 
		System.out.printf("%20.3f\n",d); // .숫자는 소숫점 숫자만큼 출력 
		System.out.printf("%020.3f\n",d);// 20칸 확보. 앞 여백에 0으로 채움 . 소숫첨 3까지
		System.out.printf("%-20.3f\n",d);// 20칸 확보 왼쪽 정렬 소숫점 3까지
		
		String str = "Hello world!";
		System.out.printf("%s\n",str);
		System.out.printf("%30s\n",str);
		System.out.printf("%-30s%s\n",str,str);
		
	}

}
