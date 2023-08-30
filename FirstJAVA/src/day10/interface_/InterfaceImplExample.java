package day10.interface_;



/*
 * 인터페이스 정리
 * - 단일 상속 문제점을 해결 할 수 있음
 * - 인터페이스 메서드는 추상 메서드이여야함
 * - 인터페이스의 변수는 자동으로 상수가 됩니다.
 * - implements 인터페이스 구현
 * - 인터페이스를 여러개 implements 할 수 있습니다.
 * - 인터페이스는 다른 인터페이스를 여러개를 extends 할수 있다.
 * ! 기능의 명세를 위해서 사용합니다.
 */
public class InterfaceImplExample {

	public static void main(String[] args) {
		ToDo todo = new ToDo();
		IToDo3 itodo3 = todo; //다형성이 적용됨
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
//		itodo3.m4();  ITodo3은 1,2만 상속 받았기 떄문에 m4가 없음
		IToDo4 itodo4 = todo;
		itodo4.m4();
	}

}
