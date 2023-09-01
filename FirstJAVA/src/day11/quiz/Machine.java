package day11.quiz;

public class Machine {
	
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void machineWork(Remocon remocon, Machine machine) {
		remocon.on(); //리모콘 온 메서드
		remocon.off(); //리모콘 오프 메서드
	}
	
	
	
	
	
	
}
