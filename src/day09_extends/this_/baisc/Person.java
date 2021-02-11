package day09_extends.this_.baisc;

public class Person {
	String name ;
	int age;

	Person(String name, int age )  {
		this.name = name;
		this.age = age;
		System.out.println(this.info());
	}
	
	Person(String name) {
		this.name = name;
		this.age = 1;
	}
	
	Person() { 
		super();
		this.name = "이름미정";
		this.age = 1;
	}
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age ;
	}
	 
	
	
	
} 
 
