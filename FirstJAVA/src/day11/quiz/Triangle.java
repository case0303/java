package day11.quiz;

public class Triangle extends Shape {
	private int z;
//	private int y;
	
	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;
		z=0;//기본 값은 원점
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (x-z)*(y-z)/2;
	}

	
	
}
