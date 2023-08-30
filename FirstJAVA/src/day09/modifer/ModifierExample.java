package day09.modifer;

import day09.modifer.pac.Super;

public class ModifierExample {
	
	/*
	 * 	Modfier			Same Class		Same Package	other package &  other package
	 * 													Sub Class		 (전체)	
	 * 												
	 * ==================================================================================
	 *   public				0				0				0				0
	 * 	 protected			0				0				0				X
	 * 	 default			0				0				X				X
	 * 	 private			0				X				X				X
	 * 
	 *  접근제한자는 클래스와 클래스 변수 , 메서드 , 생성자 등의 접근을 제어할 수 있는 제한자.
	 *  (클래스의 경우에는 public과 default(공백)만 가능함. 단, 내부 클래스는 4가지 접근 제한자 다 가능함)
	 * 
	 * 
	 * 
	 */
	
	
	
	

	public static void main(String[] args) {
		System.out.println("=======Super 참조 ========");
		Super sup = new Super();
		System.out.println("num1 =" + sup.num1+ //public
						//	"\tnum2"+sup.num2+	//protected
						//	"\tnum3"+sup.num3+	//default
							"\tnum2"+sup.getNum4()); // public method(private)
		
		System.out.println("======Sub 참조======");
		Sub sub = new Sub();
		sub.print();
		
		
		
		
	}

}
