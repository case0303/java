package day09.polymorpshism;



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
	
	public void study() {
		System.out.println(name+"은 공부합니다.");
	}
	@Override
	public String toString() {
	
		return "Student [name="+name+",age="+age+",학번="+studentId+",전공="+major+"]";
	}
}
