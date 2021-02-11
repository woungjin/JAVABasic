package day10_public.poly_instanceof;

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
 
