package day09.polymorpshism;

public class PolymorphismExample {

	public static void main(String[] args) {
		// 다형성 테스트
		Person p = new Student("홍학생", 17, "20230001", "도술");
		p.walk(); //부모 클래스인 Person에 있는 메서드
		//p.study(); // p는 다형적 객체 이므로 부모 클래스에 있는 메서드만 사용할 수 있습니다.
		Student casting = (Student)p;
		//study()는 Student만 가진 메서드로 캐스팅을 통해서 변환후 사용가능
		casting.study();
		
	}

}
