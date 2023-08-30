package day08.inheritance;
/*
 * 상속(Inheritance)
 * - 상속은 기존의 클래스를 확장하여 새로운 클래스를 이끌어 내는 것을 의미함
 * - 기존의 코드를 재사용함으로써 불필요한 코드 재작성을 줄여줌
 * - 단일 상속만 가능(상속은 하나의 부모 클래스만 가질 수 있음) -> 인터페이스 다중 상속이 가능함
 * - 키워드 extends를 사용하여 상속을 표현
 * - 부모(super)클래스의 멤버(변수,메서드)를 자식(sub) 클래스에서 사용이 가능함.
 * - 생성자는 상속이 안됨.
 * - Sub Class "is a" Super Class
 * -> ex) 말은 extends 포유류 -> 말은 is a 포유류
 * - has a 관계 
 * -> 객체가 멤버를 가지고 있다.
 * -> class NameCard{
 * 		String name;
 * 		int size;
 * 	} 일 경우 NameCard has a name
 * 
 * - object 클래스는 최상위 클래스입니다.
 * - final 클래스는 상속이 불가능합니다.
 * - abstract 클래스는 반드시 상속해서 사용해야함.
 * 
 * 
 * 상속 : Bad case 와 good case가 있다.
 *  Bad
 * -> 개별 클래스들이 중복된 속성/ 기능을 포함하는 경우
 * 	good
 * -> 중복된 기능을 빼네 새로운 클래스로 작성한 후 구체화 시킴
 * -> 일반화 된 클래스는 부모 클래스
 * -> 구체화 된 클래스는 자식 클래스
 * -> extends 클래스를 사용
 * 
 */
public class Person {

	public String name;
	public int age;
	protected float height;
	float weight;
	
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age;
	}
	
		// 부모인 Person의 생성자 만들기
		// 반환 값, 이름 , 매개변수의 타입(순서)
	
		public Person (int age, String name){ //Person(int,String)
			this.name = name;
			this.age = age;
		}
		public Person (String name, int age){ //Person(String,int)
			this.name = name;
			this.age = age;
		}
		public Person() {
			this("이름없음",1);
		}
		
		public Person(String name) {
			this(name,1);
		}
		
		public Person(String name, int age, float height) {
			this(name,age);
			this.height = height;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null)? 0:name.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			// 두개의 객체정보를 비교해보고 서로 같은지 확인함
			if(this == obj) { // 동일한 객체
				return true;
			}
			if(obj == null) return false;
			if(getClass() != obj.getClass()) return false;// 객체 생성 클래스 확인
			Person other = (Person)obj;
			if (age != other.age) return false;
			if (name == null) {
				if(other.name != null) {
					return false;//객체내의 이름확인
				}
			}else if(!name.equals(other.name)) return false;
			
			return true;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Person[name="+name+",age="+age+"]";
		}
	
	
}
