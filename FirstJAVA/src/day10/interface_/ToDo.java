package day10.interface_;


//인터페이스끼리 다중 상속이 가능
//가장 하위 인터페이스를 구현할 경우 상속 관계에 있는 인터페이스들의
//모든 메서드를 구현해야함.



public class ToDo implements IToDo3, IToDo4 {

	@Override
	public void m1() {
		System.out.println("m1() 구현");
	}

	@Override
	public void m2() {
		System.out.println("m2() 구현");

	}

	@Override
	public void m4() {
		System.out.println("m4() 구현");

	}

	@Override
	public void m3() {
		System.out.println("m3() 구현");

	}

}
