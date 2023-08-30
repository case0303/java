package day08.objectClass;

import day08.inheritance.Person;

public class ObjectExample {

	public static void main(String[] args) {
		//오브젝트는 재정의해서 사용
		Object obj = new Object();// 최상위 객체
		obj.hashCode(); //객체 동등 비교를 위해서
		obj.equals(obj); //객체 동등 비교를 위해 재정의
		obj.toString(); //기본적으로 클래스명 @hashcode 값으로 출력
						//재정의해서 객체 내의 정보를 확인하는 용도로 사용
		Person p1 = new Person(20,"홍길동");
		Person p2 = new Person("홍길동", 20,185.0f);// 둘이 값이 다르다.
		System.out.println("p1의 hashcode 값 :"+p1.hashCode());
		System.out.println("p2의 hashcode 값 :"+p2.hashCode());
		System.out.println("p1과 p2의 비교 결과 :"+(p1.hashCode() == p2.hashCode()));//하지만 같다고 나온
		
		// 위 아래의 해쉬값이 다르다.
		
		day08.inheritance.overriding.Person o1 = new day08.inheritance.overriding.Person();
		day08.inheritance.overriding.Person o2 = new day08.inheritance.overriding.Person();
		System.out.println("o1의 hashcode 값 :"+o1.hashCode());
		System.out.println("o2의 hashcode 값 :"+o2.hashCode());
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.toString());
		System.out.println(p1);
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime
//		return super.hashCode();
//	}
	

}
