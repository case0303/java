package day11.quiz;

public class Tiger extends LandAnimal implements Animal {

	@Override
	public void Sleep() {
		// TODO Auto-generated method stub
		System.out.println("호랑이는 잠을 잡니다.");
	}

	@Override
	public void eat() {
		System.out.println("호랑이는 고기를 먹습니다.");
	}

}
