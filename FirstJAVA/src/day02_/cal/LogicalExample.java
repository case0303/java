package day02_.cal;

public class LogicalExample {

	public static void main(String[] args) {
		// 논리 연산자 ^, &, | , &&, ||
		int x=10, y= 20;
		System.out.println("+(x !=10)&(++y == 21)의 결과:"+ ((x != 10)&(++y == 21)));
		System.out.println("x:"+x+"y:"+y);

		System.out.println("+(x == 10)|(++y == 21)의 결과:"+ ((x == 10)|(++y == 21)));
		System.out.println("x:"+x+"y:"+y);
		//숏컷 연산
		int a=10,b=20;
		System.out.println("+(a !=10)&&(++b == 21)의 결과:"+ ((a != 10)&&(++b == 21)));
		System.out.println("a:"+a+"y:"+b);
		
		System.out.println("+(a == 10)&&(++b == 21)의 결과:"+ ((a == 10)&&(++b == 21)));
		System.out.println("a:"+a+"b:"+b);
		

	}

}
