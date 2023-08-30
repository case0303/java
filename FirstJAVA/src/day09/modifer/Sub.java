package day09.modifer;

import day09.modifer.pac.Super;

public class Sub extends Super {
	
	
	private int num5 = 50;
	public void print()
	{
		System.out.println("Super num1 = "+num1);
		System.out.println("Super num2 = "+num2);
		//System.out.println("Super num3 = "+num3);// 에러 이유 접근제한자 default
		//System.out.println("Super num4 = "+num4);// 에러 이유 접근제한자 private
		System.out.println("Super num4 = "+getNum4());
		System.out.println("Sub num5 = "+num5);
	}
	
}
