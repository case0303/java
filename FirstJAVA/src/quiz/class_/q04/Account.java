package quiz.class_.q04;
	/*
	 *  1. 멤버 변수- 예금주이름(name : String), 비밀번호(password : int), 잔액(balace: int) 로 선언하세요.
		2. 생성자 - 3가지 멤버 변수를 모두 매개값으로 받아 초기화하는 생성자를 선언하세요.
		3. 메서드 - 입금기능 메서드(deposit : void), 출금기능 메서드(withDrwa: void), 잔액 조회 메서드(getbalance: int)
	 */
public class Account {
	String name;
	int password;
	int balace;
	
	public Account() {
		
	}
	public Account(String name,int password,int balace) {
		this.name = name;
		this.balace = balace;
		this.password = password;
	}
	
	public void deposit(int amt) {
		//입금 : 추가 받는 기능
		//잔액에 금액을 추가시키는 기능
		balace=balace+amt;
	}
	public void withDrwa(int min) {
		// 출금 : 값을 뺴는 기능
		// 잔액에서 금액을 빼는 기능
		if(min > balace) {
			System.out.println("잔고가 부족합니다.");
		}else {
			balace=balace-min;
		}
		
		
	}
	public void getbalance() {
		System.out.println("잔액은 : "+balace+"입니다.");
		if (balace < 0) {
			System.out.println("잔고가 마이너스입니다.");
		}
		
	}
	
}
