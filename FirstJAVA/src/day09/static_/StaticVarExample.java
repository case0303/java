package day09.static_;

public class StaticVarExample {

	public static void main(String[] args) {
		
		
		Count c1 = new Count();
		
		c1.a++;
		c1.b++;
		
		System.out.println("Non-static a : " + c1.a); //1
		System.out.println("static b : " + c1.b); //1
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("Non-static a : " + c2.a);//1
		System.out.println("static b : " + c2.b);//2
		
		Count.b++;
		System.out.println("c1.b :  "+c1.b);//3
		System.out.println("c2.b :  "+c2.b);//3
		System.out.println("count b :  "+Count.b);//3
	}

}
