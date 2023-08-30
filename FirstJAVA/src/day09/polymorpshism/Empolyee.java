package day09.polymorpshism;



public class Empolyee extends Person {
		public String companyId;
		public String department;
		
		public Empolyee() {
			//기본생성자 , super();
		}
		public Empolyee (String name, int age, String department) {
			super(name,age);
			this.department = department;
		}
		
		public String getDetails() {
			return "이름: "+name+"\t나이: "+age+"\t사번: "+companyId+"\t부서: "+department;
		}
}
