package quiz.class_.q07;

public class Main {

	public static void main(String[] args) {
		Calculator ca1 = new Calculator();
		ca1.add(1);
		System.out.println("ca1.result 누적값은 "+ca1.result);
		ca1.add(2, 3);
		System.out.println("ca1.result 누적값은 "+ca1.result);
		ca1.add(1, 2, 3);
		System.out.println("ca1.result 누적값은 "+ca1.result);
		ca1.add(1, 2, 3, 4);
		System.out.println("ca1.result 누적값은 "+ca1.result);
	}

}
