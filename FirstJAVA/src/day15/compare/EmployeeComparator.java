package day15.compare;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
	
		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.name.compareTo(o2.name);//이름을 기준으로 정렬
			//return o1.salary.compareTo(o2.salary);//급여를 기준으로 정렬
		}
		
}
