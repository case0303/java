package day13.api.javalang;

public class SystemEx {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("시작 시간 : "+start);
		System.out.println( System.getProperties());
		
		//시간 지연
		int a = 0;
		for(int i = 0; i<1000;i++) {
			
			a+=i;
		 
		}
		long end = System.currentTimeMillis();
		System.out.println("종료 시간 : "+end);
	}

}
