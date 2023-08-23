package day03;

public class InnerForExample {

	public static void main(String[] args) {
		// 이중(다중) for구문
		for(int i = 0; i < 10; i++) {
			System.out.println("==========바깥쪽 반복문"+i);
			
			for(int j = 0; j < 10; j++) {
				System.out.println("-----------안쪽 반복문"+i+"-"+j);
				
				for(int k = 0; k < 2; k++) {
					System.out.println("-----------제일 안쪽 반복문"+i+"-"+j+"-"+k);
				}
			}
		}
		
		
		
		
		
		//예제 for을 이용하여 구구단 출력
		// 2단부터 9단까지 각 단마다 x1 - x9까지
		int sum = 0;
		for(int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			
			for(int j = 1; j <= 9; j++) {
				sum = i*j;
				System.out.println(i+"x"+j+"="+sum);
				
			}
		}
		
		for(int x=2; x< 10; x++) {
			System.out.println(x+"단출력");
			for(int y=1; y < 10; y++ ) {
				System.out.println(x+"x"+y+ "="+(x*y));
			}
		}
		
		//
		
		
		
		
		
		
		
		
	}

}
