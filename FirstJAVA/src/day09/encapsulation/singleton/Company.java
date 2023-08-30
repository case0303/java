package day09.encapsulation.singleton;

public class Company {
	
	//static을 사용하면 객체를 생성하지도 않아도 사용할 수 있다.
	private String str;
	private static Company c = new Company(); //1. Company 객체 멤버 생성
	
	private Company() {						  //2. 생성자를 private로 설정
		str = "company";
		System.out.println(str);
	}
	public static Company getCompany() {	  //3.public static을 통해서 객체 전달
		return c;
	}

}
