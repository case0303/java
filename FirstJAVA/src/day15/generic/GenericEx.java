package day15.generic;

import java.util.ArrayList;

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		ArrayList<String> genericList = new ArrayList<>();
		
		list.add("first");
		list.add("second");
		list.add("thirt");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		
		genericList.add("first");
		genericList.add("second");
		genericList.add("thirt");
		//제너릭을 사용하면 지정된 타입 이외에 다른 타입은 저장할 수 없음
		//genericList.add(new Integer(4)); 스트링으로 선언했기 때문에 처리할 수 없음
		
		String s1 = (String)list.get(0);//형변환을 해주면 사용가능
		
		String s2 = genericList.get(0);
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		for(String s : genericList) {
			System.out.println(s);
		}
		
		
	}

}
