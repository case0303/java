package day11.quiz;

public class Dog extends LandAnimal implements Animal {

	@Override
	public void Sleep() {
		System.out.println("개는 잠을 잡니다.");

	}

	@Override
	public void eat() {
		System.out.println("개는 사료를 먹습니다.");

	}

}
