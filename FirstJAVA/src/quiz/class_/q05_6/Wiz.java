package quiz.class_.q05_6;

public class Wiz extends Player {
	
	
	public Wiz(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	
	public void skill02() {
		System.out.println("법사스킬");
	}
	@Override
	public void action() {
		System.out.println("----"+name+"----");
		System.out.println(name+"은 귀여운 동작을 합니다.");
	}
}
