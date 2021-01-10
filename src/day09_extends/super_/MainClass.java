package day09_extends.super_;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("이름1", 1);
		Person p2 = new Person("이름2", 2);
		Person p3 = new Person("이름2", 2);
		
		Person[] arr = {p1,p2,p3};
		House h = new House();
		h.getIn(arr);
		h.print();

		float a = 1.111111111f;
		double a2 = 1.111111111;
		System.out.println(a);
		System.out.println(a2);
		
		
		
	}

}
