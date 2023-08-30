package day10.interface_;

public class Triangle implements Shape {
	int width;
	int height;
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
		
	
	@Override
	public double getArea() {
		//width x height;
		return width * height / 2;
	}

}
