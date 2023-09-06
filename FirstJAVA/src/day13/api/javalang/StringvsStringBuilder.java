package day13.api.javalang;

public class StringvsStringBuilder {

	public static void main(String[] args) {
		// 성능 비교!!
		long start, end;
		start = System.currentTimeMillis();
		
		String str = "A";
		for(int i=0; i<300000; i++) {
			str = str + "A";
		}
		end = System.currentTimeMillis();
		
		System.out.println("String : "+(end-start)*0.001+"초");
		
		
		// StringBuilder A 붙이기
		start = System.currentTimeMillis();
		
		StringBuilder sb =new StringBuilder("A");
		for(int i=0; i<300000; i++) {
			sb.append("A");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuilder : "+(end-start)*0.001+"초");
	}

}
