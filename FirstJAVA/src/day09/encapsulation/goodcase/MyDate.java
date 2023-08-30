package day09.encapsulation.goodcase;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	
	
	//getter
	public int getDay() {
		return day;
	}
	//setter: 입력값검증
	public void setDay(int day) {
		
//		if(day > 31) {
//			day = 1;
//		}
		
		if((day<1)||(day >31)) {
			System.out.println("잘못된 날짜 입력입니다.");
			this.day = 1;
		}else {
			this.day = day;
		}
		
		
	}
	
	
	
	
}
