package day09_extends.this_.baisc;

public class Employee extends Person{
	
	
	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}


	String department;

	
	String info() {
		return super.info() + ", 부서 : " + department;
	}
}
 
 
