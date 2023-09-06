package day15.compare.quiz;

import java.util.TreeSet;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("박지성",1000);
		Member m2 = new Member("박지성",1001);
		Member m3 = new Member("박지성",1002);
		Member m4 = new Member("박지성",1003);
		Member m5 = new Member("박지성",1004);
		Member m6 = new Member("박지성",1005);
		Member m7 = new Member("박지성",1006);

		TreeSet<Member> list = new TreeSet<Member>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		
		for(Member s : list) {
			System.out.println(s);
		}
	}

}
