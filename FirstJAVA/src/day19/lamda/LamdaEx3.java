package day19.lamda;

public class LamdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamdaInterface3 il3 = (String name) -> {
			System.out.println("제 이름은 "+ name + "임");
		};
		
		
		LamdaInterface3 il32 = name -> {
			System.out.println("제 이름은 "+ name + "임");
		};
		
		
		il3.print("홍길동");
		
		il32.print("우짤램");
		
		
	}

}

@FunctionalInterface
interface LamdaInterface3 {
	void print(String name);
	//void print();
}