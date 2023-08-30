package day08.inheritance.goodcase;

import day08.inheritance.Person;

public class Student extends Person {
	public String studentId;
	public String major;
	
	public Student() {
		//기본생성자 , super();
	}
	public Student(String name, int age) {
		super(name, age);// 부모 클래스의 생성자를 불러서 사용 할 수 있다.
	}
	public Student(String name, int age, String studentId, String major) {
		this(name, age);
		this.studentId = studentId;
		this.major = major;
	}
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age+"\t학번: "+studentId+"\t전공: "+major;
	}
}
