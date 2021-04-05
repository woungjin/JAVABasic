package Quiz02.quiz17_abstract_;

public class Circle extends Shape {

	private int radius;
	public static final double PI = 3.14;
	
	public Circle(String name , int radius) {
		super(name);
		this.radius = radius;
		
		
	}
	public double getArea() {
		return radius*radius*PI;
	}
	
}
 
