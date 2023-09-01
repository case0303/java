package day11.quiz;

public class GoldFish extends MarinAnimal implements Animal {

	@Override
	public void Sleep() {
		System.out.println("금붕어는 잠을 잡니다.");

	}

	@Override
	public void eat() {
		
		System.out.println("금붕어는 플랑크톤을 먹습니다.");

	}

}
