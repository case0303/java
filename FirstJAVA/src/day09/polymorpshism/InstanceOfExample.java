package day09.polymorpshism;

public class InstanceOfExample {

	public static void main(String[] args) {
		Student s = new Student("홍1", 1, "1","a");
		prictPersonInfo(s);
		Teacher t = new Teacher("홍2", 2, "b");
		prictPersonInfo(t);
		Empolyee e = new Empolyee("홍3", 3,"c");
		prictPersonInfo(e);
	}
	
	public static void prictPersonInfo(Person p) {
		if(p instanceof Student) {
			System.out.println("s info");
		}else if(p instanceof Teacher) {
			System.out.println("t info");
		}else if(p instanceof Empolyee) {
			System.out.println("e info");
		}else {
			System.out.println("p info");
		}
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("--------------------------");
	}

}
