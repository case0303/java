package day19.lamda;

public class LamdaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamdaIF4 f4 = (x,y) -> {
			return x*y;
		};
		System.out.println("두 수의 곱 : "+f4.cal(9, 2));
		
		f4 = (x,y) -> x+y;
		System.out.println("두 수의 합 : "+f4.cal(10, 8));
		
		f4 = (x,y) -> {
			return x/y;
		};
		System.out.println("두 수의 몫 : "+f4.cal(36, 2));
		
		f4 = (x,y) -> x%y;
		System.out.println("두 수의 나머지 : "+f4.cal(35, 12));
		
		f4 = (x,y) -> sum(x,y);
		System.out.println("두 수의 합(sum()) : "+f4.cal(10, 8));
		
	}
	
	static int sum(int x, int y) {
		return x+y;
	}
}



@FunctionalInterface
interface LamdaIF4{
	int cal(int x, int y);
}