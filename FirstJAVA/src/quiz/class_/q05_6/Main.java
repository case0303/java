package quiz.class_.q05_6;

public class Main {

	public static void main(String[] args) {
		War war = new War("전사", 1,1);
		Wiz wiz = new Wiz("법사",1,2);
		
		war.info();
	    war.skill01();
	    war.action();
		wiz.info();
	    wiz.skill02();
	    wiz.action();
	}

}
