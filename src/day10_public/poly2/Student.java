package day10_public.poly2;

public class Student extends Person {
	
	String studentid;


	public Student(String name, int age, String studentid) {
		super();
		this.name = name ;
		this.age = age;
		this.studentid = studentid;
	}


	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 학생번호 : " + studentid;
	}
	
	
}
