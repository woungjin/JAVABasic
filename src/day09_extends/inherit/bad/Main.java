package day09_extends.inherit.bad;

public class Main {

	public static void main(String[] args) {
		
		
		Student s = new Student();
		s.age = 10 ;
		s.name = "홍길동";
		s.studentid = "!11";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.age = 30;
		t.name = "LOL"; 
		t.subject = "math";
		
	}

}
