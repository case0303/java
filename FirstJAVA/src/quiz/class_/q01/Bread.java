package quiz.class_.q01;

public class Bread {
	
 int price;
 String name;
 
 public Bread(String name, int price) {
	this.name = name;
	this.price = price;
}
void info() {
	System.out.println("이름 : "+name+"\t가격 : "+price);
}
 
}
																