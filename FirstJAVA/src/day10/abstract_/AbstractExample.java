package day10.abstract_;

//자바에서의 abstract의 의미
//사용자 정의 클래스를 정의할 때, 굳이 abstract를 설계할 필요는 없다.
//하지만 , 자바 내부의 많은 클래스는 abs클래스로 정의되어 있습니다.
//또헌 자식 클래스로 생성해서 부모클래스(추상 클래스)에 저장해서 사용 가능하다는 점에서 익숙해져야합니다.




public class AbstractExample {

	public static void main(String[] args) {

		Shape circle = new Circle(10);
		
		
		System.out.println("원의 넓이는 : "+circle.getArea());
		System.out.println("도형의 위치는 :"+circle.position());
		
		
	}

}
