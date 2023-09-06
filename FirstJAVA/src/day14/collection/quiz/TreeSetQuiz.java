package day14.collection.quiz;

import java.util.TreeSet;

public class TreeSetQuiz {

	public static void main(String[] args) {
		// 트리셋을 이용하여 로또 번호 6개를 생성하는 프로그램을 작성하세요.
		// TreeSet을 생성하세요.
		// 무한 루프를 사용하여 1~45까지의 난수를 발생시키세요.
		// 발생한 난수를 추가합ㄴ디ㅏ.
		// 크기가 6이 되면 무한 루프를 빠져 나옵니다.
		
		
		TreeSet<Integer> ts = new TreeSet<>();
		//무한루프
		int hit = 0;
		
		
		while(true) {
			hit = (int)(Math.random()*45+1);
			
			
			ts.add(hit);
			if(ts.size() ==6) { // 힛할 때마다 카운트 난수를 따로 만들어 6되면 멈추게 할수있음
				break;
			}
			
		}
		System.out.println(ts);
		
	}

}
