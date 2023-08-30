package day09.static_;

public class Staticinit {
			
	
			static {//생성자가 실행되기 전 static 변수 초기화, 객체를 여러번 생성해도 한번만 실행(생성자와 다름)
				System.out.println("static inintializer가 수행됩니다. " );
				
			}
			public Staticinit() {
				System.out.println("Constructor 호출됨");
			}
	
	
}
