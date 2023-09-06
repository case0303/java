package quiz.class_.q10;

public class War extends Player{
	
	
	
	public War(String name) {
		this.name = name;
		this.hp = 1000;
		this.mp = 500;
	}
	public void bash(Player a) {
		if(this.mp < 100) {
			System.out.println("사용할 MP가 부족합니다.");
			
		}else {
			this.mp -= 100;
			System.out.println(name+"님 배쉬 스킬 적중");
			a.hp -= 100;
		}
		
	}
	
}
