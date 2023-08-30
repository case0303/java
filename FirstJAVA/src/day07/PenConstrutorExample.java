package day07;

public class PenConstrutorExample {

	public static void main(String[] args) {
		// 생성자 테스트
		Pen redPen = new Pen("red");
		System.out.println("펜의 색은"+redPen.color+"입니다.");
		
		Pen pen2 = new Pen("yellow",1000);
		System.out.println("펜의 색은"+pen2.color+"이고, \n"+"가격은 "+pen2.price+"원입니다.");
		
		Pen pen13 = new Pen();
		System.out.println(pen13.color);
	}

}
