package day14.generic.good2;

public class ITBank {

	// 제네릭 클래스를 매개변수로 받을 수 있는 메소드
	// 매개변수로 제네릭을 받는방법
	// - 정확한 매개변수를 입력해주는것이 좋다
	public void info(Course<Student> t) {
		String num1 = t.getNum();
		Student s = t.getStudent();

		System.out.println("번호 : " + num1 + ", 이름 : " + s.getName());

	}

	// 제네릭 클래스를 반환하는 유형으로 돌려주는 메소드

	public /* <V> */ Course<Student> get() {

		Student s = new Student();
		s.setAge(10);
		s.setName("홍길동");
		Course<Student> c = new Course<>();
		c.setNum("1");
		c.setStudent(s);
		
		return c;
		
//		return new Course<Student>();
	}

}
