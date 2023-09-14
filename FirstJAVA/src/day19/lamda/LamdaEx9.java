package day19.lamda;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LamdaEx9 {
	
	
	static Student[] list= {
			new Student ("홍길동", 90, 80, "컴공"),
			new Student ("홍길이", 99, 88, "동공"),
			new Student ("홍길삼", 29, 28, "대공")
	};

	public static void main(String[] args) {
		// Operator 인터페이스는 Function 하위 인터페이스
		System.out.print("최대 수학 점수 : ");
		int max = maxOrMinMath((a, b) -> {
            if (a >= b) return a;
            else return b;
        });
		
		System.out.println(max);
		
		System.out.print("최소 수학 점수 : ");
		int min = maxOrMinMath((a,b) -> (a<=b?a:b));
		System.out.println(min);
		
		
		System.out.print("최대 평균점수 :");
		System.out.println(maxOrMinAvg((a,b) -> (a>=b?a:b)));
		System.out.print("최소 평균점수 :");
		System.out.println(maxOrMinAvg((a,b) -> (a<=b?a:b)));
		
		

	}
	// 두 개의 int 값을 연산하여 int 값을 리턴
	static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
				
		return result;
	}
	// 두 개의 double 값을 연산하여 double값을 리턴
	static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath()+ list[0].getEng()) /2.0;
		for(Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng())/2.0);
		}
				
		return result;
	}

}
