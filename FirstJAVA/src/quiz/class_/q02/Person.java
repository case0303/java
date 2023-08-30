package quiz.class_.q02;

public class Person {
	String name;
	int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	void info() {
		System.out.println("이름 : "+name+"\n나이 : "+age+"세");
	}
}
