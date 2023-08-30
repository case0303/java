package day09.polymorpshism;

public class PolymorpshismExample2 {

	public static void main(String[] args) {
		Person p;
		
		p = new Teacher("홍사원", 23, "교무처");
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Empolyee);
		System.out.println(p.getDetails());
		
		p.walk();
	}

}
