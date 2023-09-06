package day15.compare;

import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
		Employee e1 = new Employee("홍길동",20000);
		Employee e2 = new Employee("김일",30000);
		Employee e3 = new Employee("김이",70000);
		Employee e4 = new Employee("김삼",40000);
		
		//TreeSet,Map는 자동정렬하기 때문에 정렬할 수 있는 기준이 필요함
		//Comparator을 이용한 정렬 Comparator클래스 생성 이후 적용 - 생성자에 추가 
		TreeSet<Employee> list = new TreeSet<>(new EmployeeComparator());
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Employee s : list) {
			System.out.println(s);
		}
	}

}
