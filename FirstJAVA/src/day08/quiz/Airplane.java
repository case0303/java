package day08.quiz;

public class Airplane {
	
	
			//멤버변수
			String name;
			// 생성자
			public Airplane(String name){
				this.name = name;
			}
			//메서드
			void takeOff () {
				System.out.println("이륙합니다.");
			}
			void fly () {
				System.out.println("일반모드로 비행");
			}
			void land () {
				System.out.println("착륙합니다.");
			}

}
