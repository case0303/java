package day05.quiz;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		// numArr의 들의 총합과 평균을 구해서 출력하시오.
		int[][] numArr = {
					{5, 5, 5, 5, 5},
					{10, 10, 10, 10, 10},
					{20, 20, 20},
					{30, 30, 30}			
				};
				
		int sum=0;
		int cut=0;
		
		for(int i =0; i<numArr.length; i++) {
			for(int j = 0; j<numArr[i].length; j++) {
				sum += numArr[i][j];
				cut++;
			}
		}
		
		float average = (float) sum/cut;
		
		System.out.println("총합 : "+ sum);
		System.out.println("평균 : "+ average);
		
		
		
	}

}
