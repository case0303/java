package day09.polymorpshism;

public class HetetoCollectionExample {

	public static void main(String[] args) {
		Person[] pArr = new Person[4];
		
		pArr[0] = new Person("홍씨",20);
		pArr[1] = new Student("홍학생",17,"2023","도술");
		pArr[2] = new Teacher("홍선생",22,"자바 프로그래밍");
		pArr[3] = new Empolyee("홍사원",23,"교무처");
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].getDetails());
		}
		
		for(Person p : pArr) {
			System.out.println(p.getDetails());
		}
		

	}

}
