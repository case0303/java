package day03.quiz;

public class Quiz230821 {

	
	
	public static void main(String[] args) {
		
		//1 100-1까지 출력해보세요
		
		for(int i = 100; i>0; i--) {
			System.out.println(i+"");
		}
		
		
		//2 1-200까지 사이의 수 중에서 (2 또는 3의 배수)가 아닌 수들의 총 합을 구해보세요.
		int sum = 0;
		for(int i = 1; i<=200; i++) {
			if(i%2 == 0 || i%3 == 0) {
				
			} else {
				sum += i;
			}	
		}
			//if(i%2 != 0 && i%3 !=0) sum += i;
		
		System.out.println("\n"+sum);
		
		
		
		// 3. 1 + (1+2) + (1+2+3) + (1+2+3+4) ... 이중 반복문을 사용하거나 규칙을 찾아보기
		
		sum = 0;
		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			sum = i;
			sum2 += sum;
		}
		System.out.println("반복문 하나로 푼 결과 :"+sum2);
		
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i != 1) System.out.print("+(");
			for(int j = 1; j <= i; j++) {
				//소괄호 안에 더하기...
				sum += j;
				System.out.print(j);
				if(j != i) System.out.print("+");
			}
			if(i!=1) System.out.print(")");
			
		}
		System.out.println("반복문 두개로 푼 결과 :"+sum);
	}
	/* 다른 방법
	 * int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
    	sum2 += i; // sum2에 i를 더하여 누적

    		System.out.print("(");
    		for(int j = 1; j <= i; j++) {
        	System.out.print(j);
        	if (j < i) {
            	System.out.print("+");
        	}
    		}
    		System.out.print(")");

    		if (i < 10) {
        	System.out.print("+");
    	}
			}
		System.out.println(" = " + sum2);
	 	*/		
		
	
		//* ** *** **** ***** 하나씩 늘어나게 그리고 하나씩줄어들게
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
