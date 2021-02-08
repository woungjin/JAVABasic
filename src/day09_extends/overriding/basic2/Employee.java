package day09_extends.overriding.basic2;

public class Employee extends Person{
	String name;
	int age;
	String department;

	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 부서 : " + department;
	}
}
 
