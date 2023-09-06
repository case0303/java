package day12.exception;

public class RunTimeExceptionEx {
	
	public static int makeException1(int input) {//ArithmeticException
		int divide = 0;
		int result = input/divide;
		return result;
	}
	
	
	public static void makeException2() {//StringIndexOutOfBoundsException
		String s = "가";
		System.out.println(s.charAt(1));
	}
	
	public static void makeException3() throws Exception {//ArrayIndexOutOfBoundsException
		int[] a = {1,2,3};
		System.out.println(a[3]);
	}
	public static void makeException4() {//NullPointerException
		String nothing = null;
		System.out.println(nothing.split(""));
	}
	public static void makeException5() {//NumberFormatException
		String notInt = "가나다";
		int a= Integer.parseInt(notInt);
	}
	public static void makeException6() {//StackOverFlowError
		for(int i =0; i <Integer.MAX_VALUE; i++) {
			makeException6();
		}
	}
	public static void makeException7() {//ArrayStoreException
		Object[] objArr = new String[3];
		objArr[0]= 0;//선언자체가 오브젝트로 되어있기 떄문에 컴파일 오류를 발생하지 않는다.
	}
	public static void makeException8() {//ClassCastException
		Object[] objArr = new String[3];
		objArr[0] = "0";
		Integer a = (Integer) objArr[0];// 스트링형을 인티저로 변환하려니 문제가 생김
	}

	public static void main(String[] args) throws Exception {
		// Runtime Exception - Unchecked Exception
		
		try {
			makeException1(5);
			makeException2();
			makeException3();
			makeException4();
			makeException5();
			makeException6();
			makeException7();
			makeException8();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
