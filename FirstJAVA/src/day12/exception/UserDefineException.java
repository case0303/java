package day12.exception;

//멤버 클래스 (데이터를 저장하는 용도의 객체를 생성을 위한 클래스)
class Member{
	String name;
	String phone;
	String address;
	public Member(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
}

//기능은 멤버 관리 클래스

public class UserDefineException {

	public static void main(String[] args) {
		UserDefineException memberManager = new UserDefineException();
		try {
			memberManager.insert(new Member("홍길동", "010-1223-3827", "서울시 마포구"));
		} catch (DuplicateKeyException e) {
			System.out.println(e.toString());
		}
		

	}
	
	public void insert(Member member)throws DuplicateKeyException{
		System.out.println("고객 정보를 저장합니다.");
		System.out.println(member.name + "님의 정보");
		//DB에 홍길동 010-1223-3847이라는 정보가 있다고 간주 했을때
		if("홍길동".equals(member.name) && "010-1223-3847".equals(member.phone)) {
			//이 경우에는 DB에 이미 정보가 있는 경우로 간주
			//예외를 발생시켜 insert 메서드 호출한 곳으로 데이터가 중복됨을 알려줘야함
			
			//예외 강제로 발생
			
			throw new DuplicateKeyException("데이터가 중복 됩니다.");
		} else {
			System.out.println("데이터 베이스에 저장되었습니다.");
		}
	}
	
	
}



class DuplicateKeyException extends Exception{
	public DuplicateKeyException(String messege) {
		super(messege);
	}
}

