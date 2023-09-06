package day15.compare;

import java.util.HashSet;
import java.util.TreeSet;

public class ObjectEqualsEx {

	public static void main(String[] args) {
		
		// 객체간의 동등 비교
		
		Dog d1 = new Dog("진돗개", "뽀삐", 15);
		Dog d2 = new Dog("말티즈", "삐삐", 5);
		Dog d3 = new Dog("진돗개", "뽀삐", 15);
		
		//Dog d3 = d1;
		System.out.println(d1 == d3); // 정보는 같지만 서로 같은건 아니다.
		System.out.println(d1.equals(d3)); //equals로 서로 값을 비교
		System.out.println(d1);
		System.out.println(d3);
		
		// hashSet은 동등 비교를 통해서 같은 객체인지 아닌지 비교
		HashSet<Dog> set = new HashSet<Dog>();
		System.out.println(set.add(d1));
		System.out.println(set.add(d3));
//		for(Dog dog : set) {
//			System.out.println(dog);
//		}

		TreeSet<Dog> tset = new TreeSet<>();
		System.out.println(tset.add(d1));
		System.out.println(tset.add(d2));
		for(Dog dog : tset) {
			System.out.println(dog);
		}
		
		
		
		
		
	}

}
