package day08.inheritance.overriding;

public class Student extends Person {
	protected String studentId;
	protected String major;
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "이름: "+name+"\t나이: "+age+"\t학번: "+studentId+"\t학과"+major;
	}
}


// overriding이란 ?
// 부모 클래스로부터 상속 받은 메서드를 자식 클래스에서 행위를 바꾸거나 보완하기 위해서
// 다시 정의해서 사용하는 것
// 재정의 규칙
// - 상속을 전제로함
// - 리턴 타입, 메서드 이름, 파라미터 변수 선언이 일치해야함.
// - 접근 제한자는 같거나 more public 해야함