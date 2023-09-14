package day20.stream;

public class Ractangle extends Shape {
	
	
	//필드
	int w,h;
	
	//생성자
	public Ractangle() {
		this(1,1);
	}
	
	public Ractangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	


	@Override
	double area() {
		
		return w*h;
	}

	@Override
	double length() {
		return (w+h)*2;
	}

	@Override
	public String toString() {
		
		return "넓이 :" +this.area()+",둘레 : "+this.length();
	}
	
	
	
	
}
