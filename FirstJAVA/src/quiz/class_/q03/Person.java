package quiz.class_.q03;

public class Person {
	String name;
	int age;
	int height;
	public Person() {
		
	}
	public Person(String name,int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	void info() {
		System.out.println("이름 : "+name+"\n나이 : "+age+"세"+"\n키 : "+height);
	}
}
