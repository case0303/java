package day10.interface_;

public class InterfaceMemberExample implements ISomething {
	
	
	
	
	
	@Override
	public void run() {// 반드시 재정의 해야함
		
		
		//My_INT = 33; //ISomething 인터페이의 파이널 변수임.
		System.out.println("run() :"+ISomething.a);
		

	}
	public static void main(String[] args) {
		System.out.println(ISomething.My_INT);
		System.out.println(InterfaceMemberExample.My_INT);
		ISomething is = new InterfaceMemberExample();
		is.run();
		InterfaceMemberExample im = new InterfaceMemberExample();
		im.run();
	}

}
