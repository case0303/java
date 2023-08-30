package day08.inheritance;

import day08.inheritance.goodcase.Empolyee;
import day08.inheritance.goodcase.Student;

public class InheritanceExample {

	public static void main(String[] args) {
		

//		Person  p = new Person();
//		p.name = "홍길동";
//		p.age = 25; 
//		p.height = 179.8f; // protected
//		p.weight = 70f;	// default
		Person p = new Person("홍길동", 25, 179.8F);
		System.out.println(p.getDetails());
		
//		Student s = new Student();
//		s.name = "이순신";
//		s.studentId = "20230828";
		Student s = new Student("이순신", 30, "20230828", "해양학과");
//		s.major = "해양학과";
//		s.height = 186f;
//		s.weight   접근제한자가 default이기 때문에 자식이 상속 받지 못함
		System.out.println(s.getDetails());
		Student s2 = new Student();
		System.out.println(s2.getDetails());
		
		Empolyee e = new Empolyee();
		e.name = "이름";
		e.age = 45;
		e.companyId = "20230828";
		e.department = "강사부";
		System.out.println(e.getDetails());
		
		
		
		/*
		 * this와 super
		 * - this
		 * > this는 현재 객체 (자기자신)
		 * 
		 * - this.
		 * > 변수 또는 메서드를 참조
		 * 
		 * - this.name
		 * > 자기 자신의 name 멤버 참조
		 * 
		 * - this.go()
		 * > 자기 자신의 go () 메서드 참조
		 * 
		 * - this()
		 * > 자기 자신 클래스 내의다른 생성자를 참조
		 * > this(); => 기본생성자를 불러움
		 * > this("hello") => 생성자 호출, 인자 값을 처리하는 생성자
		 * 
		 * - super
		 * > super는 현재 객체의 부모 객체, 한단계 위 부모를 의미함.
		 * 
		 * - super.
		 * > 부모의 변수 또는 메서드를 참조 합니다.
		 * > super.name, super.go()등등
		 * 
		 * - super()
		 * > 부모의 생성자를 참조
		 * super(10,20), super("hello")등등
		 */
			
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}






