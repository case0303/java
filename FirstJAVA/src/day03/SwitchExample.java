package day03;

public class SwitchExample {

	public static void main(String[] args) {
		// switch(수식) ~ case 구문
		
		int jumsu = (int)(Math.random() * 100);
		System.out.println("점수 : "+jumsu);
		
		//Switch
		switch (jumsu / 10) {
		case 9 :
			System.out.println("당신의 학점은 A 입니다.");
			break; // switch 구문에서 나가야함
		case 8 :
			System.out.println("당신의 학점은 B 입니다.");
			break;
		case 7 :
			System.out.println("당신의 학점은 C 입니다.");
			break; 
		case 6 :
			System.out.println("당신의 학점은 D 입니다.");
			break; 
		default :
			System.out.println("당신의 학점은 F 입니다.");
			System.out.println("재수강");
			break;
		}
		
		
		int i = (int) (Math.random() * 100) + 1;
		System.out.println("점수 : "+i);
		if(i % 2 == 0 ) {
			System.out.println("짝수입니다.");
			
		} else {
			System.out.println("홀수입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//
	}

}
