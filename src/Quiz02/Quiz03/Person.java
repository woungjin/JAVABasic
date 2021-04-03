package Quiz02.Quiz03;

public class Person {

	String name;
	int age;
	int tall;

	Person(String name, int age, int tall) {
		this.name = name;
		this.age = age;
		this.tall = tall;
	}

	Person(){};
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키 : " + tall);
	}

}
 
