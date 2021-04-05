package Quiz02.quiz17_abstract_;

public class Rect extends Shape{

	private double side;
	
	public Rect(String name, double side) {
		super(name);
		this.side = side;
	}
	
	public double getArea() {
		return side*side;
	}
}
 
