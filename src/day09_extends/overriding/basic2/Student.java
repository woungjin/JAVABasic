package day09_extends.overriding.basic2;

public class Student extends Person {
	
	String studentid;


	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 학생번호 : " + studentid;
	}
	
	
}
