package day09.polymorpshism;



public class Teacher extends Person {
	public String teacherId;
	public String subject;
	
	
	public Teacher() {
		//기본생성자 , super();
	}
	public Teacher (String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
	
	
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age+"\t교번: "+teacherId+"\t전공: "+subject;
	}
}
