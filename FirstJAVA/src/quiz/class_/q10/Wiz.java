package quiz.class_.q10;

public class Wiz extends Player{
	
	
	public Wiz(String name) {
		this.name = name;
		this.hp = 500;
		this.mp = 1000;
		
	}
	
	public void iceArrow() {
		System.out.println("얼음 화살을 사욜합니다.");
	}
	
	public void blizard(Player[] p) {
		int hit = 0;
		
		System.out.println("---------------");
		System.out.println(this.name+"님의 눈보라 시전");
		for(Player pl : p)
		{	
			hit = (int)(Math.random()*6+10);
			System.out.println(pl.name+"님이 "+hit+" 피해를 입었습니다.");
			pl.hp -= hit;
			
			
		}
		System.out.println("---------------");
	}

}
