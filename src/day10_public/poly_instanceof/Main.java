package day10_public.poly_instanceof;

public class Main {

	public static void main(String[] args) {

		// 상속에서 객체의 타입을 모를때 사용하는 메소드

		Person hong = new Student("홍길동", 20, "123");

		Person kim = new Teacher("김유신", 500, "역사");

		Person choi = new Employee("최강창민", 20, "음동");

		printInfo(hong);

	}

	public static void printInfo(Person p) {
		if (p instanceof Teacher) { // p의 객체타입이 Teacher라면 Teacher형태로 다운캐스팅해 자식의 메소드를 실행하게끔 한다 
			Teacher t = (Teacher) p;
			System.out.println(t.info());
		} else if ( p instanceof Student) {
			Student s = (Student) p;
			System.out.println(p.info());
		} else if ( p instanceof Employee) {
			Employee e = (Employee)p;
			System.out.println(e.info());
		}
	}

}
 
