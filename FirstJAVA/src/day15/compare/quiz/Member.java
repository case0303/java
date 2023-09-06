package day15.compare.quiz;

public class Member implements Comparable<Member>  {

	String name;
	int num;
	
	
	public Member () {
		
	}


	public Member(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+num;
	}
	
	@Override
	public int compareTo(Member o) {
		// 메서드 사용법 매개 변수로 비교 대상을 전달
		// - 현재 인스턴스와 o의 자리를 바꾸고 싶을 경우 1
		// - 현재 인스턴스와 o의 자리를 그대로 유지하고 싶다면 -1
		// - 현재 인스턴스와 o와 같은 경우 0
		int next = o.num;
		System.out.println(num+"vs"+next);
		return 0;
	}
	
}
