package day03;

public class IfExample3 {

	public static void main(String[] args) {
		// 다중 if 문 : if(조건식) ~ else if(조건식) ~ else
		int jumsu = (int)(Math.random()*100);
		System.out.println("점수 : "+jumsu);
//		if(jumsu >= 90) {
//			System.out.println("당신의 학점은 A 입니다.");
//		} else if(jumsu >= 80){
//			System.out.println("당신의 학점은 B 입니다.");
//		} else if(jumsu >= 70){
//			System.out.println("당신의 학점은 C 입니다.");
//		} else if(jumsu >= 60){
//			System.out.println("당신의 학점은 D 입니다.");
//		} else {
//			System.out.println("당신의 학점은 F 입니다.");
//			System.out.println("재수강 입니다.");
//		}
		
		switch (jumsu/ 10) {
		case 9:
			System.out.println("당신의 학점은 A 입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B 입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C 입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D 입니다.");
			break;
		default:
			System.out.println("당신의 학점은 F 입니다.");
			System.out.println("재수강 입니다.");
			
		
		}

	}

}
