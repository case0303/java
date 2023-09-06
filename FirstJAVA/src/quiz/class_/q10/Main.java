package quiz.class_.q10;

public class Main {

	public static void main(String[] args) {
		
		War me = new War("나는 전사");
		
		War player2 = new War("적 전사");
		Wiz player3 = new Wiz("적 법사");
		
		
		System.out.println("전사 스킬 쓴다");
		
//		me.bash(player2);
//		me.bash(player3);
//		me.bash(player2);
//		me.bash(player3);
//		me.bash(player2);
//		me.bash(player3);
//		me.info();
//		player2.info();
//		player3.info();
		Player[] list = {player2,player3};
		
		Wiz me2 = new Wiz("나는 법사");
		
		me2.blizard(list);
		me2.blizard(list);
		me2.blizard(list);
		me2.blizard(list);
		me2.blizard(list);
		player2.info();
		player3.info();
		
	}

}
