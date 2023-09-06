package quiz.class_.q05_6;

public class War extends Player {
	
	public War(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	
	public void skill01() {
		System.out.println("전사스킬");
		
	}
	@Override
	public void action() {
		System.out.println("----"+name+"----");
		System.out.println(name+"은 강한 동작을 합니다.");
	}
}
