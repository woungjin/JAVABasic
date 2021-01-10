package Quiz02.quiz17_abstract_;

public class MainClass {

	public static void main(String[] args) {
	
		Shape s1 = new Circle("circle",2);
		System.out.println(s1.getName());
		System.out.println(s1.getArea());
		
		Shape s2 = new Rect("rect", 5);
		System.out.println(s2.getName());
		System.out.println(+s2.getArea());
	}

}
