package day09_extends.this_.baisc;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("길동홍",20);
		
		System.out.println(p);
		
		Person p3 = new Person();
		System.out.println(p3);
		
		Student s = new Student(null, 0, null);
		System.out.println(s.info());

		}

}
