package day07;

public class Pen {
	// 멤버변수
	public String color ;
	public int length;
	int price;
	/*
	 * **생성자는 반드시 클래스 안에 하나 이상 선언해야 합니다.
	 *   만약 선언 하지 않으면 JVM(자바 버츄얼 머신)이
	 *   대신해서 기본 생성자를 자동으로 만들어줌
	 * **기본 생성자는 매개변수를 가지지 않은 상태로, 자동으로 만들어지지 않는 경우
	 * 	 내용은 없음.
	 * 
	 * **생성자를 만드는 규칙
	 * 	1. 생성자 이름은 클래스 이름과 대소문자까지 정확히 같아야함
	 *     클래스 이름과 다른 이름으로 만들면 그것은 메서드 취급합니다.
	 *     
	 *  2. 생성자는 매서드와 달리 반환유형을 적지 않습니다.
	 *  3. 생성자는 다른 유형으로 여러개 생성이 가능합니다.(생성자 오버로딩)
	 */
	
	// 생성자
	public Pen(){ //기본 생성자
		color = "black";
	}
	// 멤버 초기화 생성자!
	public Pen(String init_color) {
		color = init_color;
	}
	
	public Pen(String init_color,int init_price) {
		color = init_color;
		price = init_price;
		System.out.println("생성자를 이용하여 color,price 값 초기화");
		
	}
	
	
	public Pen(String color, int length, int price) {
		this.color = color;
		this.length = length;
		this.price = price;
	}
	
	
	
	public void write() {
		System.out.println("hello world");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
}
