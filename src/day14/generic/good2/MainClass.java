package day14.generic.good2;

public class MainClass {

	public static void main(String[] args) {
		
		// itbank안에 두가지 메소드를 사용 
		
		Course<Student> c = new Course<>();

		ITBank it = new ITBank();
		c.setNum("1");
		c.setStudent(new Student("홍길동",20));

		it.info(c);
		
		Course<Student> c1 = it.get();
		System.out.println("번호 : " + c1.getNum() + " , 이름 : " + c1.getStudent());
		
		System.out.println("1+2");
	}
}
