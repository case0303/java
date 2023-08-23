package day02_.cal;

public class BitNotExample {

	public static void main(String[] args) {
		// ~ : 2진수 각 비의 0,1을 반전 . 0->1 1->0
		byte bitData = 0b0000_1000; //10진수 8
		System.out.println(bitData); //8
		System.out.println(~bitData); // 0b1111_0111; ~은 반전시킨다.
		System.out.println((byte)0b1111_0111); 
		// ! 논리값(true,false)을 반전
		boolean isTrue = false;
		System.out.println(!isTrue);
		
	}

}
