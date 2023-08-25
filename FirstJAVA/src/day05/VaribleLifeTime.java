package day05;

public class VaribleLifeTime {

	int b = 8;
	
	public static void main(String[] args) {
		// 변수의 수명
		
		//{}블럭 내부에서 선언된 변수 지역 변수로 {}을 벗어나면 사라진다.
		//변수가 살아있는 범위를 변수의 영역(scope)이라고 부른다.
		//변수의 영역만 겹치지 않는다면 같은 이름의 변수를 사용할 수 있다.
		int b = 5;
		System.out.println("main method의 b : "+ b);
		VaribleLifeTime obj = new VaribleLifeTime();
		System.out.println("class의 b : "+obj.b);
		
		if(true) {
			int a = 10; //지역 변수
			System.out.println(a);
			a = 7;
		}
		
		for(int i=0; i<10; i++) {
			//내부의 i는 for문을 벗어나지 못한다.
		}
		int i = 10;
		
		
	}

}
